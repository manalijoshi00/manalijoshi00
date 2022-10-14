import java.util.HashMap;
import java.util.Scanner;

public class RepeatedNonRepeatedChar {
	
	static void RepeatedNonRepeatedChar(String s) {
		
		HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
	    char strArray[] = s.toCharArray();
	    for(char c : strArray) {
		
		if(charCount.containsKey(c)) {
			
			charCount.put(c,charCount.get(c) +1);
		}
		else {
			
			charCount.put(c,1);
		}
	}
		for(char c : strArray) {
		 if (charCount.get(c) > 1) {
			 
			 System.out.println("First Repeated character in string " + s + " is " + c); 
			 break;
		 }
		}
		for(char c : strArray) {
		 if (charCount.get(c) == 1) {
			
			System.out.println("First Non repeated character in string " + s + " is " + c);
			break;
			
		}
	  }
   }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string :");
		String input = sc.next();
		RepeatedNonRepeatedChar(input);
	}

}
