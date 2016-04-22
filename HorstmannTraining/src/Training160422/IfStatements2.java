package Training160422;

public class IfStatements2 {

	public static void main(String[] args) {
		
		double yourSales = 38.5;
		double target = 25.6;
		double bonus = 0;
		String performance = null;
		
		if(yourSales >= 2 * target){
			performance = "Exelent";
			bonus = 1000;
		} else if (yourSales >= 1.5 * target){
			performance = "Fine";
			bonus = 500;			
		} else if (yourSales >= target){
			performance = "Satisfactory";
			bonus = 100;			
		}else {
			performance = "Yoe're fired";
		}
		System.out.println("Оценка = " + performance + "\nПолученный бонус = " + bonus);
		
	}

}
