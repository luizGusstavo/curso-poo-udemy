package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double calcDollar(double dollar, double value ) {
		return (IOF * dollar * value) + dollar * value;
	}
}
