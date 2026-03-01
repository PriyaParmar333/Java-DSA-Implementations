public class MaxSubArrayIII
{
    public static void Kadane(int num[])
    {
         int MaxSum=Integer.MIN_VALUE;
         int CurrSum=0;
        for(int i=0;i<num.length;i++)
        {
            CurrSum+=num[i];
            if(CurrSum<0)
            {
               CurrSum=0;
            }
            MaxSum=Math.max(CurrSum,MaxSum);
        }
        System.out.print("max sum array is:"+MaxSum);
    }
    public static void main(String args[])
    {
        int num[]={2,6,4,8,5};
        Kadane(num);
    }
}
