public class BinarySearch
{
    public static int Binary(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key<numbers[mid])
            {
                end=mid-1;

            }
            if(key>numbers[mid])
            {
                start=mid+1;

            }
            if(key==numbers[mid])
            {
                return mid;
            }

        }
        return -1;

    }
    public static void main(String args[])
    {
       int numbers[]={10,20,30,40,50,60,80,90,100};
       int key=80;
       int get=Binary(numbers,key);
       if(get==-1)
       {
           System.out.println("not found");
       }
       else {
           System.out.println("the number is found aat the index "+get);
       }
    }
}

