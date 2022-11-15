package Method_overriding;

public class M_overriding {
public static void main(String[] args) {
	System.out.println("talk of cat");
	cat c=new cat();
	c.talk();
	
	System.out.println("talk of dog");
	dog d=new dog();
	d.talk();
}
}
