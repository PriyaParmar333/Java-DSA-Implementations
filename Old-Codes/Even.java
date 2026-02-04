import java.util.*;
public class Even
{
    public static boolean isEven(int n)
    {
        boolean even=true;
        if(n%2!=0)
        {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int number=sc.nextInt();
        System.out.println(isEven(number));
    }
}
