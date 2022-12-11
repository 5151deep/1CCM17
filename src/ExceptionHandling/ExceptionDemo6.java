package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER PRICE");
        double price= sc1.nextDouble();
        System.out.println("ENTER QUANTITY");
        int quantity= sc1.nextInt();
        pricevalidation(price,quantity);
    }
    static void pricevalidation(double price,int quantity){
        if(price>0){
            double total=price*quantity;
            System.out.println("TOTAL PRICE:"+total);
        }
        else{
            //EXPLICIT EXCEPTION OBJECT
            throw new IllegalArgumentException("price Invalid");
        }
    }
}

