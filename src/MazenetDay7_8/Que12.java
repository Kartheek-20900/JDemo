package MazenetDay7_8;

import java.util.*;

import java.util.Map.Entry;

public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> hm=new HashMap<>();
		hm.put(1, 21);
		hm.put(2, 65);
		hm.put(3, 19);
		hm.put(4, 90);
		hm.put(5, 1);
		hm.put(6, 34);

		System.out.println("-------------------------Original values :");
		Set<Entry<Integer,Integer>> entryset = hm.entrySet();
		for (Entry<Integer, Integer> i : entryset) {
			System.out.println("Key : " + i.getKey() + "   Value : " + i.getValue());
		}
		
		ArrayList<Integer> l1=new ArrayList<>();
		for (Entry<Integer, Integer> i : entryset) {
			l1.add(i.getValue());
		}
		
		LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
		Collections.sort(l1);
		 for (Integer num : l1) {
	            for (Entry<Integer, Integer> entry : hm.entrySet()) {
	                if (entry.getValue()==(num)) {
	                    sortedMap.put(entry.getKey(),num);
	                }
	            }
	        }
		 System.out.println("-----------------------Values after sorting :");
			Set<Entry<Integer,Integer>> entryset1 = sortedMap.entrySet();
			for (Entry<Integer, Integer> i : entryset1) {
				System.out.println("Key : " + i.getKey() + "   Value : " + i.getValue());
			}
			
	}

}
