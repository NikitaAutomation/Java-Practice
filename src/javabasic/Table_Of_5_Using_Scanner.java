package javabasic;

import java.util.Scanner;

public class Table_Of_5_Using_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int userinput = sc.nextInt();
		for (int i = 1; i <= 10; i++) {

			int result = userinput * i;
			System.out.println(result);

		}

	}

}
