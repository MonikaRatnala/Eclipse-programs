package CollectionPrograms;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack st = new Stack();
       st.push(100);
       st.push(200);
       st.push("Monika");
       st.push(300);
       st.push(400);
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.push(500);
       System.out.println(st);
       st.peek();
       System.out.println(st);
       st.search(200);
       System.out.println(st);
	} 

}
