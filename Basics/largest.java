import java.util.*;
public class largest
{
    public static int larger(int numbers[])
    {
        int larger=Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(larger<numbers[i])
            {
                larger=numbers[i];
            }
            if(smaller>numbers[i])
            {
                smaller=numbers[i];
            }
        }
        System.out.println("the smallest number is "+smaller);
        return larger;
    }
    public static void main(String args[])
    {
        int numbers[]={25,36,69,95,98,75,98,58,65};
        int getLarger=larger(numbers);
        System.out.println("the largest number is "+getLarger);
    }
}
