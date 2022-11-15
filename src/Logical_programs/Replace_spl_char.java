package Logical_programs;

import java.util.Scanner;

public class Replace_spl_char {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string which contains spl char");
	String name= s.next();
	String correctname=name.replace("@", "a");
	System.out.println(correctname);
}
}
