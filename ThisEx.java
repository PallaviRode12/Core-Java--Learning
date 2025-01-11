public class ThisEx {

    int i;
    void SetValue(int i)
    {
        this.i=i;
    }
    void Display()
    {
       
        System.out.println(i);
    }

    public static void main(String[] args) {
         ThisEx a=new ThisEx();
           a.SetValue(10);
           a.Display();
    }
}