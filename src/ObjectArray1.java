
public class ObjectArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter1[] gs= {new GetterSetter1(27,"mame"),new GetterSetter1(3,"nddf")};
		
		GetterSetter1 ob1=new GetterSetter1(28,"name");
		GetterSetter1 ob2=new GetterSetter1(00,"nddf");
		GetterSetter1[] gs11= {ob1,ob2};
		System.out.println(gs.length);
		
		for(int i=0;i<2;i++) {
			System.out.println(gs[i].name);
		}
	}

}
