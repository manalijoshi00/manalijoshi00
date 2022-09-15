class Car
 {
       int speed;
       double price;
       String color;
       Car(int speed, double price, String color) 
       {
           this.speed = speed;
           this.price = price;
           this.color = color;
       }
       public double getSalePrice() 
       {
            return price;
       }
}
class Sedan extends Car 
{
     int length;
     Sedan(int speed, double price, String color, int length) 
     {
         super(speed,price,color);
         this.length = length;
     }
     public double getSalePrice() 
     {
           if(length>20)
           {
                System.out.println("Car length is more than 20 so that you got 5% discount"); 
                return super.getSalePrice() * 0.05;
           }
           else 
           {
                System.out.println("Car length is less than 20 so that you got 10% discount"); 
                return super.getSalePrice() * 0.1;
           }
     }
}

public class MyCar 
{
      public static void main(String[] args) 
      {
           Sedan s = new Sedan(300,1000000,"black",35);
           System.out.println("Discount Value :" + s.getSalePrice());
           Sedan s1 = new Sedan(300,1200000,"white",18);
           System.out.println("Discount Value :" + s1.getSalePrice());
        
      }
}
