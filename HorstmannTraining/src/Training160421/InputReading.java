package Training160421;

import java.util.Scanner;

public class InputReading {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//получить первую вводимую строку
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		//получить вторую вводимую строку
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		//вывести результат на консоль
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
		
		System.out.printf("Hello, %s. Next year, you'll be %d", name, age + 1);
	}

}
