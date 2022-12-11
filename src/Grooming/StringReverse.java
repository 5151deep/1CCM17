package Grooming;

public class StringReverse {
    public static void main(String[] args) {
        String str="Deepak";
        char[] arr1=str.toCharArray();

        for(int i= arr1.length-1;i>=0;i--) {
            System.out.print(arr1[i]);
        }
            int n=str.length();
            for(int j=n-1;j>=0;j--){
                System.out.print(str.charAt(j));
            }
    }
}
