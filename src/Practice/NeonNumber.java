package Practice;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc1.nextInt();
        int square = num*num;
        int sum=0;
        int rem;
        while (square!=0){
            rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(num==sum){
            System.out.println("it is neon number");
        }
        else{
            System.out.println("it is not neon number");
        }

    }
}
