class A
{
        public final void display(Object o) 
        {
             System.out.println("Hello");
        }
}
class B extends A 
{
        public void display(Integer i) 
        {
              System.out.println("Good");
        }
}
public class OverridingMethod
{
        public static void main(String[] args) 
        {
              A a = new A();
              B b = new B();
              a.display(0);
              b.display(0);
        }
}