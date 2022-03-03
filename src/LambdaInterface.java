
public class LambdaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lambda lam=(a,b)->System.out.println(a*b);
		lam.mul(2, 04);
		
		lambda2 lam2=(a,b)->(a>b)?a:b;
		System.out.println(lam2.gtst(5, 9));
		
		lambda3 lam3=a->a;
		System.out.println(lam3.c("adfrs"));

	}

}

interface lambda{
	public void mul(int a,int b);
}

interface lambda2{
	public int gtst(int a,int b);
}

interface lambda3{
	public String c(String a);
}
