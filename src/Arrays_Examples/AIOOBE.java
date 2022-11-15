package Arrays_Examples;

public class AIOOBE {//Array index out of bounds exception
	public static void main(String[] args) {
		String ar[]=new String[5];
		ar[0]="Samantha";
		ar[1]="Kritika";
		ar[2]="Kajal";
		ar[3]="Saipallavi";
		ar[4]="Rashmika";
		//print the data which is not present
		try {
		System.out.println(ar[5]);
	}
	catch(ArrayIndexOutOfBoundsException donky) {
		System.out.println("idiot there is no data still u r trying to fetch it means u r waste fellow");
	}
}
}
