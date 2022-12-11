package Practice;

public class SwapTheNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
 // Swap a value without using third variable
        System.out.println("a is:"+ a +" b is:"+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is:"+ a +" b is:"+b);
    }
}
