package With_parameter_constructors;

public class Demo10 {
	public static void main(String[] args) {
		Gun g=new Gun("Rifle",1);
		g.shoot();
		
		
		Gun g1=new Gun("pistol",2);
		g1.shoot();
	}
}