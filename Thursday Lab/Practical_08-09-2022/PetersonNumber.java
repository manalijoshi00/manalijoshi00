import java.util.Scanner;
class PetersonNumber
{
      static int[] factorial = new int[] {1, 1, 2, 6, 24, 120, 720};
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            int number = sc.nextInt();
            if(isPeterson(number))
            {
                System.out.println("The given number is Peterson number."); 
            }
            else
            {
                 System.out.println("The given number is not Peterson number.");
            }
     }
     static boolean isPeterson(int number) 
     {
           int num = number;
           int sum = 0;
           while(num > 0)
           {
                int Digit = num % 10;
                sum += factorial[Digit];
                num = num / 10;
           }
           return(sum == number);
     }
}
                