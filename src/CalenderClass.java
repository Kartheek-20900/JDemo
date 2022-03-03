import java.util.*;
public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c=Calendar.getInstance();
		//System.out.println(c.getCalendarType());
		System.out.println(c.getTime());
		
		//System.out.println(c.MONTH);
		
		GregorianCalendar gc=new GregorianCalendar(2011,4,25,10,4,3);
		GregorianCalendar gc1=new GregorianCalendar(2011,4,24,10,4,3);
		Date d=gc.getGregorianChange();
		System.out.println(gc.getTime());
		System.out.println(gc1.getTime());
		if(gc.equals(gc1)) {
			System.out.println("same");
		}
		else {
			System.out.println("no same");
		}
		
		if(gc.after(gc1)) {
			System.out.println("after");
		}
		else {
			System.out.println("not after");
		}


	}

}

