package Practice;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s1.nextInt();
        int square=num*num;
        int rem=0;

        while (num>0){
            rem=num%10;
        }
        if(rem==num){
            System.out.println("No is Automorphic number");
        }
        else
        {
            System.out.println("No is not Automorphic ");
        }
    }
}
