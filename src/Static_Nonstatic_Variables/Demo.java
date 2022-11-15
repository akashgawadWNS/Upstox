package Static_Nonstatic_Variables;

public class Demo {
static String s = "velocity";
String k = "Ankush";
public static void main(String[] args) {
	System.out.println(s);
	Demo d = new Demo ();
	System.out.println(d.k);
	
}
}
