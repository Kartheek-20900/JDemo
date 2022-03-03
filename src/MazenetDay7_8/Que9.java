package MazenetDay7_8;

import java.util.*;
public class Que9 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> ll=new LinkedList<>();
		ll.add("what?");
		ll.add("why");
		ll.add("while");
		ll.add("will");
		ll.add("wheat");
		ll.add("wall");
		System.out.println("Elements are :"+ll);
		
		ll.add(3,"whom");
		System.out.println("After adding one element,Elements are :"+ll);
		
		System.out.println("Enter index and value to insert");
		int index=sc.nextInt();
		String val=sc.next();
		
		ll.add(index, val);
		
		System.out.println("After adding Elements are :"+ll);
	}

}
