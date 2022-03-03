import java.util.Scanner;

public class TryCatchSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int salary=sc.nextInt();
		
		try{
			if(salary<5000) {
				throw new SalaryException("salary is less than 5000");
			}
		}
		catch (SalaryException e) {
			System.out.println("salary is less");
		}
	

	}

}
