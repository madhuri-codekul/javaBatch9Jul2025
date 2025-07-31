package javabatch.controlflowstmt;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter your nos");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int ch;
        int result;
        do {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            System.out.println("Choice is "+ch);
            switch (ch){
                case 1:
                    result = no1+no2;
                    System.out.println("Addition is "+result);
                    break;
                case 2:
                    result = no1 - no2;
                    System.out.println("Subtraction is "+result);
                    break;

                case 3:
                    result = no1 * no2;
                    System.out.println("Multiplication is "+result);
                    break;
                case 4:
                    result = no1 / no2;
                    System.out.println("Division is "+result);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }while (ch<5);
    }
}
