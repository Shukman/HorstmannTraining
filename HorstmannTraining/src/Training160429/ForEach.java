package Training160429;

import java.util.Arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		int[] a = new int[10];

		for(int element : a) {
			System.out.print(" " + element);
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			a[i] = i;
		}
		System.out.println(Arrays.toString(a));
		

		for(int element : a) {
			System.out.print(" " + element);
		}
		
		int[] b = {1, 3, 4, 5, 2, 8, 6, 5};
		System.out.println();
		for(int lem : b) {
			System.out.print(" " + lem);
		}
	}
}
