package Practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int sum, sub, multi, div;

        System.out.println("Enter first no");
        int no1 = sc1.nextInt();
        System.out.println("Enter second number");
        int no2 = sc1.nextInt();
        while (true) {
            System.out.println("Enter 1:for addition");
            System.out.println("Enter 2:for subtraction");
            System.out.println("Enter 3:for Multiplication");
            System.out.println("Enter 4:for Division");
            int num = sc1.nextInt();
            switch (num) {
                case 1:
                    sum = no1 + no2;
                    System.out.println("Result:" + sum);
                    break;
                case 2:
                    sub = no1 - no2;
                    System.out.println("Result:" + sub);
                    break;
                case 3:
                    multi = no1 * no2;
                    System.out.println("Result" + multi);
                    break;
                case 4:
                    if (no2 == 0) {
                        System.out.println("cant complete operation with 0");
                    } else {
                        div = no1 / no2;
                        System.out.println("Result:" + div);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter valid No");

            }
        }
    }
}
