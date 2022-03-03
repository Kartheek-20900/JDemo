
public class Customer {
	private String name;
	private Address add;
	private int age ;
	private double bal;
	private Account acc;
	static int id;
	
	
	public void setDetails(String name,Address add,int age,double bal ,Account acc) {
		this.name=name;
		this.add=add;
		this.age=age;
		this.bal=bal;
		this.acc=acc;
		
	}
	public Account getAccount() {
		return acc;
	}
	
	public String getName() {
		return name;
	}
	public Address getAdd() {
		return add;
	}
	public int getAge() {
		return age;
	}
	public double bal() {
		return bal;
	}
	
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Customer.id = ++id;
	}
	 public static  int id() {
		++id;
		return id;
	}
	
	public void displayDetails() {
		System.out.println(" Name : "+name+" id : "+Customer.id()+"\n  add : "+add.getL1()+","+add.l2+","+add.city+","+add.state+","+add.p+"\n  age : "+age+"\n  bal : "+bal+"\n  AccountNum :"+getAccount().getAcc()+"\n  ifsc :"+getAccount().getIfsc());
	}
	
	//public void changeAdd(String newAdd) {
		//add=newAdd;
	//}
	

}
