package MazenetDay7_8;

public class Student_11 implements Comparable<Student_11>{
	
	private int roll;
	private String name;
	private int age;
	
	public Student_11(int roll,String name,int age) {
		this.roll=roll;
		this.name=name;
		this.age=age;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		
		return "roll="+roll+" name="+name+" age="+age;
	}

	@Override
	public int compareTo(Student_11 o) {
		// TODO Auto-generated method stub
		if(age==o.age) {
			return 0;
		}
		else if(age>o.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
