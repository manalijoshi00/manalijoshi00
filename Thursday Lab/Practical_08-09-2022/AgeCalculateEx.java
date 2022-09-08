import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
class AgeCalculateEx
{
      public static void main(String[] args)
      {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter birth of date in yy-mm-dd format : ");
          String input = s.nextLine();
          LocalDate birthDate = LocalDate.parse(input);
          LocalDate currentDate = LocalDate.now();
          if((birthDate != null) && (currentDate != null))
          {
               Period age = Period.between(birthDate,currentDate);
               System.out.println("Your Age : ");
               System.out.println(" Years " + age.getYears());
          }
      }
}