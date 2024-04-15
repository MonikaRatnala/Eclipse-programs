package CollectionPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new LinkedList();
		l.add(100);
		l.add(1,600);
		System.out.println(l);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(6,1000);
		System.out.println(l);
		ListIterator itr = l.listIterator();
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
