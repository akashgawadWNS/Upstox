package Nonstatic_different_class;

public class userlogic {
public static void main(String[] args) {
	System.out.println("main method is started");
	businesslogic b = new businesslogic();
	b.m1();
	b.m2();
	System.out.println("main method is ended");
}
}
