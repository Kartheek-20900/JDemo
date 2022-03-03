
public class Address {
	String l1;
	String l2;
	String state;
	String city;
	String p;
	Address(String l1,String l2,String state,String city,String p){
		this.l1=l1;
		this.l2=l2;
		this.city=city;
		this.state=state;
		this.p=p;
	}
	public  String getL1() {
		return l1;
	}
	public void setL1(String l1) {
		this.l1 = l1;
	}
	public String getL2() {
		return l2;
	}
	public void setL2(String l2) {
		this.l2 = l2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	

}
