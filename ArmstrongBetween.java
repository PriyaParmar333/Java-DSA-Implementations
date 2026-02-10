import java.util.Scanner;

public class ArmstrongBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;
            int digits = 0;
            int sum = 0;

            // count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;

            // calculate Armstrong sum
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
