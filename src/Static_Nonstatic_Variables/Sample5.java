package Static_Nonstatic_Variables;

public class Sample5 {
	static int i = 10;
	int j =20;
	public static void main(String[] Args) {
		System.out.println(i);
		Sample5 s = new Sample5();
		System.out.println(s.j);
	}
}
