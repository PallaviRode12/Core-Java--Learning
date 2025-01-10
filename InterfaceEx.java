interface I1
{
  void show();//by default the access modifier is abstract &public.
}
interface I2
{
  void display();//by default the access modifier is abstract &public.
}
  
 class InterfaceEx implements I1,I2
  {
   public void show()//acesss modifier should be stronger than parent ..
    {
        System.out.println("This is the example of the interface..");
    }
     public void display()
    {
        System.out.println("This is ex of inheritance by using interface.");
    }

    public static void main(String[] args) {
        InterfaceEx ex=new InterfaceEx();
        ex.show();
        ex.display();
    }
    
}

    