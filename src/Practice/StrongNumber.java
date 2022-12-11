package Practice;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc1.nextInt();
        int sum=0;
        int temp=num;

       while(num!=0){
           int fact=1;
           int rem=num%10;
           while (rem!=0){
               fact=fact*rem;
               rem--;
           }
           sum=sum+fact;
           num=num/10;

       }
       if (temp==sum){
           System.out.println("It is a strong number");
       }
       else
       {
           System.out.println("it is not a strong number");
       }
       }

}
