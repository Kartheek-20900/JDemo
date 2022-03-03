package MazenetDay6;
import java.util.*;

public class School {
	
	String sch="MySchool";
	
	class Student{
		
		public void describe(String name) {
			System.out.println(name+" schhol name is "+sch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String n=s.nextLine();
		
		School sc=new School();
		School.Student st=sc.new Student();
		st.describe(n);

	}

}
