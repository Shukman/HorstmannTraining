package Training160421;

import java.util.Date;

public class OutputDataFormat {
	
	public static void main(String[] args) {
		
		double x = 10_000.0 / 3.0;
		System.out.println(x);
		
		System.out.printf("%8.2f", x);
		
		System.out.println();
		System.out.printf("%,.2f", 10000.0 / 3.0);
		
		System.out.println();
		System.out.printf("%tc", new Date());
	}

}
