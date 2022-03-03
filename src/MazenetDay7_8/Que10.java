package MazenetDay7_8;
import java.util.*;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		set1.add(2);
		set1.add(6);
		set1.add(4);
		set1.add(8);
		set1.add(0);
		set1.add(1);
		
		set2.add(5);
		set2.add(7);
		set2.add(4);
		set2.add(3);
		set2.add(0);
		set2.add(1);
	
		set1.retainAll(set2);
		System.out.println("The common elements are :"+set1);
		

	}

}
