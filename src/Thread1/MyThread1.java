package Thread1;

public class MyThread1 extends Thread {
    @Override
    public void run(){
        int i=0;
        while (i<40){
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40){
            System.out.println("My thread 2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}
 class DemoThread{
    public static void main(String[] args) {
MyThread1 m1=new MyThread1();
MyThread2 m2=new MyThread2();
m1.start();
m2.start();
    }
}
