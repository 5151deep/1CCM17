package forloopprograms;

public class PatternDemo4 {
    public static void main(String[] args) {
        int star=4;
        int lines=3;
        int space=1;
        for(int r=1; r<=lines;r++)
        {
            for(int c=1;c<=star;c++){
                System.out.print(" * ");}
            for(int s=0;s<=5;s++){
                System.out.print(" ");
                space++;}
            System.out.println();

        }
        star=+1;

    }
}




