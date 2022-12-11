package oops;

public class Mainapp1 {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
     Laptop.p1.startprocess();   //composisition
        l1.display();
     Laptop.p1.stopprocess();    //composistion
    }
}
