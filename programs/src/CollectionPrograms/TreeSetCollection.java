package CollectionPrograms;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet ts = new TreeSet();
       ts.add("100");
       ts.add("200");
       ts.add("300");
       ts.add("400");
       System.out.println(ts.contains("100"));
       System.out.println(ts);
       Iterator itr = ts.iterator();
       while(itr.hasNext())
       {
       	System.out.println(itr.next());
       }
	}
	
	}


