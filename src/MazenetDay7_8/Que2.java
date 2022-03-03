package MazenetDay7_8;

import java.util.LinkedList;
import java.util.List;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll=new LinkedList<>();
		
		ll.add(3);
		ll.add(4);
		ll.add(6);
		ll.add(3);
		ll.add(9);
		ll.add(0);
		
		List<Integer> ll2=new LinkedList<>();
		for(int i=ll.size()-1;i>=0;i--) {
			ll2.add(ll.get(i));
		}
		System.out.println(ll2);
	}

}
