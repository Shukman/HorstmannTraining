package Training160423;

import java.util.Scanner;

public class OperatorSwitch {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("Select an option (1, 2, 3, 4) ");
		int choice = in.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Вы выбрали первый вариант");
			break;
		case 2:
			System.out.println("Вы выбрали второй вариант");
			break;
		case 3:
			System.out.println("Вы выбрали третий вариант");
			break;
		case 4:
			System.out.println("Вы выбрали четвертый вариант");
			break;
		default:
			System.out.println("Попробуйте еще раз");
			break;		
		}
		
		
		
	}

}
