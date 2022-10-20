import java.util.Arrays;
import java.util.Scanner;

public class AnagramEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		String str1 = sc.nextLine();
		System.out.println("Enter second String:");
		String str2 = sc.nextLine();
		
		if(str1.length()== str2.length()) {
			
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			boolean result = Arrays.equals(array1,array2);
			
			if(result) {
				
				System.out.println(str1 + " and " + str2 + " are anagram.");
			}
			else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
		

	}

}
