package Assignment;

public class StringVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Hi Myself Monika";
        int vcount=0, ccount=0 ;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        	{
        		vcount++;
        	}
        	else if(s.charAt(i)>='a' && s.charAt(i)<='z')
        	{
        		ccount++;
        	}
        	
        	
        	
        }
        
        System.out.println("Total number of Vowel in String :"+ vcount);
        System.out.println("Total number of Consonant in String :"+ ccount);
        
	}

}
