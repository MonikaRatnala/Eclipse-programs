package multithreading;

class Data extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Data");
		}
	}
}

public class MultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data d = new Data();
d.start();

	}

}
