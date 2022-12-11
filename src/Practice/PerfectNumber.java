package Practice;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc1.nextInt();
        int temp=0;

           for(int i=1;i<num;i++){
               if(num%i==0){
                   temp=temp+i;
               }
           }
        if(num==temp){
            System.out.println(num+"is a perfect number");
        }
       else {
            System.out.println("it is not a perfect number");
        }

    }
}
