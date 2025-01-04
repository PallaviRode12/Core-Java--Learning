import java.util.Scanner;
class Scannerexample1
{
public static void main(String[] args)
{

 Scanner s =new Scanner(System.in);
 System.out.println(" the the first value");
  int a=s.nextInt();
 System.out.println(" the the secound value");
 int b=s.nextInt();
 System.out.println(" the the third value");
 int c=s.nextInt();


  if((a>b) && (a>c))
  {
    System.out.println("a is greater " +a);
  }
    else if((b>a) && (b>c))
  {
    System.out.println("b is greater "+b);
  }
  else
  {
    System.out.println("c is greater "+c);
  }
}
}