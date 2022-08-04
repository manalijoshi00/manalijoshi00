import java.util.Scanner;
class CountVowCons
{
    public static void main(String[] args)
    {
        int vowels = 0;
        int consonants = 0;
        int ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
               ch = str.charAt(i);
               if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
               {
                      vowels++;
               }
               else if(ch>='A' || ch>='Z')
               {
                       consonants++;
               }
          }
          System.out.println("Vowels :" + vowels);
          System.out.println("Consonants :" + consonants);
    }
} 

        
