package Training160507;

import java.util.Date;

public class ClassDate {
	
	public static void main(String[] args) {
		
		new Date();
		System.out.println(new Date());
		
		Date birthday = new Date();
		System.out.println(birthday);
		
//		Date deadline = new Date();  1 вариант
		 
//		Date deadline = birthday;  2 вариант
		
		Date deadline = new Date();

		
//		deadline = null;
		
//		if (deadline != null) {
//			System.out.println(deadline);
//		}
		
		birthday = null;
//		String s = birthday.toString(); ERROR!
		
		
		
	}

}
