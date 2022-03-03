package MazenetDay5;

public class Employee {
	
	private float salary;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		Programmer pro=new Programmer();
		emp.setSalary(45000.45f);
		pro.setBonus(5000);
		pro.totalSalary(emp.getSalary());

	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

}
