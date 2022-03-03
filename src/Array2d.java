import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[][] arr=new int[2][3];
		int[][] arr1= {{2,3,4},
						{5,6,7}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(arr.length);
		
		System.out.print("enter row num to ssearch an element:");
		int r=sc.nextInt();
		System.out.print("enter col num to ssearch an element:");
		int c=sc.nextInt();
		
		System.out.println(arr[r][c]);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
