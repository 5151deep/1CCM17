package Thread1;

public class ThreadA implements Runnable{
    public void run(){
        for (int i=0;i<=50;i++){
            System.out.println("Hello World");
            System.out.println("Welcome to java");
        }
    }
}
class ThreadB implements Runnable{
    public void run(){
        for (int i=0;i<=50;i++){
            System.out.println("Good morning");
            System.out.println("Have a nice day");
        }
    }
}
 class Demo2{
    public static void main(String[] args) {

        ThreadA Bullet1=new ThreadA();
        Thread gun1= new Thread(Bullet1);

        ThreadB Bullet2=new ThreadB();
        Thread gun2=new Thread(Bullet2);

        gun1.start();
        gun2.start();
    }
}
