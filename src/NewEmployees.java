
public class NewEmployees {
	
	private int id;
	private String name,gender;
	private int sal;
	private int age;
	
	
	NewEmployees(int id,String name,int sal,int age,String gender){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.age=age;
		this.setGender(gender);
		
	}

	public NewEmployees() {
		// TODO Auto-generated constructor stub
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void display() {
		System.out.print(getId());
		System.out.print(getName());
		System.out.print(getSal());
		System.out.print(getAge());
		System.out.println(getGender());
	}
	
	public String toString() {
		
		/*System.out.print(getId());
		System.out.print(getName());
		System.out.print(getSal());
		System.out.print(getAge());*/
	
		String s=String.valueOf(getId())+getName()+String.valueOf(getSal())+String.valueOf(getAge())+getGender();
		
		return s;
	}
	
	

	


}
