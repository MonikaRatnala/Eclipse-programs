package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map map = new HashMap();
map.put(1,"Apple");
map.put(2,"Oranges");
map.put(3,"Grapes");
Set s = map.entrySet();
Iterator itr = s.iterator();
while(itr.hasNext())
   {
	Map.Entry entry = (Map.Entry)itr.next();
	System.out.println(entry.getKey()+" "+entry.getValue());
	}
	}
}
