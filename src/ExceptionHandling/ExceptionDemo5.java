package ExceptionHandling;

import java.sql.SQLOutput;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        try{
            int c=10/2;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("CLOSING COSTLY RESOURCES");
        }
        System.out.println("PROGRAM ENDED");
    }
}
