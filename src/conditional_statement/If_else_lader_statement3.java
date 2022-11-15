package conditional_statement;

public class If_else_lader_statement3 {
	public static void main(String[] args) {
		int marks = 92;
		if (marks>=95) {
			System.out.println("pass with distinction");
		}
		else if(marks>=80) {
		    System.out.println("pass with first class");
		}
		else if(marks>=50) {
			System.out.println("pass with second class");
		}
		else if(marks>=40) {
			System.out.println("pass with  third class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
			
		}
	}

}
