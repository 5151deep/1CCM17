package CollectionFramework;

import java.util.ArrayList;

public class ArraylistDemo3 {
    public static void main(String[] args) {
        ArrayList <String> courses=new ArrayList<>();

        courses.add("java");
        courses.add("SQL");
        courses.add("Manual");

        //Option 1
        System.out.println(courses);

        //Option2
       for(int a=0;a< courses.size();a++){
            System.out.println(courses.get(a));
        }

        //Option3
        for (String s : courses) {
            System.out.println(s);
        }
    }
}
