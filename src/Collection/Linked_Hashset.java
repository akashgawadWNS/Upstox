package Collection;

import java.util.LinkedHashSet;

public class Linked_Hashset {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Ankush");
	lhs.add(100);
	lhs.add('A');
	lhs.add(100);
	lhs.add(null);
	lhs.add(null);
	//print entire data
	System.out.println(lhs);
	//size
	System.out.println(lhs.size());
	//empty
	System.out.println(lhs.isEmpty());
}
}
