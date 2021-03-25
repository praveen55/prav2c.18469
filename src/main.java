
public class main extends Thread {

	public static int a =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main thread = new main();
		thread.start();
		thread.isAlive();
		{
		System.out.println("Running");
		}
		thread.setPriority(MAX_PRIORITY);
		thread.setPriority(MIN_PRIORITY);
		{
			System.out.println("Thread is Running");
		}
		System.out.println(a);
		a++;
		System.out.println(a);
	}
		public void run(){
			a++;
		}
	}