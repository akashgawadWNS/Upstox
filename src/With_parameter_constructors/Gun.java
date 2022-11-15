package With_parameter_constructors;

public class Gun {
String gunName;
int noOfBullets;
public Gun (String gunName,int noOfBullets) {
	this.gunName = gunName;
	this.noOfBullets = noOfBullets;
}
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("Dhad....");
	}
}
}
