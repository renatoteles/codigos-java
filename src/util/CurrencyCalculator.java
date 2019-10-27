package util;

public class CurrencyCalculator {

	public static final double IOF = 0.06;

	public static double ValorDolaresIOF(double precoDolar, double quantDolar) {
		double total = precoDolar * quantDolar;
		return total + ( total * IOF );
	}
	
}
