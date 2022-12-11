package Practice;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner Sc1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = Sc1.nextInt();

        int count = 0;
        for (int i = 2; i <= num; num++) {
            if (num % i == 0) {
                count++;
            }

        }
        if (count > 2) {
            System.out.println("Number is Composite");
        } else {
            System.out.println("Number is not Composite");
        }
    }
}

