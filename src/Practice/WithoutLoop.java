package Practice;

public class WithoutLoop {

        public static void printName(int n){
            if(--n>0){
                System.out.println("Deepak");
                printName(n);
            }
        }
        public static void main(String args[]){
            printName(2000);
        }
    }

