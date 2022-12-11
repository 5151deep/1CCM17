package Grooming;

public class Palindrome {
    public static void main(String[] args) {
        String str="LEVEL";
       int n=5;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                System.out.print("palindrome");
            }
        }
    }
}
