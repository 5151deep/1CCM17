package CollectionFramework;

// Java program to Reverse a String using ListIterator

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class of ReverseString
class ReverseString {
    public static void main(String[] args)
    {
        String input = "How Are You";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c : hello)
            trial1.add(c);

        Collections.reverse(trial1);
        for (Character character : trial1) System.out.print(character);
    }
}
