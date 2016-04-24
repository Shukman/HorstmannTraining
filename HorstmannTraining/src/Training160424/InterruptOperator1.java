package Training160424;

import java.util.Scanner;

public class InterruptOperator1 {
	
	public static void main(String[] args) {
		
		//оператор break
		Scanner in = new Scanner(System.in);

		System.out.print("How much many do you need to retire? ");
		double goal = in.nextDouble();
		
		System.out.print("How much many will you cotribute every year? ");
		double payment = in.nextDouble();

		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		
		while (years <= 100 && balance < goal){
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			if (balance >= goal) {
				years++;
			}
		}
		System.out.println("You can retire in " + years + " years.");
		
		
	}

}
