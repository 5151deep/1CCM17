package Arrays;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] [] arr1;
        arr1=new int[2][2];
        arr1[0][0]=100;
        arr1[0][1]=200;
        arr1[1][0]=300;
        arr1[1][1]=400;


        // row
        for (int a=0;a< arr1.length;a++){
            //column
            for(int b=0;b< arr1.length;b++){
                System.out.print(arr1[b][b]+"\n");
            }
        }
    }
}
