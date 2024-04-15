package monika;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String str = sc.nextLine();
	String revstr ="";
//	char ch ;
//	for(int i=0;i<str.length();i++) {
//		ch=str.charAt(i);
//		revstr=ch+revstr;
//	}
//       System.out.println(revstr);
//	}
	int len = str.length();
	for(int i=len-1;i>=0;i--) {
		revstr=revstr+str.charAt(i);
	}
System.out.println(revstr);
}
}