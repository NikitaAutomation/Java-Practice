package javabasic;

import java.util.Scanner;

public class Scanner_Division_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number : ");
	float num1= sc.nextFloat();
	System.out.println("Enter 2nd number : ");
	float num2= sc.nextFloat();
		
	if(num2==0)
	{
		System.out.println("Invalid number");
	}
	else
	{
	float result=num1/num2;
	System.out.println("Result is "+ result);
	}
		
		
		
		
		
		
		
		
		
	}

}
