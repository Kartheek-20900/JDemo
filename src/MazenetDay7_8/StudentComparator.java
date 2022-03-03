package MazenetDay7_8;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student_11> {

	@Override
	public int compare(Student_11 o1, Student_11 o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
	}

}
