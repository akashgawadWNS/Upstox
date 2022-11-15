package Logical_programs;

public class Find_white_spaces {
public static void main(String[] args) {
	String name="V E L O C I T Y";
	int count=0;
	for (int i=0;i<=name.length()-1;i++) {
		char v=name.charAt(i);
		if(v==' ') {
			count++;
		}
		}
	System.out.println(count);
	}
}
