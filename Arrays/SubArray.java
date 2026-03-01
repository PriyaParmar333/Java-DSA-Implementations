import javax.sound.midi.SysexMessage;

public class SubArray
{
    public static void subarray(int numbers[])
    {
        int count=0;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=0;j<numbers.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+" ");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total count is "+count);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6};
        subarray(numbers);
    }
}
