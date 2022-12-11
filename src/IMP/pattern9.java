package IMP;

public class pattern9 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if(j==1||j==5){
                    System.out.print('1');
                }
                else if(j==2||j==4){
                    System.out.print('*');
                }
                else {
                    System.out.print('0');
                }
            }
            System.out.println();
        }
    }
}
