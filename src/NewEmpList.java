import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class NewEmpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewEmpList nemp= new NewEmpList();

		List<NewEmployees> l1=NewEmpList.empDtls();
		System.out.println(l1);
		
		l1.stream().filter(a->a.getAge()>25).map(a->a.getName()).toList().forEach(a->System.out.println(a));;
		List<Integer> sal=l1.stream().map(a->a.getSal()).toList();
		int ts=0;
		for(Integer i:sal) {
			ts=ts+i;
		}
		System.out.println(ts);
	}
	
	
	private static List<NewEmployees> empDtls() {
		
		List<NewEmployees> empl=Arrays.asList(new NewEmployees(1,"ravi",50000,30,"M"),
												new NewEmployees(2,"rita",40000,25,"F"),
												new NewEmployees(3,"ramu",45500,23,"M"),
												new NewEmployees(4,"rasool",60000,35,"M"),
												new NewEmployees(5,"rati",80000,38,"F"));
		
		return empl;
	}

}
