
public class MethodArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodArg m=new MethodArg();
		int[] arr2= {1,3,4,5,3};
		
		m.mul(2, 03);
		m.mul(1,2,3,4,5);
		m.mul(arr2);

	}
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	public void mul(int...a) {
		int r=1;
		for(int i:a) {
			r=r*i;
		}
		System.out.println(r);
	}

}
