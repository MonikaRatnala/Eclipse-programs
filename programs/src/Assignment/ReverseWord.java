package Assignment;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "My Name Is Monika";       
        String reversedStr = "";    
            
        
        for(int i=0; i<string.length(); i++){    
            reversedStr = string.charAt(i)+reversedStr;    
        }    
            
        System.out.println("Original string: " + string);     
        System.out.println("Reverse of given string: " + reversedStr); 
	}

}
