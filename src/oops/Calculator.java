package oops;

 public class Calculator {
    void Multiply(int a,int b){
        System.out.println(a*b);
    }
    void Multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }
    void Multiply(double p,double q){
        System.out.println(p*q);
    }
}
class MainApp1{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.Multiply(20,30);
        c1.Multiply(30.25,65.00);
        c1.Multiply(20,36,96);
    }
}
