import java.util.*;
public class ElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr={2,4,55,66,78};
		int n=sc.nextInt();
		int d=0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				d=1;
			}
		}
		if(d==1) {
			System.out.println("found");
			
		}
		else {
			System.out.println("not found");
		}
		
	}

}
