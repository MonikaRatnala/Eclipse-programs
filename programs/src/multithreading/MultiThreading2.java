package multithreading;

class A implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i<10; i++) {
			System.out.println("Hello1");
		}
	}
	
	
}
class B implements Runnable{
	public void run() {
		for (int i = 0; i<10; i++) {
			System.out.println("Hello2");
		}
	}
	
	
}
public class MultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A c = new A();
B d = new B();
Thread t1 = new Thread(c);
Thread t2 = new Thread(d);

t1.setPriority(1);
t2.setPriority(10);
t1.start();
t2.start();

	}

}
