package Training160501;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) {
		
		int[] a = new int[10000];

		Arrays.sort(a);
		
		int[] b = {-1, 1, 0, -10, 9, 2, -2, 13, -31, 25, 55, 12};
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
	}

}
