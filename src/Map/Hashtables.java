package Map;

import java.util.Hashtable;

public class Hashtables {
public static void main(String[] args) {
	Hashtable<Integer, String>t=new Hashtable <Integer, String>();
    t.put(101,"Anand");
    t.put(102,"Bablu");
    t.put(103, "Chandra");
    t.put(104, "Dhanush");
    System.out.println(t);
    //remove any one entry
    t.remove(102);
    System.out.println(t);
	System.out.println("hi")
}
}
