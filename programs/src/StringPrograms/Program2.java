package StringPrograms;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		 String str = sc.nextLine();
		 String ReverseString = "";
		 for(int i=0; i<str.length();i++)
		 {
			 ReverseString = str.charAt(i) + ReverseString;
		 }
		 System.out.println("The Reverse String is : " +ReverseString);
		if(str.equals(ReverseString))
		{
		 System.out.println("This is palindrome String");
		}
		else
		{
			System.out.println("This is not a Palindrome String");
		}
	}

}
