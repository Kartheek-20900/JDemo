import java.util.*;
public class Fabinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int count=0;
		while(count!=n) {
			int c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			count++;
			
		}

	}

}
