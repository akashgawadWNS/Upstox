package Logical_programs;

public class F_product {//print multipication of no 1 to 10
	public static void main(String[] args) {
		int num=10;
		int product=1;
		for (int i=1;i<num;i++) {
			product=product*i;
		}
		System.out.println(product);
	}

}
