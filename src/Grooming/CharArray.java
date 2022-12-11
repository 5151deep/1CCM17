package Grooming;

public class CharArray {
    public static void main(String[] args) {
        String str="LOVE";
        char[] arr1=str.toCharArray();
        for(int i=0;i<arr1.length;i++){
            int k=i;
            for(int j=0; j<arr1.length;j++){
                System.out.print(arr1[k]);
                k++;
                if(k==arr1.length){
                    k=0;
                }
            }
            System.out.println();
        }
    }
}