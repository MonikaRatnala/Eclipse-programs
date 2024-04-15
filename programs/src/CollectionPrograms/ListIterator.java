package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List li = new ArrayList();
      li.add(10);
      li.add(1,"Monika");
      System.out.println(li);
      li.add("monika");
      li.add(200);
      li.add(null);
      System.out.println(li);
      List al = new ArrayList();
      al.add("Sharukh");
      System.out.println(al);
      al.addAll(li);
      System.out.println(al);
      al.add(10);
      al.add(null);
      System.out.println(al);
      al.remove(null);
      al.remove(0);
      System.out.println(al);
      Iterator itr = al.iterator();
      while(itr.hasNext())
      {
    	System.out.println(itr.next());
      }
      
	}
	

}
