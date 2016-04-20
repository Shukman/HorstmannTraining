package Training160420;

public class StrBuilder {
	
	public static void main(String[] args) {
		
		char W = 'W';
		char o = 'o';
		char r = 'r';
		char l = 'l';
		char d = 'd';
		System.out.println((int)W);
		
		int cp = 33;
		String str = "Hello";
		String b = " beautiful";
		char ch = '?';
		char c = '!';
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(str);
		builder.append(" " + W + o + r + l + d);
		builder.appendCodePoint(cp);
		
		System.out.println(builder);

		System.out.println(builder.length());
		
		builder.setCharAt(11, ch); //11(!) - кодовая единица по счету от 0 до 11 (Hello World!) 
		System.out.println(builder);
		
		builder.insert(5, b);
		System.out.println(builder);
		
		builder.insert(21, c);
		System.out.println(builder);
		
		builder.delete(22, 23);
		System.out.println(builder);
		
		builder.toString();
		System.out.println(builder);
	}

	

}
