import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateCharacter {
	
    private static void duplicateCharacter(String str) 
    {
        Map<Character,Integer> wordCount = new HashMap<Character,Integer>();
        char[] charArray = str.toCharArray();
        for(Character ch : charArray) { 
            if (wordCount.containsKey(ch)) {
                wordCount.put(ch, wordCount.get(ch) + 1);
            } else {
                wordCount.put(ch, 1);
            }
        }
         Set<Character> input = wordCount.keySet();
        for (Character ch : input ) {
            if (wordCount.get(ch) > 1) {
                System.out.println(ch + " : " + wordCount.get(ch));
            }
        }
    }

    public static void main(String[] args) {

        duplicateCharacter("java is a Programming Language");
    }
}
