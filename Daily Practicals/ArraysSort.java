import java.util.Arrays;
public class ArraysSort
{
      public static void main(String[] args)
      {
            int[] intArr = {10,7,9,13,17 };
            String[] strArr = {"E","H","G","A","C"};
            Arrays.sort(intArr);
            Arrays.sort(strArr);
            System.out.println(Arrays.toString(intArr));
            System.out.println(Arrays.toString(strArr));
      }
}