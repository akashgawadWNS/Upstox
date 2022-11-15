package String_Method;

public class Methods_of_Strings {
public static void main(String[] args) throws Throwable {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="velo";
	//length()
	System.out.println(s1.length());
	//toUppercase()
	System.out.println(s1.toUpperCase());
	//toLowecase
	System.out.println(s1.toLowerCase());
	//equals()
	System.out.println(s1.equals(s2));
	//equalignorecase()
	System.out.println(s1.equalsIgnoreCase(s2));
	//contains()
	System.out.println(s1.contains(s3));
	System.out.println(s2.contains(s3));
	//charAt()
	System.out.println(s2.charAt(0));
	System.out.println(s2.charAt(1));
	//indexOf()
	System.out.println(s2.indexOf(""));
	System.out.println(s2.indexOf("V"));
	Thread.sleep(3000);
	//lastindex of-->it will give inndex of duplicate character
	System.out.println(s1.lastIndexOf('t'));
	//starwith-->it will check whether string with started with particular character or not
	System.out.println(s1.startsWith("ve"));
	//endswith-->it will check given string  is ends with particular character or not
	System.out.println(s1.endsWith("ty"));
	//it we want to BreAK THE STRING 
	//substring()
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(2));
	//how to concat two strings concat()
	System.out.println(s1.concat(s3));
	//replace method will replace th string
	System.out.println(s1.replace("city", "rural"));
}
}
