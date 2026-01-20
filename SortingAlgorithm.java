public class SortingAlgorithm
{
    public static void BubbleSort(int arr[])
    {
        for(int turn=0;turn<arr.length;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swapp
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void SelectionSort(int arr[])
    {
        for(int turn=0;turn<arr.length;turn++)
        {
            int minPos=turn;
            for(int j=turn+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            //swapp
            int temp=arr[minPos];
            arr[minPos]=arr[turn];
            arr[turn]=temp;
        }
    }
    public static void PrintArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={4,5,3,2,1};
        SelectionSort(arr);
        PrintArray(arr);
    }
}
