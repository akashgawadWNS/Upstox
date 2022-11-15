package Nonstatic_different_class;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println(" demo class open");
		Demo2 d = new Demo2();
		d.t1();
		d.t2();
		System.out.println("demo class close");
	}
}
