package javabatch.controlflowstmt;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int no = sc.nextInt();
        System.out.println("no%5: " + no % 5);
        if (no % 5 == 0) {
            System.out.println("Given no is divisible by 5");
        } else if (no % 3 == 0) {
            System.out.println("Given no is divisible by 3");
        } else
            System.out.println("Given no is not divisible by 5&3");

    }
}
//
//15 = 3,5
//        9 = 3
//        25 = 5