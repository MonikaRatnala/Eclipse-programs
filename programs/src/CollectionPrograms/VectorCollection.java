package CollectionPrograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector v = new Vector();
      v.add(100);
      v.add(200);
      v.add("Monika");
      v.addElement("Ratnala");
      v.add(1,"Indu");
      v.add(null);
      v.add(null);
      System.out.println(v);
      System.out.println(v.firstElement());
      System.out.println(v.lastElement());
      System.out.println(v);
      Iterator itr = v.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());  
      }
      
      Enumeration e = v.elements();
      while(e.hasMoreElements())
      {
    	  System.out.println(e.nextElement()); 
      }
      
	}

}
