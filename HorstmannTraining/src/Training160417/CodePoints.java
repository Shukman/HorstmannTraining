package Training160417;

public class CodePoints {
	
	public static void main(String[] args) {
		
		String greeting = "Hello, World";
		
		int x = greeting.length();
		System.out.println(x);
		
		int cpCount = greeting.codePointCount(0, greeting.length()); //определить истинную длину
		System.out.println(cpCount); 
		
		char first = greeting.charAt(1);
		System.out.println(first);
		
		char last = greeting.charAt(7);
		System.out.println(last);
		
		int j = 11;
		int index = greeting.offsetByCodePoints(0, j);
		int cp = greeting.codePointAt(index);
		System.out.println(cp);
		
		System.out.println((char)100);
		
		String sentence = "O is the set of octonions";
		System.out.println(sentence.length() + " - количество символов");
		char ch = sentence.charAt(1);
		System.out.println(ch + " - space");
		
//		int i = 0;
//		int cp1 = sentence.codePointAt(i);
//		if(Character.isSupplementaryCodePoint(cp1)) {
//			i += 2;
//			System.out.println((char)cp1);
//		} else {
//			i++;
//			System.out.println((char)cp1);
//		}
		
		System.out.println("слева направо");
		for (int k = 0; k < sentence.length(); k++){
			System.out.println(sentence.substring(k, k+1));
		}
		
		System.out.println("справа налево");
		for (int z = sentence.length(); z > 0; --z){
			System.out.println(sentence.substring(z-1, z));
		}
		
//		int y = 25;
//		
//		y--;
//		if(Character.isSurrogate(sentence.charAt(y))) {
//			y--;
//		}
//		int cp2 = sentence.codePointAt(y);
//		System.out.println((char)cp2);
		
	}

}
