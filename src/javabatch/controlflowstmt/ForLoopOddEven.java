package javabatch.controlflowstmt;

import java.util.Scanner;

public class ForLoopOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int fromNo = sc.nextInt();
        int toNo = sc.nextInt();
        for (int i = fromNo; i <= toNo; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
