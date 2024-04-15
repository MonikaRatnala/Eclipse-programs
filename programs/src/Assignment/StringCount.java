package Assignment;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "My name is Monika";
        int count=0;
        for (int i=0;i<s.length();i++)
        {
        	if(s.charAt(i) != ' ')
        		count++;
        }
        System.out.println("Total number of Character in String is :"+count);
	}

}
