public class Reverse
{
    public static void Reverse(int numbers[])
    {
        int first=0;
        int end=numbers.length-1;
        while(first<end)
        {
            int temp=numbers[end];
            numbers[end]=numbers[first];
            numbers[first]=temp;
            end--;
            first++;
        }

    }
    public static void main(String args[])
    {
        int numbers[]={4,3,2,1};
        Reverse(numbers);
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]);
        }

    }
}
