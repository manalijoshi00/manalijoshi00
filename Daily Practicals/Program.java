class Program
{
       public static void main(String[] args)
       {
             Object[] array = new Object[4];
             array[0] = "dog";
             array[1] = 70;
             array[2] = new StringBuilder("bcd");
             array[3] = 6;
             for (Object a : array)
             {
                  System.out.println(a);
             }
       }
}