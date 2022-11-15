package Static_Nonstatic_Variables;

public class Sample4 {
	static int i = 10;
	int j =20;
	public static void main(String[] Args) {
		System.out.println(i);
		Sample4 s = new Sample4();
		System.out.println(s.j);
	}
}
