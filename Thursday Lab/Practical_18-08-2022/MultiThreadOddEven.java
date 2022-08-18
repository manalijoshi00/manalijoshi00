import java.util.*;
class EvenNumber implements Runnable
{
     int x;
     int sqr;
     EvenNumber(int x)
     {
           this.x = x;
     }
     public void run()
     {
           sqr = x * x;
           System.out.println(" The Thread " + x + " is Even and Square of " + x + " is : " + sqr);
     }
}
class OddNumber implements Runnable
{
     int y;
     int cub;
     OddNumber(int y)
     {
           this.y = y;
     }
     public void run()
     {
           cub = y * y * y;
           System.out.println(" The Thread " + y + " is Odd and Cube of " + y + " is : " + cub);
     }
}
class Num extends Thread 
{
      public void run()
      {
           Random r = new Random();
           for(int i=0;i<5;i++)
           {
               int randomInteger = r.nextInt(20);
               System.out.println("Generated Number is : " + randomInteger);
               if(randomInteger % 2 ==0)
               {
                     Thread t = new Thread(new EvenNumber(randomInteger));
                     t.start();
               }
               else
               {
                      Thread t2 = new Thread(new OddNumber(randomInteger));
                      t2.start();
               } 
               try 
               {
                     Thread.sleep(1000);
               }
               catch(InterruptedException ex)
               {
                    System.out.println(ex);
               }
           }
      }
}
public class MultiThreadOddEven
{
     public static void main(String[] args)
     {
           Num n = new Num();
           n.start();     
     }
}