 class SelectionSort
  {
    public static void main(String[] args) 
     {
           int[] a={7,2,8,5,10,4};
          int min,temp=0;
        for(int i=0;i<a.length;i++)
        {
            min=i;
          for(int j=i+1;j<a.length;j++)
          {
            if(a[j]<a[i])
            {
                min=j;
            }
        }
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;

          } 
          for(int i=0;i<=a.length;i++)
          {
            System.out.println(a[i]);
          }
              
        }
        
    }
