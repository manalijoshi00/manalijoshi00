import java.util.Scanner;
class JavaExample
{
     public static void main(String[] args)
     {
           Scanner s = new Scanner(System.in);
           System.out.println("Enter any Hexadecimal Number :");
           String hexanum = s.nextLine();
           int Num = Integer.parseInt(hexanum,16);
           System.out.println("Decimal value is :" + Num);
     }
}
            
          