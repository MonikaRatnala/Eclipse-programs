package Assignment;

public class DuplicateString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "My name is Monika and my sister name is Mamta";    
        int count;    
            
           
        string = string.toLowerCase();    
            
            
        String words[] = string.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                       
                    words[j] = "0";    
                }    
            }    
                 
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }  
	}

}
