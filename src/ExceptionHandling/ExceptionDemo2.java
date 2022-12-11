package ExceptionHandling;

import java.util.Locale;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("program started");
        String str=null;
        try{
            System.out.println("LENGTH:"+str.toUpperCase());
        }

        catch (Exception e){                     //general handler
            System.out.println(e);
        }
        System.out.println("program ended");
    }
}
