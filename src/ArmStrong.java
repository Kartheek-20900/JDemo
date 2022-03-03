import java.util.*;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int l=String.valueOf(num).length();
		int n=0;
		int numd=num;
		while(num!=0) {
			int d=num%10;
			n=n+(pow(d,l));
			num=num/10;
		}
		System.out.println(n);
		if(n==numd) {
			System.out.println("armstrong num");
		}
		else {
			System.out.println("not armstrong num");
		}

	}

	public static int pow(int d, int l) {
		// TODO Auto-generated method stub
		int r=1;
		for (int i=0;i<l;i++) {
			r=r*d;
		}
		
		return r;
	}

}
