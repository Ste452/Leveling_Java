package exercise_module5_Introduction_to_object_oriented_programming.util.main.src;

public class CurrencyConverter {
	public double exchangeRate;
	public double ioFPercentage;

	public CurrencyConverter(double exchangeRate, double ioFPercentage) {
		this.exchangeRate = exchangeRate;
		this.ioFPercentage = ioFPercentage;
	}

	public double convertUSDToBRL(double amountInUSD) {
		double amountInBRL = amountInUSD * exchangeRate;
		double ioF = amountInBRL * (ioFPercentage / 100);
		return amountInBRL + ioF;
	}
}
