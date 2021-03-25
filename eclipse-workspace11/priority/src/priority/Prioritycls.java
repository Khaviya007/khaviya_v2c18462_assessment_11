package priority;

public class Prioritycls extends Thread{
	public void run() {
		System.out.println("get priority: "+Thread.currentThread().getPriority());
		System.out.println("Thread running: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Prioritycls t1=new Prioritycls();
		Prioritycls t2=new Prioritycls();
		Prioritycls t3=new Prioritycls();
		t1.start();
	    t2.start();
	    t3.start();
	    
	    
        t1.setName("first thread ");
        t1.setPriority(MIN_PRIORITY);    //1
        t2.setName("second thread ");
        t2.setPriority(MAX_PRIORITY);    //10
        t3.setName("third thread ");
        t3.setPriority(NORM_PRIORITY);    //5
	}

}
