import java.util.Arrays;
import java.util.List;

interface InterfcClas<T,R>{
	R interfcMeth(R r);
}

public class InterfaceMethDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[] {"deft","thy","asdf","sss"};
		
		InterfcClas<String[],String[]> ic=i->refClass.refMeth(s);
		//InterfcClas<String[],String[]> ic=refClass::refMeth(s);
		
		String[] sarr=ic.interfcMeth(s);
		for(String string:sarr) {
			System.out.println(string);
		}
		

		
		//System.out.println(ic.interfcMeth(s));
		
		

	}

}

class refClass{
	
	static String[] refMeth(String[] s){
		
		String[] arr=Arrays.sort(s);
		return arr;
	}
}