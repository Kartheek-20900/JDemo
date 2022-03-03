
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter[] gs= {new GetterSetter(22,"name"),new GetterSetter(3,"nddf")};
		LoopTasks lt=new LoopTasks();
		GetterSetter ob1=new GetterSetter(22,"name");
		GetterSetter ob2=new GetterSetter(3,"nddf");
		GetterSetter[] gs1= {ob1,ob2};
		System.out.println(gs.length);
		System.out.println(lt.fact(5));
		for(int i=0;i<2;i++) {
			System.out.println(gs[i].name);
		}
	}

}
