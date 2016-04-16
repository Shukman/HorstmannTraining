package Training160416;

public class logicOperators {
	
	public static void main(String[] args) {
		
		
		int x = 0;
		int y = 1;
		System.out.println(x != 0 && 1/x > x + y);
		
		int x1 = 2;
		int y1 = 1;
		System.out.println(x1 == 2 && x1 > x1 - y1);
		
		int i = 1;
		int j = 0;
		System.out.println(i != 1 || i > i - j);
		
		int i1 = 2;
		int j1 = 1;
		System.out.println(i1 == 2 || i1 > i1 -j1);
		
		int p = 10;
		int k = 5;
		System.out.println(p > k ? p : k);
		
		int p1 = 10;
		int k1 = 5;
		System.out.println(p1 < k1 ? p1 : k1);
		
		int n = 119;
		System.out.println(Integer.toBinaryString(n));
		int fourthBitFromRight = (n & 8) / 8;
		System.out.println(fourthBitFromRight); // будет равно единице, если четвертый бит в двоичном виде будет равен 1, если равен 0 то и значение будет равно 0 
		
		
		
	}

}
