package Arrays;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
