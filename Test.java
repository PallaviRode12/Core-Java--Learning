interface I1
{
 void show();
}
class Test implements I1
{
  public void show()
 {
 System.out.println("This is the Example of interface...");
 }
 public static void main(String args[])
 {
  Test t=new Test();
   t.show();
 }

 }