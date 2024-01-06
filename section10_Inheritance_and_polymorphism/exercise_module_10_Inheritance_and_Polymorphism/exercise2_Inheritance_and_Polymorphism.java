package section10_Inheritance_and_polymorphism.exercise_module_10_Inheritance_and_Polymorphism;
import java.util.Scanner;

public class exercise2_Inheritance_and_Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxpayers = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        TaxPayer[] taxpayers = new TaxPayer[numberOfTaxpayers];

        for (int i = 0; i < numberOfTaxpayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");

            System.out.print("Individual or company (i/c)? ");
            char type = scanner.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                scanner.nextLine(); // consume the newline character

                taxpayers[i] = new Individual(name, annualIncome, healthExpenditures);
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                scanner.nextLine(); // consume the newline character

                taxpayers[i] = new Company(name, annualIncome, numberOfEmployees);
            }
        }

        System.out.println("TAXES PAID:");

        double totalTaxes = 0;
        for (TaxPayer taxpayer : taxpayers) {
            double taxesPaid = taxpayer.calculateTaxes();
            totalTaxes += taxesPaid;
            System.out.println(taxpayer.getName() + ": $ " + taxesPaid);
        }

        System.out.println("TOTAL TAXES: $ " + totalTaxes);

        scanner.close();
    }
}

abstract class TaxPayer {
    private String name;
    private double annualIncome;

    public TaxPayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public abstract double calculateTaxes();
}

class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double calculateTaxes() {
        // Implement individual tax calculation logic here
        // Adjusted the formula to consider health expenditures deduction
        return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
    }

}

class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTaxes() {
        // Implement company tax calculation logic here
        // For example purposes, let's use a simple formula
        return getAnnualIncome() * 0.2 - numberOfEmployees * 1000;
    }
}
