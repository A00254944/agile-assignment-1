package helloworld;

import java.util.Scanner;

public class MyProduct 
{

	public MyProduct() 
	{
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		int product = 1;
		
		do {
			
			System.out.print("Enter number " + count + ": ");
			int number = input.nextInt();
			
			
			System.out.println("Product is: " + (product *= number) + "\n");
			count++;
			
			
		}while(count < 4);
		
	}
		

	public static void main(String[] args) 
	{
		MyProduct newProduct = new MyProduct();
	}

}
