package dinal;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise1 {
	public static void main (String args[]) {
		Scanner In = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		if (nums.isEmpty()) {
			for ( int i = 0; i < 10; i++) {
				//get user input 
				int num =  In.nextInt();
				nums.add(num);
			}
		}
		int total = 0;
		for (int j : nums ) {
			System.out.println(j);
			total += j;
		}
		System.out.println(total);
	}
	
}

