package Static_Nonstatic_Variables;

public class Sample3 {
	static int i = 10;
	int j =20;
	public static void main(String[] Args) {
		System.out.println(i);
		Sample3 s = new Sample3();
		System.out.println(s.j);
	}
}
