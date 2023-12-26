package section5_Introduction_to_Object_Oriented_Programming.exercise_module5_Introduction_to_object_oriented_programming.main.src;

import java.util.Locale;
import java.util.Scanner;

import section5_Introduction_to_Object_Oriented_Programming.exercise_module5_Introduction_to_object_oriented_programming.util.main.src.CurrencyConverter;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US); // Configuração regional para usar ponto como separador decimal
        System.out.print("Informe a cotação do dólar: ");
        double exchangeRate = sc.nextDouble();

        System.out.print("Informe o valor em dólares a ser comprado: ");
        double amountInUSD = sc.nextDouble();

        System.out.print("Informe a taxa de IOF (em porcentagem): ");
        double ioFPercentage = sc.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(exchangeRate, ioFPercentage);

        double amountInBRL = converter.convertUSDToBRL(amountInUSD);

        System.out.println("O valor em reais a ser pago em dólares é: " + amountInBRL);

        sc.close();
    }
}
