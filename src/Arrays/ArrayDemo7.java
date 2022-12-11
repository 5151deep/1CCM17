package Arrays;
import java.util.Scanner;
public class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner Sc1=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int no= Sc1.nextInt();

        int[] arr1={10,20,30,40,50,};
        boolean found=false;

        for(int a=0;a<arr1.length;a++){
            if(arr1[a]==no){
                found=true;
            }
        }
        if(found){
            System.out.println("NO EXIST");
        }
        else{
            System.out.println("NO DOES NOT EXIST");
        }
    }
}
