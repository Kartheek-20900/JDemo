package MazenetDay4;
import java.util.*;
public class Credit {
	
    static int creditLmt=5000;
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Credit c=new Credit();
		c.creditUser(creditLmt);

	}
	
	public void creditUser(int creditLmt) {
		
		
		int t=500;
		int e=3000;
		int s=1500;
		int m=3000;
		int ch=0;
		
		while(ch!=5){
			
			System.out.println("1. Engine - $"+e+"\n2. Suspension - $"+s+"\n3. Tyre - $"+t+"\n4. Music System - $"+m+"\n5. Exit ");

			System.out.println("Your current credit is: $"+creditLmt+"\n");

			System.out.println("Enter your choice?");
			ch=sc.nextInt();
			
			if(ch==1) {
				
				if(creditLmt>=e) {
					creditLmt=creditLmt-e;
				}
				else {
					System.out.println("Sorry, the item price("+e+") exceeds your current credit("+creditLmt+")\n");
				}
			}
			if(ch==2) {
				
				if(creditLmt>=s) {
					creditLmt=creditLmt-s;
				}
				else {
					System.out.println("Sorry, the item price("+s+") exceeds your current credit("+creditLmt+")\n");
				}
			}
			if(ch==3) {
				
				if(creditLmt>=t) {
					creditLmt=creditLmt-t;
				}
				else {
					System.out.println("Sorry, the item price("+t+") exceeds your current credit("+creditLmt+")\n");
				}
			}
			if(ch==4) {
				
				if(creditLmt>=m) {
					creditLmt=creditLmt-m;
				}
				else {
					System.out.println("Sorry, the item price("+m+") exceeds your current credit("+creditLmt+")\n");
				}
			}
			if(ch==5) {
				break;
			}
			
		}
	}

}
