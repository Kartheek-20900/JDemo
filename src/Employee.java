
public class Employee {
	private int id;
	private String name;
	private int sal;
	private String desi;
	private String insu;
	
	Employee(int id,String name,int sal ,String desi){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.desi=desi;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesi() {
		return desi;
	}
	public void setDesi(String desi) {
		this.desi = desi;
	}
	public String getInsu() {
		return insu;
	}
	
	
	public void setInsu(String insu) {
		this.insu = insu;
	}
	
	public void eligible() {
		this.sal=sal;
		if(this.sal>40000 && this.desi=="Manager") {
			
			this.insu="IA";
			
		}
		else if(this.sal<40000 && this.sal>20000 && this.desi=="Programmer") {
			
			this.insu="IB";
			
		}
		else if(sal<20000 && sal>5000 && this.desi=="System Associate") {
			
			this.insu="IC";
			
		}
		else if(sal<5000 && this.desi=="HouseKeeping"){
			
			this.insu="NA";
			
		}
	}
	public void display() {
		System.out.println("id : "+id+" name : "+name+" salary : "+sal+" designation : "+ desi+" insurence Schema : "+insu);
	}

}
