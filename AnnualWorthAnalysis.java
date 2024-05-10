import java.util.Scanner;

public class AnnualWorthAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the present worth of the investment project: ");
        double P = scanner.nextDouble();

        System.out.print("Enter the annual equivalent factor: ");
        double A = scanner.nextDouble();

        System.out.print("Enter the interest rate per period: ");
        double i = scanner.nextDouble();

        System.out.print("Enter the number of periods: ");
        double n = scanner.nextDouble();

        System.out.print("Enter the annual operating cost of the investment project: ");
        double C = scanner.nextDouble();

        double AW = calculateAW(P, A, i, n, C);

        System.out.println("The Annual Worth Analysis of the investment project is: " + AW);
    }

    public static double calculateAW(double P, double A, double i, double n, double C) {
        return (P/A) - C;
    }
}
