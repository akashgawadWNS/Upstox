package Star_pattern;

public class D {//print 4 star rows and column using if else
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if (i==1&&j==1) {
				System.out.print("@");
		}
			else if (i==4&&j==4) {
				System.out.print("#");
			}
			else {
				System.out.print("*");
			}
		}
			System.out.println();	
}
	}
}
