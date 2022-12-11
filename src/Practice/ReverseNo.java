package Practice;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int no= sc.nextInt();
        int temp;
        int rev=0;
        while(no>0){
            temp=no%10;
            rev=rev*10+temp;
            no/=10;
        }
        System.out.println(rev);
    }
}
