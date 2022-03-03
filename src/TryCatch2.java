import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		int age=sc.nextInt();
		
		try {
			if(age<18) {
				throw new InvalidAgeException("Limit age is 18");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println("error: enter above 18");
		}
		
			
		if(age<18) {
			throw new InvalidAgeException("age is not perfect :"+age);
		}

	}

}
