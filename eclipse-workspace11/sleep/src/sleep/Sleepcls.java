package sleep;
//import java.util.Iterator;
public class Sleepcls extends Thread {

	public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(100);
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		Sleepcls t1=new Sleepcls();
		Sleepcls t2=new Sleepcls();
		t1.start();
		
		t2.start();

	}

}
