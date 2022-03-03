package MazenetDay7_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al=new ArrayList<>();
		
		al.add("yes");
		al.add("no");
		al.add("from");
		al.add("you");
		
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
