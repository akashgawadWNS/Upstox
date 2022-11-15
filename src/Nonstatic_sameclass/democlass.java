package Nonstatic_sameclass;

public class democlass {
	public static void main(String[] args) {
		System.out.println("main method is started");
		democlass d = new democlass();
		d.m1();
	    d.m2();
	    d.m3();
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
