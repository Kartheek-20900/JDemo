import java.util.*;
public class ListEx<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(1);
		al.add(0);
		//Collections.sort(al);
		System.out.println("ArrayList Elements :"+al);

		
		List<Account> aa=new ArrayList<>();//Object ArrayList
		Account ac=new Account();
		Account ac0=new Account(2445,"asdf90");
		Account ac1=new Account(2325,"asdf33");
		ac.setAcc(23);
		ac.setIfsc("aaa");
		aa.add(ac);
		aa.add(ac0);
		aa.add(ac1);
		//Collections.sort(aa);
		for(Account a:aa) {
			System.out.print(a.getAcc()+"\t");
			System.out.println(a.getIfsc());
		}
		
		
		List<String> ll=new LinkedList<>();
		ll.add("abc");
		ll.add("abb");
		ll.add("ess");
		ll.add("zac");
		System.out.print("LinkedList Elements :");
		for(String st:ll) {
			System.out.print(st+" ");
		}System.out.println();
		
		
		List<List> lil=new LinkedList<>();
		lil.add(al);
		lil.add(ll);
		System.out.println("ListInList :"+lil);
		
		
		List<Integer> v=new Vector<>();
		v.add(22);
		v.add(44);
		v.add(33);
		v.add(66);
		System.out.println("Vector Elements :"+v);
		
	}
	

}
