public class MergeSort {
     
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        int[] inputArr={3,9,44,10,7,6,1};
        MergeSort ms=new MergeSort();
        ms.sort(inputArr);

        for(int i:inputArr)
        {
            System.out.println(i+ "");
        }
    }
    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int lowerindex,int higherindex)
    {
        if(lowerindex<higherindex)
        {
            int middle=lowerindex+(higherindex-lowerindex)/2;
            divideArray(lowerindex, middle);//it will sort left side array...
            divideArray(middle+1,higherindex);//it will sort right sidde array....
            mergeArray(lowerindex, middle,higherindex);
        }
    }
    public void mergeArray(int lowerindex,int middle,int higherindex)
    {
        for(int i=lowerindex;i<=higherindex;i++)
        {
            tempMergeArr[i]=array[i];
        }
        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while (i<=middle && j<=higherindex) {
            if(tempMergeArr[i]<=tempMergeArr[j])
            {
                array[k]=tempMergeArr[i];
                i++;
            }
            else
            {
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle) {
            array[k]=tempMergeArr[k];
            k++;
            i++;
            
        }

    }
}
