package monika;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        int org_num=number, rev=0;
        while(number!=0) {
        	rev=rev*10 + number%10;
        	number = number/10;
        }
        if(org_num==rev) {
        	System.out.println(org_num+" is a palindrome Number");
        }
        else
        {
        	System.out.println(org_num+" is not palindrome Number");
        }
	}

}
