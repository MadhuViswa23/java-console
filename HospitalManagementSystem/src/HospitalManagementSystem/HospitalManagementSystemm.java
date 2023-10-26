package HospitalManagementSystem;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HospitalManagementSystemm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Initialize the database connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "madhu@2020")) {
                System.out.println("Connected to the database!");

                // Create the patient table if it doesn't exist
                createPatientTable(connection);

                while (true) {
                    System.out.println("Choose an option:");
                    System.out.println("1. Add Patient");
                    System.out.println("2. Display Patients");
                    System.out.println("3. Exit");

                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            System.out.println("Enter Patient Name:");
                            String patientName = scanner.nextLine();
                            System.out.println("Enter Age:");
                            int age = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            System.out.println("Enter Gender:");
                            String gender = scanner.nextLine();
                            System.out.println("Enter Medical Condition:");
                            String medicalCondition = scanner.nextLine();
                            insertPatient(connection, patientName, age, gender, medicalCondition);
                            System.out.println("Patient added successfully!");
                            break;
                        case 2:
                            System.out.println("Patients:");
                            displayPatients(connection);
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void createPatientTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS patients (" +
                                "id INT AUTO_INCREMENT PRIMARY KEY," +
                                "name VARCHAR(255) NOT NULL," +
                                "age INT," +
                                "gender VARCHAR(10)," +
                                "medical_condition VARCHAR(255)" +
                                ")";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static void insertPatient(Connection connection, String name, int age, String gender, String medicalCondition) throws SQLException {
        String insertSQL = "INSERT INTO patients (name, age, gender, medical_condition) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, medicalCondition);
            preparedStatement.executeUpdate();
        }
    }

    private static void displayPatients(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM patients";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                String medicalCondition = resultSet.getString("medical_condition");

                System.out.println("Patient ID: " + id);
                System.out.println("Patient Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Medical Condition: " + medicalCondition);
                System.out.println();
            }
        }

    // The rest of your code (createPatientTable, insertPatient, displayPatients) remains the same.
}
}




