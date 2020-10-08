package test;

import java.util.Scanner;

public class Test
{
	public Test
	{
		Scanner kb = new Scanner(System.in)
				
		System.out.println("Enter a random number: ");
		int num = kb.nextInt();
		
		System.out.println();
		System.out.println("Your number is " + num);
	
	}

}

public static void main(String[] args) 
{
	Test mytest = new Test();
}