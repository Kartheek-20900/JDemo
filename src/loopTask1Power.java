import java.util.Scanner;
public class loopTask1Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 num ");
		System.out.println("enter 2 num ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a;
		for(int i=1;i<b;i++) {
			res=res*a;
		}
		System.out.println(res);

	}

}
