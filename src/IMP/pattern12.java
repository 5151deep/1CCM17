package IMP;

public class pattern12 {
    public static void main(String[] args) {
        int row=5;

          for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           System.out.println();
           }
//by using while loop
        int i=1;
        while(i<=5){
            int j=1;
            while (j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
