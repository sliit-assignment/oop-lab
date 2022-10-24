package dinal;

import java.util.HashSet;
import java.util.Scanner;

class exercise3{
	public static void main(String args[]) {
		HashSet <Integer> heights = new HashSet<Integer>();
		Scanner in = new Scanner(System.in);
		for( int i = 0; i < 10 ; i++) {
			heights.add(in.nextInt());
		}
		for (int j : heights) {
			System.out.println(j);
		}
	}
}