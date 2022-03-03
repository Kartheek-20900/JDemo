
class RThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method thread :"+Thread.currentThread().getName());
		
	}
	
}

public class ExtendsRThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread :"+Thread.currentThread().getName());
		
		Thread t=new Thread();
		t.start();
		Thread t0=new Thread(new RThread());
		t0.start();
		Thread t1=new Thread(new RThread(),"T1");
		t1.start();
		Thread t2=new Thread(new RThread(),"T2");
		t2.start();
		t2.run();
		
	}

}
