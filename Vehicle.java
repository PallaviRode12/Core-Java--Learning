// Abstract example.................

abstract class Vehicle
{
 abstract void start();
}
class Car extends Vehicle
{ 
  void start()
 {
   System.out.println("Car Start with key...");
 }

} 
class Scooter extends Vehicle
{
 void start()
 {
   System.out.println("Scooter Start with kick...");
 }
 public static void main(String args[])
{
  Car c=new Car();
   c.start();
Scooter sc=new Scooter();
  sc.start();
   
}

}