package Practice;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();

        int rem;
        int sum=0;
        int mul = 1;
        while (num!=0){
            rem=num%10;
            sum=sum+rem;
            mul=mul*rem;
            num/=10;
        }
        if(sum==mul){
            System.out.println("Num is Spy no"+num);
        }
        else{
            System.out.println("num is not a spy number");
        }
    }
}
