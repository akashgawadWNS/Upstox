package Static_Nonstatic_Variables;

public class Sample2 {
	static int i = 10;
	int j =20;
	public static void main(String[] Args) {
		System.out.println(i);
		Sample2 s = new Sample2();
		System.out.println(s.j);
	}
}
