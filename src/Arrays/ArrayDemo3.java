package Arrays;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner Sc1=new Scanner(System.in);

        System.out.println("NUMBER OF COURSES");
        int count=Sc1.nextInt();

        String[] courses=new String[count];
        System.out.println("ENTER COURSE NAME");

        for(int a=0;a<count;a++){
            courses[a]=Sc1.next();
        }
        System.out.println("=========================================");
        System.out.println("SELECTED COURSES ARE");
        for(String S: courses){
            System.out.println(S);
        }
    }
}
