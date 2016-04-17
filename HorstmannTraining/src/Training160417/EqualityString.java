package Training160417;

public class EqualityString {

	public static void main(String[] args) {
		
		String s = "Hello";
		String t = "Hello";
		String n = "Hi";
		
		System.out.println(s.equals(t));
		System.out.println(n.equals(t));
		
		System.out.println("Hello".equals(s));
		
		System.out.println("HeLlO".equalsIgnoreCase("hello"));
		System.out.println("HeLlO".equals("hello"));
		
		System.out.println("--------------------------");
		
		if(s.length() == 0){
			System.out.println("true");
		}else {
			System.out.println("false");
			
			System.out.println("-------------------");
		}
		if(s.equals("")){
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		System.out.println("-------------------");
		System.out.println("finish");
	}
}
