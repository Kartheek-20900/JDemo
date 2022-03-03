package MazenetDay7_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentArrayList_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student_11> list=new ArrayList<>();
		
		Student_11 s1=new Student_11(11,"rahul",20);
		Student_11 s2=new Student_11(24,"ramu",25);
		Student_11 s3=new Student_11(30,"ramesh",15);
		Student_11 s4=new Student_11(20,"rah",30);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list,new StudentComparator());
		System.out.println(list);
		
		Collections.sort(list);
		
		for(Student_11 i:list) {
			System.out.println(i.getRoll()+"  "+i.getName()+"  "+i.getAge());
		}
		
		

	}

}
