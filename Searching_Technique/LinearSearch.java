public class LinearSearch
{
    public static int Linear(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(key==numbers[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={6,5,8,9,45,25,65};
        int key=65;
         int get=Linear(numbers,key);
        if(get==-1) {
            System.out.println("not found");
        }
        else {
            System.out.println("the number is found at the index: "+get);
        }

    }
}
