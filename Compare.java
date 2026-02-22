import java.util.Scanner;

public class Compare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println(a+" is Greater");
        }
        else {
            System.out.println(b + " is greater");
        }
    }
}
