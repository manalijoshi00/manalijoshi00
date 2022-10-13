import java.io.BufferedReader;
import java.io.InputStreamReader;

class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1,c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter number of terms: ");

               int n = Integer.parseInt(br.readLine());
               System.out.println("\nFibonacci series is:");
               while(n>0)
               {    
            	   c=a+b;    
            	   System.out.print(c+" ");    
            	   a=b;    
            	   b=c;  
            	 n=n-1;
               }    
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class Reverse extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\nReverse Order is: ");
               for(int i=10;i>=1;i--)
               {
                    System.out.print(i+" ");
               }
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

public class MainThread {

	public static void main(String[] args) {
		
		 Fibonacci fib = new Fibonacci();
         fib.start();
         try {
			fib.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
         Reverse rev = new Reverse();
         rev.start();
		

	}

}
