package Training160429;

import java.util.Arrays;

public class ArraysCopy {
	
	public static void main(String[] args) {
		
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		System.out.println(smallPrimes[5]);
		
		int [] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 12; //номеру в массиве приравнивается значение 12 вместо значения 13
		
		System.out.println(smallPrimes[5]);
		System.out.println(Arrays.toString(smallPrimes));
		
		System.out.println(luckyNumbers[2]);
		
		smallPrimes[0] = 0;
		smallPrimes[1] = 2;
		smallPrimes[2] = 4;
		smallPrimes[3] = 6;
		smallPrimes[4] = 8;
		smallPrimes[5] = 10;
		
		System.out.println(Arrays.toString(smallPrimes));
		System.out.println(Arrays.toString(luckyNumbers));
		
		int[] copiedLuckyNumbers = new int[10];
		System.out.println(Arrays.toString(copiedLuckyNumbers));
		
		copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
		System.out.println(Arrays.toString(copiedLuckyNumbers));
		
		luckyNumbers = Arrays.copyOf(luckyNumbers, 2* luckyNumbers.length);
		System.out.println(Arrays.toString(luckyNumbers));
		
		
	}

}
