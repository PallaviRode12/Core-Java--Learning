class Demo
{
 int i=10;
}
class Super2 extends Demo
{
   int i=20;
 void m1(int i)
 {
  System.out.println(super.i);
 }
  public static void main(String args[])
 {
  Super2 s=new Super2();
     s.m1(30);
 }
}