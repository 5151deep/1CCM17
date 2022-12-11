package ExceptionHandling;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        String s1="25AB";
        try{
            int a=Integer.parseInt(s1);  //JVM Creates object
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("PROGRAM ENDED");
    }
}
