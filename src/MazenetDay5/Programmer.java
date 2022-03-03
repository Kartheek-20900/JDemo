package MazenetDay5;

public class Programmer extends Employee{
	
	int bonus;
	float total_salary;
	
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public float getTotal_salary() {
		return total_salary;
	}
	public void setTotal_salary(float total_salary) {
		this.total_salary = total_salary;
	}
	
	public void totalSalary(float salary) {
		this.total_salary=this.bonus+salary;
		System.out.println("Total Salary is :"+this.total_salary);
		
	}

}
