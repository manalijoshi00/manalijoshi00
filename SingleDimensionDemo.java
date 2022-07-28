import java.util.Scanner;
class SingleDimensionDemo
{
      public static void main(String a[])
      {
           int n = 3;
           int b[] = new int[n];
           Scanner s = new Scanner(System.in);
           for(int i=0;i<n;i++)
           {
              System.out.println("Enter the value" +i+ "=");
              b[i] = s.nextInt();
           }
           for(int i=0;i<n;i++)
           {
              System.out.println(b[i]);
           }
      }
}