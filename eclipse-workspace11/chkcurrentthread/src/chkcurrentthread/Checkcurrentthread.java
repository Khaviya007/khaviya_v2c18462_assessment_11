package chkcurrentthread;

public class Checkcurrentthread extends Thread{
	
public void run() {
	System.out.println("Thread running: "+Thread.currentThread().getName());
}
	public static void main(String[] args) {
		Checkcurrentthread t1=new Checkcurrentthread();
		Checkcurrentthread t2=new Checkcurrentthread();
		
		t1.start();
	    t2.start();
        t1.setName("first thread ");
        t2.setName("second thread ");
	}
}
