class NumSeries
{ 
      public static void main(String[] args) 
      { 
          int n; 
          System.out.println("n \t 10*n \t 100*n \t 1000*n");
          for(n=1;n<=5;n++)
          {
            int ten = 10*n;
            int hundred = 100*n; 
            int thousand = 1000*n;
            System.out.println(n + "\t" + ten + "\t" + hundred + "\t" + thousand);
          }
      }
}