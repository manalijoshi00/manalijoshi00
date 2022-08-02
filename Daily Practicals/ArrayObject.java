class ArrayObject
{
       public static void main(String[] args)
       {
             Object[] array = new Object[4];
             array[0] = "cat";
             array[1] = 22;
             array[2] = new StringBuilder("abc");
             array[3] = 9;
             for (Object a : array)
             {
                  System.out.println(a);
             }
       }
}