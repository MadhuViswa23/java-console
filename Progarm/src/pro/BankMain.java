package pro;

public class BankMain {
    public static void main(String args[]) {
        BankDetail bd = new BankDetail();
       
        bd.setName("madhu");
        bd.setAge(24);
        bd.setIfsccode(200000566); 
        bd.setCifno(1257454547);
        bd.setEmail("madhuviswa@gmail.com");

        System.out.println("NAME: " + bd.getName());
        System.out.println("AGE: " + bd.getAge());
        System.out.println("IFSCCODE: " + bd.getIfsccode());
        System.out.println("CIFNO: " + bd.getCifno());
        System.out.println("EMAIL: " + bd.getEmail());
    }
}