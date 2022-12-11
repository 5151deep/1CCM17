package Practice;

public class DuplicateChar {
    public static void main(String[] args){
        int[] arr1 = new int[] {31, 18, 6, 0, 31, 5, 6, 2, 18} ;

        System.out.println("Following are Duplicate Number:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[j]);
                }
            }
            System.out.println("Remaining are are" + arr1[i]);
        }
    }
    }