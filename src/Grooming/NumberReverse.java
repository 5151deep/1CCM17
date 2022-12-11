package Grooming;

public class NumberReverse {
    public static void main(String[] args) {
        int num=1234;
        int temp;
        int rev=0;
        while(num!=0){
            temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        System.out.println(rev);
    }
}
