
class TThread extends Thread{
	
	public void run() {
		System.out.println("run method thread :"+Thread.currentThread().getName());
	}
}


public class ExtendsTThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread :"+Thread.currentThread().getName());
		Thread tt=new TThread();
		tt.start();
		new TThread().start();
		new TThread().start();
		Thread tt1=new TThread();
		tt1.start();

	}

}

