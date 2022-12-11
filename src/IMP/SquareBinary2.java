package IMP;

public class SquareBinary2 {
    public static void main(String[] args) {
        int row=5;
        int column=5;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if(i%2==0) {
                    System.out.print("1");
                }
                    else{
                        System.out.print("0");
                    }
            }
            System.out.println();
        }
    }
}
