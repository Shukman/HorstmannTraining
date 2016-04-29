package Training160429;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		//вариант 1:
		int[] a; 
		a = new int[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		//вариант 2:
		int[] b = new int[100];
		
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names)); //заполнен нулями
		for (int i = 0; i < 10; i++) {
			names[i] = "";
		}
		System.out.println(Arrays.toString(names));
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + a[i]);
		}
	}
}
