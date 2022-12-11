package forloopprograms;

public class pattern3 {
    public static void main(String[] args) {
        int lines=3;
        int star=5;
        for (int r=0;r<=lines;r++){
            char ch='A';
            for (int c=1;c<=star;c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();



        }

    }
}
