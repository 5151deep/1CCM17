package IMP;

public class NumericSquare {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int k=1;
        for (int i=1;i<=row;i++){
            for (int j=0;j<=column;j++){
                System.out.print(k);
                k++;
                if(k==9){
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
