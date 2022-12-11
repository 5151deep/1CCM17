package Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc1.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("not palindrome number");
        }
        }
    }

