package Practice;

import java.util.Scanner;

public class MainAppCalculator {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        boolean exit=true;
        Scanner sc1=new Scanner(System.in);
        while(exit){
            System.out.println("Enter the choice \n1.addition(+)\n2.Subtraction(-)\n3.Division(/)\n4.Multiplication(*)\n5.Exit(0)");
            char ch=sc1.next().charAt(0);
            switch(ch){
                case '+':
                {
                    c1.add();
                }
                break;
                case '-':
                {
                    c1.sub();
                }
                break;
                case '*':
                {
                    c1.mul();
                }
                break;
                case '/':
                {
                    c1.div();
                }
                break;
                default:
                {
                    exit=false;
                }
                break;
            }
        }
    }
}
