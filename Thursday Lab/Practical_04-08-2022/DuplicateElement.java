import java.util.ArrayList;
class DuplicateElement
{
     public static void main(String[] args)
     {
           int count = 0;
           int[] num = new int[]{10,2,4,8,3,10,4,8,2};
           System.out.println("Duplicate elements in array :");
           for(int i=0;i<num.length;i++)
           {      
                for(int j=i+1;j<num.length;j++)
                {
                    if(num[i] == num[j])
                    {
                         System.out.println(num[j]);
                         count++;
                    }
                }
           }  
           System.out.println("Count number of occurrence of the element :" + count);  
      }
}
             
            
        