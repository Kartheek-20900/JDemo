
public class BreakCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		
			for(int n=0;n<3;n++) {
				for(int k=0;k<5;k++) {
					System.out.println(k);
					if(k==3) {
						break;
					}
					
				}
			}
		System.out.println("2nd While");
		a:
		for(int n=0;n<3;n++) {
			for(int k=0;k<5;k++) {
				System.out.println(k);
				if(k==3) {
					break a;
				}
			}
		}
		System.out.println("3nd While");
		for(int n=0;n<3;n++) {
			for(int k=0;k<5;k++) {
				System.out.println(n);
				if(k==3) {
					continue;
				}
				
			}
		}
		System.out.println("4nd While");
		
		b:
		for(int n=0;n<3;n++) {
			
			for(int k=0;k<5;k++) {
				System.out.println(n);
				if(k==3) {
					continue b;
				}
			}
		}
			
	}

}
