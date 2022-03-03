import java.text.ParseException;
import java.util.Date;

public class SimpleDateFormat {
	
	public SimpleDateFormat(String format) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		try {
			parse("dd/MM/yyyy","23/04/2000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void parse(String format,String date) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		//Date d=sdf.parse(date);
		//System.out.println(d);
		
	}
	//}

}
