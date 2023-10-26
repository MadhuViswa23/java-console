package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Patient {

    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in);
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "madhu@2020")) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement st = connection.createStatement();

            System.out.println("___________________________________________________________________________________________________________________________");
            System.out.println("\n                                      " + "HOSPITAL MANAGEMENT SYSTEM \n");
            System.out.println("___________________________________________________________________________________________________________________________");
            System.out.println("\n                                      " + "Welcome to our hospital \n");
            System.out.println("___________________________________________________________________________________________________________________________");

            System.out.println("\n          Choose the option \n");
            System.out.println("______________                         ______________                      ___________________      ");

            System.out.println("1 . PATIENT                            2 . DOCTOR                          3. Appointment Management");
            System.out.println("______________                         ______________                      ___________________      ");
            int choose = scanner.nextInt();
            scanner.nextLine(); 

            if (choose == 1) {
                System.out.println("\n1 . REGISTER PATIENT                              2 . VIEW PATIENT DETAILS\n");
                System.out.println("________________________                            ____________________________");
                int option = scanner.nextInt();
                scanner.nextLine(); 

                if (option == 1) {
                    System.err.println("               REGISTER PATIENT FORM"
                            + "\n               -------------\n");
                    System.out.println("Enter Patient's Full Name ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Patient's Age ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Enter Patient's Gender ");
                    String gender = scanner.nextLine();
                    System.out.println("Enter Patient's Medical Condition ");
                    String medicalCondition = scanner.nextLine();
                    
                    String query = "INSERT INTO patients(patient_name, age, gender, medical_condition) VALUES (?, ?, ?, ?)";
                    try (java.sql.PreparedStatement insertStatement = connection.prepareStatement(query)) {
                        insertStatement.setString(1, name);
                        insertStatement.setInt(2, age);
                        insertStatement.setString(3, gender);
                        insertStatement.setString(4, medicalCondition);

                        int pat = insertStatement.executeUpdate();

                        if (pat > 0) {
                            System.out.print("Patient details are processing...");
                            for (int k = 1; k <= 10; k++) {
                                System.out.print(".");
                                Thread.sleep(1000);
                            }
                            System.out.println("\nPatient registered successfully");
                            System.out.println("____________");
                        } else {
                            System.err.println("Unable to process");
                        }
                    }
                }

             else if (option == 2) {
                 
                    ResultSet patientsRS = st.executeQuery("SELECT * FROM patients");
                    System.out.println("\nPatient Details:");
                    System.out.println("+---------+------------------------+-----+-------+----------------------------+");
                    System.out.println("| Patientid |        Patient Name            | Age | Gender|   Medical Condition        |");
                    System.out.println("+---------+------------------------+-----+-------+----------------------------+");
                    while (patientsRS.next()) {
                        int patientID = patientsRS.getInt("patient_id"); 
                        String patientName = patientsRS.getString("patient_name"); 
                        int patientAge = patientsRS.getInt("age");
                        String patientGender = patientsRS.getString("gender");
                        String patientMedicalCondition = patientsRS.getString("medical_condition");
                        System.out.format("| %-7d | %-22s | %-3d | %-5s | %-23s |\n", patientID, patientName, patientAge, patientGender, patientMedicalCondition);
                        System.out.println("+---------+------------------------+-----+-------+----------------------------+");
                    }
                }
            } else if (choose == 2) {
             
                System.out.println("Doctor Management Options:");
                System.out.println("1. Add Doctor");
                System.out.println("2. View Doctors");
                int doctorOption = scanner.nextInt();
                scanner.nextLine();

                if (doctorOption == 1) {
                    System.out.println("Enter Doctor's Name:");
                    String doctorName = scanner.nextLine();
                    System.out.println("Enter Doctor's Specialization:");
                    String doctorSpecialization = scanner.nextLine();

                    String insertDoctorQuery = "INSERT INTO doctors(doctor_name, specialization) VALUES (?, ?)";
                    try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(insertDoctorQuery)) {
                        preparedStatement.setString(1, doctorName);
                        preparedStatement.setString(2, doctorSpecialization);
                        int addedDoctor = preparedStatement.executeUpdate();

                        if (addedDoctor > 0) {
                            System.out.println("Doctor added successfully!");
                        } else {
                            System.err.println("Unable to add the doctor.");
                        }
                    }
                } else if (doctorOption == 2) {

                    ResultSet doctorRS = st.executeQuery("SELECT * FROM doctors");
                    System.out.println("\nDoctor Details:");
                    System.out.println("+---------+------------------------+----------------------------+");
                    System.out.println("| Doctor_id  |        Doctor Name            |   Specialization |");
                    System.out.println("+---------+------------------------+----------------------------+");
                    while (doctorRS.next()) {
                        int doctorID = doctorRS.getInt("doctor_id"); 
                        String doctorName = doctorRS.getString("doctor_name");
                        String doctorSpecialization = doctorRS.getString("specialization");
                        System.out.format("| %-7d | %-22s | %-18s |\n", doctorID, doctorName, doctorSpecialization);
                        System.out.println("+---------+------------------------+---------------------+");
                    }
                }
            } else if (choose == 3) {
               
                System.out.println("1. Appointments status");
                System.out.println("2. View All Appointments");
                int appointmentOption = scanner.nextInt();
                scanner.nextLine(); 

                if (appointmentOption == 1) {
                    System.out.println("Appointment booked successfully!");

                   
                    ResultSet totalAppointmentsRS = st.executeQuery("SELECT COUNT(*) AS totalAppointments FROM appoint");
                    if (totalAppointmentsRS.next()) {
                        int totalAppointments = totalAppointmentsRS.getInt("totalAppointments");
                        System.out.println("Total Appointments: " + totalAppointments);
                    } else {
                        System.err.println("Unable to fetch total appointments.");
                    }
                
                } else if (appointmentOption == 2) {
                   
                    String query = "SELECT a.appointment_id, a.patient_name, a.doctor_name, a.appointment_date, a.appointment_time FROM appoint a";
                    ResultSet appointmentsRS = st.executeQuery(query);

                    System.out.println("\nAppointments:");
                    System.out.println("+----+-------------+-------------+------------------------+----------------------+------------------+-----------------------------+");
                    System.out.println("| appointment_id   | Patient Name | Doctor Name | Appointment Date | Appointment Time |");
                    System.out.println("+----+-------------+-------------+------------------------+----------------------+------------------+------------------------------+");

                    while (appointmentsRS.next()) {
                        int appointmentID = appointmentsRS.getInt("appointment_id");
                        String patientName = appointmentsRS.getString("patient_name");
                        String doctorName = appointmentsRS.getString("doctor_name");
                        String appointmentDate = appointmentsRS.getString("appointment_date");
                        String appointmentTime = appointmentsRS.getString("appointment_time");

                        System.out.format("| %-2d | %-11s | %-10s | %-22s | %-20s |\n", appointmentID, patientName, doctorName, appointmentDate, appointmentTime);
                        System.out.println("+----+--------------+-------------+------------------------+----------------------+------------------+----------------+");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//package HospitalManagementSystem;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class Patient {
//
//    public static void main(String args[]) throws InterruptedException {
//        try (Scanner scanner = new Scanner(System.in);
//             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "madhu@2020")) {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Statement st = connection.createStatement();
//
//            System.out.println("________________________________________________________________________________________");
//            System.out.println("\n                                      " + "HOSPITAL MANAGEMENT SYSTEM \n");
//            System.out.println("________________________________________________________________________________________");
//            System.out.println("\n                                      " + "Welcome to our hospital \n");
//            System.out.println("________________________________________________________________________________________");
//
//            boolean exitProgram = false;
//
//            while (!exitProgram) {
//                displayMainMenu();
//
//                int choose = scanner.nextInt();
//                scanner.nextLine(); // Consume newline
//
//                switch (choose) {
//                    case 1:
//                        handlePatientManagement(scanner, connection, st);
//                        break;
//                    case 2:
//                        handleDoctorManagement(scanner, connection, st);
//                        break;
//                    case 3:
//                        handleAppointmentManagement(scanner, connection, st);
//                        break;
//                    case 4:
//                        handleBillingManagement(scanner, connection, st);
//                        break;
//                    case 5:
//                        exitProgram = true;
//                        break;
//                    default:
//                        System.out.println("Invalid option. Please choose a valid option.");
//                }
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void displayMainMenu() {
//        System.out.println("\n          Choose the option \n");
//        System.out.println("______________                         ______________                      ___________________      ");
//        System.out.println("1 . PATIENT                            2 . DOCTOR                          3. Appointment Management");
//        System.out.println("4. Billing                             5. Exit");
//        System.out.println("______________                         ______________                      ___________________      ");
//    }
//
//    private static void handlePatientManagement(Scanner scanner, Connection connection, Statement st) {
//        // Add patient management logic here
//        displayPatientMenu();
//        int option = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        if (option == 1) {
//            // Register Patient
//            try {
//				registerPatient(scanner, connection);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        } else if (option == 2) {
//            // View Patients
//            viewPatients(st);
//        } else {
//            System.out.println("Invalid option. Returning to the main menu.");
//        }
//    }
//
//    private static void displayPatientMenu() {
//        System.out.println("\n1. Register Patient");
//        System.out.println("2. View Patients");
//        System.out.print("Choose an option: ");
//    }
//
//    private static void registerPatient(Scanner scanner, Connection connection) throws InterruptedException {
//        System.out.println("               REGISTER PATIENT FORM");
//        System.out.println("               -------------\n");
//        System.out.println("Enter Patient's Full Name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter Patient's Age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//        System.out.println("Enter Patient's Gender: ");
//        String gender = scanner.nextLine();
//        System.out.println("Enter Patient's Medical Condition: ");
//        String medicalCondition = scanner.nextLine();
//        System.out.println("Enter Doctor's Name: ");
//        String doctorName = scanner.nextLine();
//
//        // Find the doctor's ID by name
//        int doctorID = findDoctorIDByName(connection, doctorName);
//
//        if (doctorID != -1) {
//            // Insert the patient's record with doctor details
//            String query = "INSERT INTO patients(name, age, gender, medical_condition, doctor_id) VALUES (?, ?, ?, ?, ?)";
//            try (java.sql.PreparedStatement insertStatement = connection.prepareStatement(query)) {
//                insertStatement.setString(1, name);
//                insertStatement.setInt(2, age);
//                insertStatement.setString(3, gender);
//                insertStatement.setString(4, medicalCondition);
//                insertStatement.setInt(5, doctorID);
//
//                int pat = insertStatement.executeUpdate();
//
//                if (pat > 0) {
//                    System.out.print("Patient details are processing...");
//                    for (int k = 1; k <= 10; k++) {
//                        System.out.print(".");
//                        Thread.sleep(1000);
//                    }
//                    System.out.println("\nPatient registered successfully");
//                    System.out.println("____________");
//                } else {
//                    System.err.println("Unable to process");
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.err.println("Doctor not found with the provided name.");
//        }
//    }
//
//    private static int findDoctorIDByName(Connection connection, String doctorName) {
//        String findDoctorIDQuery = "SELECT id FROM doctors WHERE name = ?";
//        try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(findDoctorIDQuery)) {
//            preparedStatement.setString(1, doctorName);
//            ResultSet doctorIDResultSet = preparedStatement.executeQuery();
//            if (doctorIDResultSet.next()) {
//                return doctorIDResultSet.getInt("id");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return -1; // Default value if doctor is not found
//    }
//
//    private static void viewPatients(Statement st) {
//        try {
//            ResultSet patientsRS = st.executeQuery("SELECT * FROM patients");
//            System.out.println("\nPatient Details:");
//            System.out.println("+---------+------------------------+-----+-------+----------------------------+");
//            System.out.println("| Patientid |        Patient Name            | Age | Gender|   Medical Condition        |");
//            System.out.println("+---------+------------------------+-----+-------+----------------------------+");
//            while (patientsRS.next()) {
//                int patientID = patientsRS.getInt("patient_id"); // Assuming the ID column is still named "id"
//                String patientName = patientsRS.getString("name");
//                int patientAge = patientsRS.getInt("age");
//                String patientGender = patientsRS.getString("gender");
//                String patientMedicalCondition = patientsRS.getString("medical_condition");
//                System.out.format("| %-7d | %-22s | %-3d | %-5s | %-25s |\n", patientID, patientName, patientAge, patientGender, patientMedicalCondition);
//                System.out.println("+---------+------------------------+-----+-------+----------------------------+");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void handleDoctorManagement(Scanner scanner, Connection connection, Statement st) {
//        // Add doctor management logic here
//        displayDoctorMenu();
//        int doctorOption = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        if (doctorOption == 1) {
//            // Add Doctor
//            addDoctor(scanner, connection);
//        } else if (doctorOption == 2) {
//            // View Doctors
//            viewDoctors(st);
//        } else {
//            System.out.println("Invalid option. Returning to the main menu.");
//        }
//    }
//
//    private static void displayDoctorMenu() {
//        System.out.println("\n1. Add Doctor");
//        System.out.println("2. View Doctors");
//        System.out.print("Choose an option: ");
//    }
//
//    private static void addDoctor(Scanner scanner, Connection connection) {
//        System.out.println("Enter Doctor's Name:");
//        String doctorName = scanner.nextLine();
//        System.out.println("Enter Doctor's Specialization:");
//        String doctorSpecialization = scanner.nextLine();
//
//        String insertDoctorQuery = "INSERT INTO doctors(name, specialization) VALUES (?, ?)";
//        try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(insertDoctorQuery)) {
//            preparedStatement.setString(1, doctorName);
//            preparedStatement.setString(2, doctorSpecialization);
//            int addedDoctor = preparedStatement.executeUpdate();
//
//            if (addedDoctor > 0) {
//                System.out.println("Doctor added successfully!");
//            } else {
//                System.err.println("Unable to add the doctor.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void viewDoctors(Statement st) {
//        try {
//            ResultSet doctorRS = st.executeQuery("SELECT * FROM doctors");
//            System.out.println("\nDoctor Details:");
//            System.out.println("+---------+------------------------+----------------------------+");
//            System.out.println("| Doctorid |        Doctor Name            |   Specialization |");
//            System.out.println("+---------+------------------------+----------------------------+");
//            while (doctorRS.next()) {
//                int doctorID = doctorRS.getInt("doctor_id"); // Assuming the ID column is still named "id"
//                String doctorName = doctorRS.getString("name");
//                String doctorSpecialization = doctorRS.getString("specialization");
//                System.out.format("| %-7d | %-22s | %-18s |\n", doctorID, doctorName, doctorSpecialization);
//                System.out.println("+---------+------------------------+---------------------+");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void handleAppointmentManagement(Scanner scanner, Connection connection, Statement st) {
//        // Implement appointment management logic here
//        // (Option 1: Book an Appointment, Option 2: View All Appointments)
//    }
//
//    private static void handleBillingManagement(Scanner scanner, Connection connection, Statement st) {
//        displayBillingMenu();
//        int billingOption = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        switch (billingOption) {
//            case 1:
//                generateBill(scanner, connection);
//                break;
//            case 2:
//                viewBillingHistory(scanner, st);
//                break;
//            default:
//                System.out.println("Invalid option. Returning to the main menu.");
//        }
//    }
//
//    private static void displayBillingMenu() {
//        System.out.println("\nBilling Options:");
//        System.out.println("1. Generate Bill");
//        System.out.println("2. View Billing History");
//        System.out.print("Choose an option: ");
//    }
//
//    private static void generateBill(Scanner scanner, Connection connection) {
//        // Implement logic to generate a bill for a patient
//        // You can prompt for patient details and billing information here
//    }
//
//    private static void viewBillingHistory(Scanner scanner, Statement st) {
//        // Implement logic to view billing history for patients
//        // You can query the database to retrieve billing information
//    }
//}
