package threadrun;

public class Threadruncls extends Thread {
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
		Threadruncls t=new Threadruncls();
		t.start();
		t.start();
		System.out.println("two start for same thread");

	}

}
