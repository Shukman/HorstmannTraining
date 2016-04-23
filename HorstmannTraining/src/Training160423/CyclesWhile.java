package Training160423;

public class CyclesWhile {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 21;
		int z = 0;
		
		while (x < y){
			x += x; //увеличиваем пока не станет больше y
			z++; // количество циклов
		}
			System.out.println("z = " + z + "\nx = " + x);
			
		
	}

}
