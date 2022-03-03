package MazenetDay6;

public class Car {
	
	String make;
	Car(String make){
		this.make=make;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	
	
	class Wheel{
		
		String wheel1,wheel2,wheel3,wheel4;
		Wheel(String wheel1,String wheel2,String wheel3,String wheel4){
			this.wheel1=wheel1;
			this.wheel2=wheel2;
			this.wheel3=wheel3;
			this.wheel4=wheel4;
		}
		public String getWheel1() {
			return wheel1;
		}
		public void setWheel1(String wheel1) {
			this.wheel1 = wheel1;
		}
		public String getWheel2() {
			return wheel2;
		}
		public void setWheel2(String wheel2) {
			this.wheel2 = wheel2;
		}
		public String getWheel3() {
			return wheel3;
		}
		public void setWheel3(String wheel3) {
			this.wheel3 = wheel3;
		}
		public String getWheel4() {
			return wheel4;
		}
		public void setWheel4(String wheel4) {
			this.wheel4 = wheel4;
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car("Maruthi");
		Car.Wheel wl=car.new Wheel("MRF","MRF","MRF","MRF");
		
		System.out.println("Car of make - "+car.getMake()+"\nwheel1 is - "+wl.getWheel1()+"\nwheel2 is - "+wl.getWheel2()+"\nwheel3 is - "+wl.getWheel3()+"\nwheel4 is - "+wl.getWheel4());
		

	}

}
