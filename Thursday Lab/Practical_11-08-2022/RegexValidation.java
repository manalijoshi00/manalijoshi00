import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexValidation 
{
      public static void main(String[] args) 
      {
             Scanner s = new Scanner(System.in);
             System.out.println("Enter the username: ");
             String Username = s.nextLine();
             System.out.println(Pattern.matches("[A-Za-z0-9_]{6,30}",Username));
             System.out.println("Enter the email id: ");
             String EmailId = s.next();
             System.out.println(Pattern.matches("[a-zA-Z0-9@._]{8,20}",EmailId));
             System.out.println("Enter the password: ");
             String Password = s.next();
             System.out.println(Pattern.matches("[a-zA-Z0-9@.!$%^&*\s]{8,16}",Password));
      }
}