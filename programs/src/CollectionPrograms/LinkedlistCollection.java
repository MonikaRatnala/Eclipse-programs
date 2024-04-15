package CollectionPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add("India");
        ll.add("New Delhi");
        ll.add(200);
        ll.add(500);
        ll.addFirst("Monika");
        ll.addLast("job");
        System.out.println(ll);
        Iterator itr = ll.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
	}

}
