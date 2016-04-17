package Training160417;

public class StringType {
	
	public static void main(String[] args) {
		
		String e = "";
		String greeting = "Hello";
		
		System.out.println(e);
		System.out.println(greeting);
		
		String s = greeting.substring(1, 3);
		System.out.println(s);
		
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13;
		System.out.println(message);
		
		int age = 13;
		String rating = "PG" + age;
		System.out.println(rating);
		
		System.out.println("The answer is " + rating);
		
		greeting = greeting.substring(0, 3)+ "p!";
		System.out.println(greeting); //изменение строки
		
		
	}

}
