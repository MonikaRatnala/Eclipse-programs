package monika;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int n1=0,n2=1,sum=0;
		for(int i=1;i<=num;i++) {
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
			sum=n1+n2;
			
		}
	}

}
