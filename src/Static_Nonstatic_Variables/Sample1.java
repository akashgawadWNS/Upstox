package Static_Nonstatic_Variables;

public class Sample1 {
	static int i = 10;
	int j =20;
	public static void main(String[] Args) {
		System.out.println(i);
		Sample1 s = new Sample1();
		System.out.println(s.j);
	}
}
