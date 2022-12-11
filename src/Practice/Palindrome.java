package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter string");
        String s= sc1.next();
        StringBuilder rev= new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        if(s.equals(rev.toString())){
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}
