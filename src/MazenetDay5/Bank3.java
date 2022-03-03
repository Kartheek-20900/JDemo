package MazenetDay5;

public class Bank3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBIb sbi=new SBIb();
		sbi.getRateOfInterest();
		
		ICICI ici=new ICICI();
		ici.getRateOfInterest();
		
		Axis ax=new Axis();
		ax.getRateOfInterest();
		

	}

}

class SBIb extends Bank3{
	
	public void getRateOfInterest() {
		System.out.println("RateOfInterest of SBI is :2%");
	}
	
}



class ICICI extends Bank3{
	
	public void getRateOfInterest() {
		System.out.println("RateOfInterest of ICICI is :2.5%");
	}
	
}



class Axis extends Bank3{
	
	public void getRateOfInterest() {
		System.out.println("RateOfInterest of Axis is :1.5%");
	}
	
}
