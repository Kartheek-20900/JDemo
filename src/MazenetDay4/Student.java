package MazenetDay4;

import java.util.Scanner;

public class Student {
	int id;
	String name,degree;
	int ex,c;
	Scanner sc=new Scanner(System.in);
	
	public void setValues(int idn,String n) {
		id=idn;
		name=n;
	}
	public void getValues() {
		System.out.println("id no is :"+id+"\tname is : "+name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		s.setValues(1, "ashdrf");
		s.getValues();
		Student s1=new Student();
		s1.setValues(2, "atrthh");
		s1.getValues();
		Student s2=new Student();
		s2.setValues(3, "cdgrt");
		s2.getValues();
		
	}

}

