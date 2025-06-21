import java.util.Scanner;

public class Exercise7 {
    public static double predictValue(double base, double rate, int time) {
        return (time == 0) ? base : predictValue(base, rate, time - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Initial amount: ");
        double amount = input.nextDouble();
        System.out.print("Growth rate (e.g., 0.05 for 5%): ");
        double rate = input.nextDouble();
        System.out.print("Years to forecast: ");
        int duration = input.nextInt();
        double forecast = predictValue(amount, rate, duration);
        System.out.printf("Predicted value after %d years is %.2f\n", duration, forecast);
        input.close();
    }
}