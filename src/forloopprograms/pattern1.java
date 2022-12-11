package forloopprograms;

public class pattern1 {
    public static void main(String[] args) {
        int star=5;
        int lines=5;
        int space=1;
        for(int r=1; r<=lines;r++)
        {
            for(int c=1;c<=star;c++){
                System.out.print("*");}
                for(int s=1;s<=5;s++){
                    System.out.print(" ");
                space--;}
            System.out.println();

        }
        star=+2;

    }
    }

