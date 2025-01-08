// Single inheritance Example
class Animal
{ 
  void eat()
 {
   System.out.println(" i am eating..");

 }
}
class Inheritance extends Animal
{
 public static void main(String args[])
{
 Inheritance s=new Inheritance();
   s.eat();
}
}