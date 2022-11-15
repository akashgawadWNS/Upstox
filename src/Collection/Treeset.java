package Collection;

import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(600);
	t.add(400);
	t.add(300);
	t.add(200);
	t.add(500);
	t.add(100);
	//print entire data
	System.out.println(t);
	//size
	System.out.println(t.size());
	//empty
	System.out.println(t.isEmpty());
	//delete first number
	t.pollFirst();
	System.out.println(t);
	//delete last number
	t.pollLast();
	System.out.println(t);
}
}
