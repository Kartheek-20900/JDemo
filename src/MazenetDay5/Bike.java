package MazenetDay5;

public abstract class Bike {
	
	public abstract void run();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike;
		
		Honda h=new Honda();
		h.run();
		

	}

}


class Honda extends Bike{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda class is derived from Bike class");
	}
	
}