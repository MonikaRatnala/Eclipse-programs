package CollectionPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String>();	
hm.put(101,"Monika");
hm.put(102,"Indu");
hm.put(103,"Swathi");
for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
System.out.println("Keys: "+hm.keySet());  
System.out.println("Values: "+hm.values());  	
hm.remove(102);	
System.out.println(hm);
HashMap<Integer,String>m=new HashMap<Integer,String>();
m.putAll(hm);
m.putIfAbsent(104,"mamta");
System.out.println(m);

	}

}
