package Practice;

import java.util.Scanner;

public class Calculator {

        Scanner sc1=new Scanner(System.in);
        public void add(){
            System.out.println("Enter first number");
            int num1=sc1.nextInt();
            System.out.println("Enter second number");
            int num2= sc1.nextInt();
            int res=num1+num2;
            System.out.println("Result"+res);
        }
        public void sub(){
            System.out.println("Enter first number");
            int num1=sc1.nextInt();
            System.out.println("Enter second number");
            int num2= sc1.nextInt();
            int res=num1-num2;
            System.out.println("Result"+res);
        }
        public void mul(){
            System.out.println("Enter first number");
            int num1=sc1.nextInt();
            System.out.println("Enter second number");
            int num2= sc1.nextInt();
            int res=num1*num2;
            System.out.println("Result"+res);
        }
        public void div(){
            System.out.println("Enter first number");
            int num1=sc1.nextInt();
            System.out.println("Enter second number");
            int num2= sc1.nextInt();
            int res=num1/num2;
            System.out.println("Result"+res);
        }
    }

