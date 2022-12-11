package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        try {
            System.out.println("ENTER FIRST NUMBER");
            int no1 = sc1.nextInt();
            System.out.println("ENTER SECOND NUMBER");
            int no2 = sc1.nextInt();

            int result = no1 / no2;
            System.out.println("RESULT:" + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {

            System.out.println(e);
        }
        System.out.println("PROGRAM ENDED");
    }
}