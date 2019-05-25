// Problem: https://projecteuler.net/problem=1
// Java 8
// Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3And5 {
	
	
	public static void main(String args[]) {
		List<Integer> subWithThree = new ArrayList<Integer>();
		List<Integer> subWithFive = new ArrayList<Integer>();
		
		for (int i=0;i<1000;i++) {
			if (i%3 == 0) {
				subWithFive.add(i);
			}
		}
		
		
		for (int i=0;i<1000;i++) {
			if (i%5 == 0) {
				subWithFive.add(i);
			}
			
		}
		for (int i : subWithFive) {
			System.out.println(i);
			}
		
		System.out.println("ez utan kiveszem a kozoset");
		
		for (int i=0;i<subWithFive.size();i++) {
			if (subWithFive.get(i) % 3 == 0 && subWithFive.get(i) % 5 ==0) {
				subWithFive.remove(i);
			}
		}
				for (int i : subWithFive) {
					System.out.println(i);
					}
				
				for (int i=0;i<1000;i++) {
					if (i % 3 == 0 && i % 5 ==0) {
						subWithFive.add(i);
					}
				}	
				
				for (int i : subWithFive) {
					System.out.println(i);
					}
		
				int sum = 0;
				for (int i : subWithFive) {
					sum = sum + i;
				
					}
		
				System.out.println(sum);
		
		
	}
}
