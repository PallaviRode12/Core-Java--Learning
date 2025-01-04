import java.util.Scanner;
public class OddusingScanner{
  public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the any number ");
    int no=s.nextInt();
    if(no%2==0)
    {
        System.out.println("the given no is even number " +no);
    }
    else
    {
        System.out.println("the given no is odd number" +no);
    }
  }
}