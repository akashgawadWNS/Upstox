package Collection;

import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList ln=new LinkedList();
	ln.add("Ganapti");
	ln.add(100);
	ln.add('A');
	ln.add(100);
	ln.add(null);
	ln.add(null);
	//print entire data
	System.out.println(ln);
	//size
	System.out.println(ln.size());
	//empty
	System.out.println(ln.isEmpty());
	//insertion
	ln.add(1,200);
	System.out.println(ln);
	//remove
	ln.remove(1);
	System.out.println(ln);
}
}
