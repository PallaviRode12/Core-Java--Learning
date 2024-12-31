import java.util.Scanner;

class CalculatorSwitch
{
  String yn;
do{ 
   public static void main(String[] args) 
    {
      Scanner s=new Scanner(System.in);
      
      System.out.println("Enter first value");  
      int no1 =s.nextInt();

      System.out.println("Enter second value");  
      int no2 =s.nextInt();
      
      System.out.println("Select symbol(+,-,*,/)");  
     String sym =s.next();
     int res;
     
     switch (sym)
      {

        case"+" : res=no1+no2;
            System.out.println("Addition is: "+res);
            break;

            case"-": value:res=no1-no2;
            System.out.println("Substraction  is: "+res);
            break;

            case "*": res=no1*no2;
            System.out.println("multiplication  is: "+res);
            break;

            case "/": res=no1/no2;
            System.out.println("Division is: "+res);
            break;
        default: System.out.println("Symbol is not valid");
        } 
        System.out.println("Do you want to continue(Press y for Yes and n for No)");
         yn=s.next   
     }
      while(yn.equals("y")||yn.equals("Y"));

    }  

}