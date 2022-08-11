import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
class DuplicateObjectExa
{
      public static void main(String[] args)
      {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Jan");
            list.add("Feb");
            list.add("Mar");
            list.add("Jan");
            list.add("Feb");
            list.add("Apr");
            list.add("May");
            System.out.println("List : " + list);
            Set<String> set = new LinkedHashSet<String>(list);
            System.out.println("List after removing duplicate elements = "+set);
      }
}
