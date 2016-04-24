package Training160424;

import java.math.BigInteger;

public class LargeNumber {
	
	public static void main(String[] args) {
		
		BigInteger a = BigInteger.valueOf(123456789);
		
		BigInteger b = BigInteger.valueOf(987654321);
		
		BigInteger c = a.add(b);
		System.out.println(c);
		
		BigInteger d = c.multiply(b.add(BigInteger.valueOf(987654321)));
		System.out.println(d);
		
		
		
	}

}
