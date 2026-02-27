public class MaxSubArrayI
{
    public static void BruteForce(int numbers[])
    {
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            CurrSum=0;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                CurrSum=0;
                for(int k=start;k<=end;k++)
                {
                    CurrSum+=numbers[k];
                }
                System.out.println(CurrSum);
                if(MaxSum<CurrSum)
                {
                    MaxSum=CurrSum;
                }
            }
        }
        System.out.println("THE MAXIMUM SUM IS:"+MaxSum);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8};
        BruteForce(numbers);
    }
}
