package IMP;

public class AlphabetPattern {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        char k = 'A';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(k);
                k++;
                if (k>'E') {
                    k = 'A';
                }
            }
            System.out.println();
        }
    }
}
