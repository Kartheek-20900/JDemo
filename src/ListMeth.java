import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=Arrays.asList(1,6,9,3,6,1);
		System.out.println("OrginalList :"+l1);
		
		List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
		System.out.println("unique elements :"+l2);
		
		Optional<Integer> l3=l1.stream().min(Integer::compare);
		System.out.println("min element :"+l3.get());
		
		List<Integer> l4=l1.stream().filter(a->a>5).collect(Collectors.toList());
		System.out.println("g5 elements :"+l4);
		
		long l5=l1.stream().count();
		System.out.println("count elements :"+l5);

	}

}
