package Training160502;

public class LotteryArray {
	
	public static void main(String[] args) {
		
		final int NMAX = 10;
		
		//выделить память под треугольный массив
		
		int[][] odds = new int[NMAX + 1][];
		for (int n = 0; n <= NMAX; n++) {
			odds[n] = new int[n + 1];
		}
		
		//заполнить треугольный массив
		
		for (int n = 0; n < odds.length; n++) {
			for (int k = 0; k < odds[n].length; k++) {
				
				/*
				 * вычеслить биноминальный коэффициент:
				 * n*(n-1)*(n-2)*...*(n-l+1)/(1*2*3*...*k)
				 */
				
				int loteryOdds = 1;
				for (int i = 1; i <= k; i++) {
					loteryOdds = loteryOdds * (n-i+1)/i;
					
				}
				odds[n][k] = loteryOdds;
			}
		}
			//вывести треугольный массив
			for(int[] row : odds) {
				for(int odd : row) {
					System.out.printf("%4d", odd);
						
				}
				System.out.println();
			}
	
		
	}

}
