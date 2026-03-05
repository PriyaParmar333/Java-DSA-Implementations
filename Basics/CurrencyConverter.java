import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double inr = sc.nextDouble();

        double exchangeRate = 83; // 1 USD = 83 INR (assumed)

        double usd = inr / exchangeRate;

        System.out.println("Amount in USD: " + usd);
    }
}

