//multilevel inheritance Example
class Animal
{ 
  void eat()
 {
   System.out.println(" i am eating..");

 }
}
class multiInheritance extends Animal
{
  void run()
{
 System.out.println(" i am running...");
}
 public static void main(String args[])
{
  multiInheritance s=new multiInheritance();
           s.eat();
           s.run(); 
}
}