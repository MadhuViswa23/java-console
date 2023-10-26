package pro;

import java.util.Scanner;



public class LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = myObj.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows -i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        
       
    }
}
