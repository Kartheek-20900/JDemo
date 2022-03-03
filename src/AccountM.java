import java.util.Scanner;

public class AccountM {

	public static void main(String[] args) {
		
			Account a=new Account();
			Account b=new Account(2222,"asd456");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<2;i++) {
				int x=sc.nextInt();
				String y=sc.next();
				b.setAcc(x);
				b.setIfsc(y);
				//b.Display();
			}
			
		}

	}


