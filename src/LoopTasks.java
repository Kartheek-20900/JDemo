import java.util.Scanner;
public class LoopTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopTasks lt=new LoopTasks();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num ");
		int a=sc.nextInt();
		System.out.println("enter pow num ");
		int b=sc.nextInt();
		System.out.println("enter num to rev");
		int c=sc.nextInt();
		
		System.out.println("power is "+lt.power(a, b));
		System.out.println("fact is "+lt.fact(a));
		System.out.println("reverse num is "+lt.rev(c));
	}
		
		public int power(int x,int y) {
			int res=x;
			for(int i=1;i<y;i++) {
				res= res*x;
			}
			return res;
		}
		
		public int fact(int x) {
			int i=1;
			int res=x;
			while(i<x) {
				res=res*i;
				i++;
			}
			return res;
		}
		
		public int rev(int x) {
			int n=x;
			int rn=0;
			while(n!=0) {
				int r=n%10;
				n=n/10;
				rn=rn*10+r;
			}
			return rn;
		}

}
