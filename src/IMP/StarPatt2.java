package IMP;

public class StarPatt2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
