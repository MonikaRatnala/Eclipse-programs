package multithreading;

class Aa extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello1");
		}
	}
	
}
class Bb extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello2");
		}
	}
	
}

public class MultiThreasding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aa obj1 = new Aa();
Bb obj2 = new Bb();
obj1.start();
obj2.start();
	}

}
