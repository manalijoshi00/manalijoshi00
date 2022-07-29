import java.util.StringTokenizer;
public class Tokenize 
{ 
      public static void main(String args[])   
      {
             String str = " This is a Java String ";
             StringTokenizer tokenizer = new StringTokenizer(str);
             int count = tokenizer.countTokens();
             System.out.println("Number of tokens : " + count + "\n");
 
             for(int i = 0;i<count;i++)
             {
                    System.out.println("token at ["+i+"]:"+ tokenizer.nextToken());
                    
             }
             while(tokenizer.hasMoreTokens())
             {
                   System.out.println(tokenizer.nextToken());
                  
             }
            
       }
}
