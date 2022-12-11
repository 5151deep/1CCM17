package IMP;

public class BinarySquare {
    public static void main(String[] args) {
       int row=5;
       int column=5;
       int count=1;
       for (int i=1;i<=row;i++){
           for(int j=1;j<=column;j++){
               System.out.print(count);
               if(count==1){
                   count--;
               }
               else{
                   count++;
               }
           }
           System.out.println();
       }
    }
}
