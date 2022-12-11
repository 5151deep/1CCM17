package CollectionFramework;

import java.util.ArrayList;

public class ArraylistDemo1 {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();

        data.add(25);
        data.add("JAVA");
        data.add('c');
        data.add(78.60);
        data.add(null);
        data.add("JAVA");

        for (int a = 0; a< data.size(); a++) {
            System.out.println(data.get(a));
        }
    }
}
