class Demo
{
 Demo()
{
 System.out.println("i am in demo 1 constructor..");
}
}
class Super3 extends Demo
{
    Super3()
 {
    super();
  System.out.println("i am in demo 2 constructor..");
 }
  public static void main(String args[])
 {
  Super3 s=new Super3();
 }
}