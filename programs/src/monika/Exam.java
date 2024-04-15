package monika;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
for(int i=0;i<5;i++) {
	x=x+i;
	if(i==3) {
		continue;
	}
	x=x+2;
}
System.out.println(x);
	}

}
