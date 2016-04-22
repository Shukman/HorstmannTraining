package Training160422;

public class IfStatements {
	
	public static void main(String[] args) {
		
		double yourSales = 35.7;
		double target = 25.6;
		int bonus = 0;
		String performance = null;
		
		
		if(yourSales >= target){
			performance = "Satisfactory";
			bonus = 100;
		}
		System.out.println("Оценка = " + performance + "\nПолученный бонус = " + bonus);
		
	}

}
