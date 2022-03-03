
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=11;
		String res=(t<5)?("ok"):((t>5 && t<=10)? ("notifying the user"):("Ur account has unusall activit"));
		System.out.println(res);
		if(t<5) {
			System.out.println("ok");
		}
		else if(t>5 && t<=10) {
			System.out.println("notifying the user");
		}
		else {
			System.out.println("Ur account has unusall activit");
		}

	}

}
