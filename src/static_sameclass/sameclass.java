package static_sameclass;

public class sameclass {
public static void main(String[] args) {
	System.out.println("main method is started");
	
	d1();
	d2();
	d3();
	System.out.println("main methis is ended");
}
public static void d1() {
	System.out.println("i am from d1 static method");
}
public static void d2() {
	System.out.println("i am from d2 static method");
}
	public static void d3() {
		System.out.println("i am form d3 static method");
	}
}
