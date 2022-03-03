import java.util.*;
public class Account {
	private int acc;
	private String ifsc;
	
	
	
	Account(){
		this.acc=121212;
		this.ifsc="sdf12";
		//System.out.println(acc+"\n"+ifsc);
		
	}
	Account(int acc,String ifsc){
		this.acc=acc;
		this.ifsc=ifsc;
		//System.out.println(acc+"\t"+ifsc);
	}



	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	public int compareTo(Account a) {
		return Integer.valueOf(this.getAcc()).compareTo(Integer.valueOf(a.getAcc())) ;
	}
	public void Display() {
		System.out.println("AccountNumber: "+getAcc()+"\nifscNumber: "+getIfsc());
	}
	
	
}
