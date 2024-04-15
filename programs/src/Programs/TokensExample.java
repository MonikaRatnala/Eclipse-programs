package Programs;


public class TokensExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1  =  "I am a good girl";
	       System.out.println("Original string: "+str1);
	       int n = str1.length(); 
	 
	       String ReverseString ="";
	       char ch;
	       for(int i=0;i<n;i++) {
	         
	           ch = str1.charAt(i);
	 
	         
	           ReverseString = ch + ReverseString;
	       }
	       System.out.println("Reversed string: "+ReverseString); 
	   }
	
	
	}


