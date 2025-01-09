class B
{
   void A1()
  {
   System.out.println("A1 method is succesfully running...");
  }

}
class OverridingEx extends B
{
   void A1()
  {
   System.out.println("aaa method is succesfully running...");
  }
  public static void main(String args[])
 {
   OverridingEx ex= new OverridingEx();
     ex.A1();
     B b=new B();
      b.A1();

 }
}