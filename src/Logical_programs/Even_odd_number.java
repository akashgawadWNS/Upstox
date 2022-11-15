package Logical_programs;

import java.util.Scanner;

public class Even_odd_number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("user enter num");
	int num=s.nextInt();
	if(num%2==0){
		System.out.println("given no is even");
	}
	else {
		System.out.println("given no is odd");
	}
}
}
