package Training160421;

import java.util.Scanner;

public class InputReading2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Что вы будете покупать? ");
		String name = in.nextLine();

		System.out.print("Какое количество? ");
		int num = in.nextInt();
		
		System.out.print("Что то еще? ");
		String name1 = in.next();
		
		System.out.println("Итого, вы взяли: " + name+ " " + num +" шт и " + name1);
		

		
	}

}
