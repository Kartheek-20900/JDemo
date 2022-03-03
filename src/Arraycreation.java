import java.util.*;
public class Arraycreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[5];
		int[] arr2= {1,3,4,5,3};
		int[] arr3=new int[3];
		System.out.println(arr1.length);
		System.out.println(arr2[3]);
		System.out.println("enter the values to arr3");
		
		Scanner sc=new Scanner(System.in);
		for(int  i=0;i<arr3.length;i++) {
			arr3[i]=sc.nextInt();
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("----using for each----");
		for(int i:arr2) {
			System.out.println(i);
		}

	}

}
