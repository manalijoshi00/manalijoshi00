class OverloadStaticMethod   
{   
       public static void sum(int a, int b)   
       {   
             int c=a+b;  
             System.out.println("The sum is: "+c);   
       }      
         
       public static void main(String args[])   
       {   
          OverloadStaticMethod s = new OverloadStaticMethod();
          s.sum(13,35);   
       }   
}  