package Practice;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n3;
        int n2=1;
        int count=9;
      for(int i=2;i<=count;i++)
         {
          n3=n1+n2;
          System.out.println(" "+n3);
          n1=n2;
          n2=n3;

          }
      }
    }

