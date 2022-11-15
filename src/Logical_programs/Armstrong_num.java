package Logical_programs;

public class Armstrong_num {
public static void main(String[] args) {
	int num=153;
	int actnum=num;
	int r=0;
	int armnum=0;
	while(num>0) {
		r=num%10;//it is used to extract the no
		armnum=r*r*r+armnum;//take cube of num
		num=num/10;
	}
	if (armnum==actnum) {
		System.out.println("given num is armstrong");
	}
	else {
		System.out.println("given num is not armstrong");
		}
	}
}

