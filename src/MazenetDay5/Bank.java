package MazenetDay5;

public interface Bank {
	
	public void ROI();
	
	
	public static void main(String[] srgs) {
		
		SBI sbi=new SBI();
		sbi.ROI();
		
	}
}


class SBI implements Bank{

	@Override
	public void ROI() {
		// TODO Auto-generated method stub
		System.out.println("Rate Of Interest is : 2%");
		
	}
	
	
}
