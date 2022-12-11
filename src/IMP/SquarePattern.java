package IMP;

public class SquarePattern {
    public static void main(String[] args) {
        int row=5;
        int column=5;
        for(int i=0;i<=column;i++){
            for (int j=0;j<=row;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
