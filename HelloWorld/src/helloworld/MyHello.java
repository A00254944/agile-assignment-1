package helloworld;

import java.util.Scanner;

public class MyHello 
{

	public MyHello()
	{
		Scanner kb = new Scanner(System.in);
				
		System.out.println("Enter a random number: ");
		int num = kb.nextInt();
		
		if (num > 5)
		{
			System.out.println("Hellow World");
		}
		else
		{
			System.out.println("ByeBye World");
		}
		
	}

	public static void main(String[] args) 
	{
		MyHello hellowWorld = new MyHello();
	}

}
