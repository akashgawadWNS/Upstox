package Logical_programs;

import java.util.Scanner;

public class Accept_input_from_user {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("ley user enter first number");
	int num1 = scan.nextInt();
	System.out.println("ley user enter second number");
	int num2=scan.nextInt();
	System.out.println(num1+num2);
}
}
