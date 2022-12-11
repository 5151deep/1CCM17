package ExceptionHandling;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        int[] arr1;
        arr1=new int[3];
        String s=null;
        try{
            try{
                arr1[5]=25;
                System.out.println(arr1[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("PROGRAM ENDED");
    }
}
