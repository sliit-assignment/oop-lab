package sapumal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex3 {
	public static void main(String[] args) {
		 Set<Integer> studentHeight = new HashSet<Integer>();
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i = 0; i < 10; i++) {
			 System.out.print("Enter height " + (i + 1) + ": ");
			 studentHeight.add(sc.nextInt());
		 }
		 
		 for(Object object: studentHeight) {
			 System.out.print(object + " ");
		 }
		 
		 sc.close();
	}
}
