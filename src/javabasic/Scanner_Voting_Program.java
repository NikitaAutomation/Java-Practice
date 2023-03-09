package javabasic;

import java.util.Scanner;

public class Scanner_Voting_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age= sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible for voting");
		}

	}

}
