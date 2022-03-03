
import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> hs=new HashSet<>();
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(0);
		hs.add(4);
		System.out.println("HashSet Elements :"+hs);
		
		Account ac=new Account(22,"wsee");
		hs.add(ac.getAcc());
		System.out.println("HashSet Elements :"+hs);
		
		
		Set<Integer> lhs=new LinkedHashSet<>();
		lhs.add(2);
		lhs.add(4);
		lhs.add(1);
		lhs.add(0);
		System.out.println("LinkedHashSet Elements :"+lhs);
		
		Set<String> ts=new TreeSet<>();
		ts.add("abc");
		ts.add("abb");
		ts.add("ess");
		ts.add("zac");
		System.out.print("TreeSet Elements :");
		for(String st:ts) {
			System.out.print(st+" ");
		}
		
	}

}
