package Logical_programs;

import java.util.Scanner;

public class Replace_multiple_spl_Symbols {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("hey user print the string with special symbols");
	String name= s.next();
	String correctname=name.replaceAll("[^a-zA-Z]","");
	System.out.println(correctname);
}
}
