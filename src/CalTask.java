import java.util.Scanner;
public class CalTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CalTask ct=new CalTask();
		
		String op=sc.next();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n=sc.nextInt();
		
		
		ct.cal(op,n1,n2);
		ct.prime(n);
		

	}
	public void cal(String op,int n1,int n2) {
		switch(op) {
		case "+":System.out.println(n1+n2);
		break;
		case "-":System.out.println(n1-n2);
		break;
		case "*":System.out.println(n1*n2);
		break;
		case "/":System.out.println(n1/n2);
		break;
		case "%":System.out.println(n1%n2);
		break;
		}
	}
	
	public void prime(int n) {
		System.out.println("the prime numbers are : ");
		for(int i=2;i<=n;i++){
			int c=0;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					c=1;
				}
				
			}
			if(c==0) {
				System.out.println(i);
			}
				
		}
	}

}
