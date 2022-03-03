
public class CustomerM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account(1111,"sss");
		Address ad=new Address("as","wesd","aasdfsd","sdsdsd","12312");
		Customer ct1=new Customer();
		ct1.setDetails("asd", ad, 22,22222.22,ac);
		//ct1.displayDetails();
		//ct1.changeAdd("1 aa");
		ct1.displayDetails();
		//ct1.getAccount().Display();
		Customer ct2=new Customer();
		ct1.setDetails("ttg", ad,34,5656.22,ac);
		ct1.displayDetails();

	}

}
