package test;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int value;
		int product = 1;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Please enter number " + (i + 1) + ": ");
			value = in.nextInt();
			product *= value;
		}

		System.out.println();
		System.out.println("Here is the product of the numbers you have entered: " + product);
	}
}
