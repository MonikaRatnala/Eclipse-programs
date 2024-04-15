package Programs;

import java.util.StringTokenizer;

public class TokensExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		   StringTokenizer st = new StringTokenizer("I am a good girl");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     }  
		   }  
		  
	}


