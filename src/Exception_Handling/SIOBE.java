package Exception_Handling;

public class SIOBE {//String_index_out_of_Bounds_Exception
public static void main(String[] args) throws Throwable {
	String s1="velocity";
	try {
		System.out.println(s1.charAt(6));
	}
	catch (StringIndexOutOfBoundsException a) {
		System.out.println("Idiot there is no data u trying to fetch");
	}
	Thread.sleep(3000);
}
}