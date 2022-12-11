package Practice;

import java.util.ArrayList;

public class ArrayListdemo2 {
    public static void main(String[] args) {
        ArrayList <String> courses=new ArrayList<>();

        courses.add("java");
        courses.add("SQL");
        courses.add("MANUAL");

        System.out.println(courses);

        for(int a=0;a< courses.size();a++){
            System.out.println(courses.get(a));
        }
    }
}
