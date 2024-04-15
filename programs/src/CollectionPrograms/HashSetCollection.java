package CollectionPrograms;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs =  new HashSet();
		  hs.add("100");
		  hs.add("200");
		  hs.add("300");
		  hs.add("400");
		System.out.println(hs.contains("100"));
		System.out.println(hs);
		hs.remove("100");
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		

	}

}
