package Training160423;

import java.util.Scanner;

public class CyclesWhile2 {
	
	public static void main(String[] args) {
		
		//прочитать вводимые данные
		Scanner in = new Scanner(System.in);
				
		System.out.print("How much many will you cotribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		//обновить остаток на счету, пока работник не готов выйти на пенсию
		do {
			//добавить ежегодный взнос и проценты
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			//вывести текущий остаток на счету
			System.out.printf("After year %d, your balance is %,.2f%n", year, balance);
			
			//запросить готовность работника выйти на пенсию и получить ответ
			System.out.print("ready to retire? (Y/N) ");
			input = in.next();
		}
		while (input.equals("N"));
	}

}
