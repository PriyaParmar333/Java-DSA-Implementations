public class printPairs
{
    public static void prntpairs(int numbers[])
    {
        int count=0;
        for(int i=0;i<numbers.length;i++)
        {
            int curr=numbers[i];

            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+curr+","+numbers[j]+")");
                count++;
            }

            System.out.println();
        }
        System.out.print("total count is "+count);

    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10,12};
        prntpairs(numbers);
    }
}
