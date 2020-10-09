package test;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int one = in.nextInt();
		System.out.println("Please enter a number: ");
		int two = in.nextInt();
		System.out.println("Please enter a number: ");
		int three = in.nextInt();

		int product = one * two * three;

		System.out.println("Here is the product of the numbers you have entered: " + product);
		System.out.println("Thank you");
	}
}
