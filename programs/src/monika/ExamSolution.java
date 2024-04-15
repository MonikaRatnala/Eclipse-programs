package monika;

import java.util.Scanner;

public class ExamSolution {
	static String longestPrefix(String[] strs) {
		if(strs==null || strs.length==0) {
			return "No";
		}
		String Prefix =strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(Prefix )!= 0) {
				Prefix =Prefix.substring(0,Prefix.length()-1);
				if(Prefix.length()==0) {
					return "No";
				}
			}
		}
		return Prefix;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String strings[] = new String[num];
		for(int i=0;i<num;i++) {
			strings[i]=sc.nextLine();
		}
       System.out.println(longestPrefix(strings));
	}

}
