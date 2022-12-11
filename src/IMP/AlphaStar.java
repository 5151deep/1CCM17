package IMP;

public class AlphaStar {
    public static void main(String[] args) {

        for(int i=1;i<=6;i++) {
            int k=64;
            for (int j =1; j <= i; j++) {
                System.out.print((char)(i+k));
               k++;
            }
            System.out.println();
        }
    }
}
