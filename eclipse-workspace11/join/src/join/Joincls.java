package join;

public class Joincls extends Thread{
public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(50);
			
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		Joincls t1=new Joincls();
		Joincls t2=new Joincls();
		Joincls t3=new Joincls();
		t1.start();
		t2.start();
		try {
			t2.join();
			
		}catch(Exception e){
			System.out.println(e);
		}
        t3.start();
	}

}
