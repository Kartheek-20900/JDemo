package MazenetDay7_8;

import java.util.*;
public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<String> al=new ArrayList<>();
		al.add("no");
		al.add("yes");
		al.add("noway");
		al.add("lol");
		al.add("looser");
		al.add("nope");
		
		System.out.println("Elements are :"+al);
		System.out.println("enter element to search");
		String ele=sc.next();
		int c=0;
		
		boolean srch=al.contains(ele);
		System.out.println((srch)?"Ele found":"not found");
		

	}

}
