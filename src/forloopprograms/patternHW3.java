package forloopprograms;

public class patternHW3 {
    public static void main(String[] args) {
        int lines=3;
        int star=1;
        int space=2;
        int num=1;
        //space for loop
        for(int r=1;r<=lines;r++){
            //space for loop
            for(int s=1;s<=space;s++){
                System.out.print(" ");}
            //number for loops
            for(int j=1;j<=star;j++){
                System.out.print(num);
            }
            System.out.println();
            space--;
            num=num+1;
            star+=2;
        }
    }
}
