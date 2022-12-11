package Arrays;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner Sc1=new Scanner(System.in);

        System.out.println("ENTER NO OF SUBJECTS");
        int count=Sc1.nextInt();

        double[] marks=new double[count];
        System.out.println("ENTER MARKS OF SUBJECTS");

        double sum=0;
        for(int a=0;a<count;a++){
            marks[a]= Sc1.nextDouble();
            sum=sum+marks[a];
        }
        double Avg=sum/count;
        System.out.println("AVARAGE VALUE:"+Avg);


    }
}
