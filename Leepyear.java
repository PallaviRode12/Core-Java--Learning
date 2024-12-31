
class Leepyear
{
    public static void main(String[] args) {
        int year=2021;
        if(year%4==0)
        {
            if(year%100==0)
            {
              System.out.println("the year is not leep year.");
            }
            else
            {
                System.out.println("the year is leap year");
            }
        }
        else
        {
           System.out.println("the year is not leap year");
        }
    }
}