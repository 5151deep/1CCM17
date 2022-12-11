package IMP;

public class Pattern11 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if(j==1){
                    System.out.print('1');
                }
                else if(j==5){
                    System.out.print('3');
                }
                else if(j==2||j==4){
                    System.out.print('*');
                }
                else {
                    System.out.print('2');
                }
            }
            System.out.println();
        }
    }
}
