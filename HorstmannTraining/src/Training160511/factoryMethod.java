package Training160511;

import java.text.NumberFormat;

public class factoryMethod {
	
	public static void main(String[] args) {
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		double x = 0.1;
		System.out.println(currencyFormatter.format(x));
		System.out.println(percentFormatter.format(x));
		
	}

}
