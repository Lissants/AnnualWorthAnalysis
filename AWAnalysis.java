import java.util.Scanner;

public class AWAnalysis{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|     ECONOMICS OF INFORMATION SYSTEMS FINAL PROJECT    |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|       BY GROUP 2: Christopher, Michelle, Nadhief      |");
        System.out.println("+-------------------------------------------------------+");
        
        // Input
        System.out.print("| Enter Initial Investment value: ");
        double initialInvest = input.nextDouble();

        System.out.print("| Enter the number of years: ");
        int numYear = input.nextInt();

        System.out.print("| Enter Annual Revenue value: ");
        double annualRev = input.nextDouble();

        System.out.print("| Enter the Interest or MARR Rate in Decimal: ");
        double inteRate = input.nextDouble();

        System.out.print("| Enter the Salvage value: ");
        double slvg = input.nextDouble();

        System.out.print("| Enter the Annual Cost: ");
        double ope = input.nextDouble();

        System.out.println("+-------------------------------------------------------+");

        // Sinking Fund Factor Calculation (A/F,i,n)
        double SFund = slvg * (inteRate / (Math.pow(1 + inteRate, numYear) - 1));

        // Capital Recovery Factor Calculation (A/P,i,n)
        double capRecovery = initialInvest * ((inteRate * Math.pow(1 + inteRate, numYear)) / (Math.pow(1 + inteRate, numYear) - 1));

        /* Annual Worth Calculation
        AW = -Initial Invest(A/P,i,n) + Salvage Value(A/F,i,n) + (Annual Revenue - AnnualCost) */
       double annualWorth = - capRecovery + SFund + (annualRev - ope); 

        // Output
        System.out.printf("The Annual Worth is: %.2f", annualWorth);
        
    }
}