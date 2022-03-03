import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		method0(x,y);
		
		
		try {
			method1(x,y);
		}
		catch(Exception e) {
			System.out.println("err :"+e);
		}
		finally {
			System.out.println("finally in main");
		}

		
		method2(x,y);
		
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			float c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("error is :"+e);
			//e.fillInStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("error :"+e);
		}
		catch(Exception e) {
			System.out.println("err :"+e);
		}
		finally{
			System.out.println("finall block");
		}
		
	}
	
	
	public static void method0(int a,int b) {
		try {
			float c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("err in me :"+e);
		}
		finally{
			System.out.println("finall block in met");
		}
		
	}
	
	
	public static void method1(int a,int b) {
		float c=a/b;
		System.out.println(c);
	}
	
	
	public static void method2(int a,int b) {
		try {
			float c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			
			System.out.println("throws");
			throw new ArithmeticException("throwing an error");
		}
		finally {
			System.out.println("thrown finally");
		}
		
	}

}
