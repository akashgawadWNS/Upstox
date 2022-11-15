package Without_parameter_constructors;

public class sample {
public static void main(String[] args) {
	Demo g=new Demo ();
	g.gunName = "Ak47";
	g.noOfBullets = 1;
	g.shoot();

     Demo g1=new Demo ();
     g1.gunName = "pistol";
     g1.noOfBullets=2;
     g1.shoot();
	
	Demo g2=new Demo ();
	g2.gunName ="gun";
	g2.noOfBullets = 1;
	g2.shoot();
	
	Demo g3=new Demo ();
	g3.gunName = "gun";
	g3.noOfBullets = 2;
	g3.shoot();
	
	Demo g4 =new Demo ();
	g4.gunName = "banduk";
	g4.noOfBullets = 1;
	g4.shoot(); 
}
}