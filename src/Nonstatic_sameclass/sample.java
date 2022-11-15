package Nonstatic_sameclass;

public class sample {
public static void main(String[] args) {
	System.out.println("main method is started");
	sample s = new sample();
	s.m1();
    s.m2();
    s.m3();
    System.out.println("main method is ended");
}
public static void m1() {
	System.out.println("i am from nonstatic m1 class");
}
public static void m2() {
	System.out.println("i am from nonstatic m2 class");
}
	public static void m3() {
		System.out.println("i am from nonstatic m3 class");
	}
}


