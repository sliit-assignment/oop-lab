package sapumal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		listGenericTotal(addElementGenericArray());
	}
	
	public static List<Integer> addElementGenericArray(){
		List<Integer> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int number;
		
		if(arr.size() == 0) {
			for(int i = 0; i < 10; i++) {
				System.out.println("Enter number" + (i + 1) + ": ");
				number = input.nextInt();
				arr.add(number);
			}
		}else {
			System.out.println("ArrayList is not empty");
		}

		input.close();

		return arr;
	}
	
	public static void listGenericTotal(List<Integer> arr) {
		int total = 0;
		for (int x : arr) {
			total += x;
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Total: " + total);
	}
}
