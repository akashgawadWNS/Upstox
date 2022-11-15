package Exception_Handling;

public class Finally {
public static void main(String[] args) {
	int a= 10;
	int b=0;
	try {
		System.out.println("i am from try block");
	}
	catch(ArithmeticException monky) {
		System.out.println("idiot enter valid denominator");
		System.out.println("exception is handled");
	}
	finally {
		System.out.println("Thank you for using ATM");
	}
}
}
