public class OverloadFinalMethod 
{
     public final void Sum(int x, int y) 
     {
          int z=x+y;
          System.out.println("The sum is:" +z);
     }
     public final void Sum(double x, double y) 
     {
          double z=x+y;
          System.out.println("The sum is:" +z);
     }
     public static void main(String[] args)
     {
           OverloadFinalMethod s = new OverloadFinalMethod();
           s.Sum(8,5);
           s.Sum(4.3,6.26);
     }
}
