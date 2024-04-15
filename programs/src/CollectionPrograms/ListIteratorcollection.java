package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorcollection {

	public static void main(String[] args) {
		List al = new ArrayList();
		  al.add(100);
	      al.add(200);
	      al.add(300);
	      al.add(400);
	      al.add(100);
	      al.add("Monika");
	      System.out.println(al);
	      al.remove("Monika");
	     System.out.println(al);
	     System.out.println(al.contains(200));
	     ListIterator itr = al.listIterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	     while(itr.hasPrevious())
	     {
	    	System.out.println(itr.previous());
	     }
	}

}
