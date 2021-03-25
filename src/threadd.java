
public class threadd extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadd Thread = new threadd();
		Thread thread = new Thread(Thread);
		Thread.start();
		Thread.isAlive();
		System.out.println("Thread is Running");
	}
	public void run() {
		System.out.println("Run Method");		
	}
}
