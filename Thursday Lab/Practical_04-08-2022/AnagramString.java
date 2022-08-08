import java.util.Arrays;
class AnagramString
{
     public static void main(String[] args)
     {
          String str1 = "creative";
          String str2 = "reactive";
          System.out.println("Checking whether str1 and str2 are an anagram of each other or not :" + checkAnagram(str1, str2));
     }
     public static boolean checkAnagram(String str1, String str2)
     {
          char[] array1 =str1.toLowerCase().toCharArray();
          char[] array2 =str2.toLowerCase().toCharArray();
          Arrays.sort(array1);
          Arrays.sort(array2);
          return Arrays.equals(array1,array2);
     }
}
