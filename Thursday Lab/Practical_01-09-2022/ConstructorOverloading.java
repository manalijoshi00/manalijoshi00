class BaseClass
{
     BaseClass()
     {
     
     };
}
class DerivedClass extends BaseClass
{
     BaseClass()
     {
           System.out.println("The Overloading Base class of Constructor");
     }
     DerivedClass()
     {
        System.out.println("Derived class of Constructor");
     }
}

class ConstructorOverloading
{
      Public static void main(String[] args)
      {
            DerivedClass dc = new DerivedClass();

      }
}
             
            