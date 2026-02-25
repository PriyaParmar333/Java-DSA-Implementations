import java.util.*;
public class Prime
{
    /*public static boolean Prime(int n)
    {
        //corner cases
        if(n==2)//if this condition s tre the for loop will not execute
        {
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }*/
    //optimized way
    public static boolean prime(int n)
    {
        if(n==2)
        {
           return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        primeInRange(20);
    }
}
