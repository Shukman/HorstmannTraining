package Training160422;

public class IfStatements1 {
	
	public static void main(String[] args) {
		
		double yourSales = 35.2;
		double target = 25.6;
		double bonus = 0;
		String performance = null;
		
		if(yourSales >= target){
			performance = "Satisfactory";
			bonus = 100 + 0.01 * (yourSales - target);
		} else {
			performance = "Unsatisfactory";
			bonus = 0;			
		}
		System.out.println("Оценка = " + performance + "\nПолученный бонус = " + bonus);

		
		if(yourSales <= target){
			performance = "Satisfactory";
			bonus = 100 + 0.01 * (yourSales - target);
		} else {
			performance = "Unsatisfactory";
			bonus = 0;			
		}
		System.out.println("Оценка = " + performance + "\nПолученный бонус = " + bonus);
		
	}

}
