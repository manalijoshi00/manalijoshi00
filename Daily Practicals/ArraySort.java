import java.util.Arrays;
public class ArraySort
{
      public static void main(String[] args)
      {
            int[] intArr = {8,4,3,5,6};
            String[] strArr = {"C","O","I","P","U"};
            Arrays.sort(intArr);
            Arrays.sort(strArr);
            System.out.println(Arrays.toString(intArr));
            System.out.println(Arrays.toString(strArr));
      }
}