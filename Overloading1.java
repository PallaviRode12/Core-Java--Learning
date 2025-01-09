class Overloading1
{
    void show()
    {
      System.out.println("This is my Overloading method example....");
    } 
    void show(int i)
    {
      System.out.println("Method name is overloading....");
    } 
    
       public static void main(String[] args)
      {
        Overloading1 o= new Overloading1();
        o.show(10);
        
      }
        
   }