package conditional_statement;

public class If_else_lader_statement4 {
	public static void main(String[] args) {
	int marks=82;
	if(marks>=85){
	System.out.println("pass with distinction");
	}
	else if (marks>=60){
	System.out.println("pass with first distinction");
	}
	else if (marks>=50){
	System.out.println("pass with second distinction");
	}
	else if (marks>=40){
	System.out.println("pass with third distinction");
	}
	else if (marks>=35) {
		System.out.println("pass");
	}
	else {
	System.out.println("fail");
	}
	}
}