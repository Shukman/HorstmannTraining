package Training160424;

import java.util.Scanner;

public class InterruptOperator2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Goal! ");
		double goal = in.nextDouble();
		
		System.out.print("Interest n: ");
		double n = in.nextDouble();
		
		double sum = 0;
		
		
		while (sum < goal){
			System.out.print("Enter a number: ");
			n = in.nextInt();
			if (n < 0) {
				continue;
			}
			sum += n;
		}
		
		
	}

}
