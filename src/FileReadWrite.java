import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

		public static void main(String[] args) throws IOException  {
			// TODO Auto-generated method stub
			FileReader fi=null;
			FileWriter fo=null;
				fi=new FileReader("C:\\Users\\kartheek\\OneDrive\\Desktop\\Kartheek\\Mazenet\\EY Training\\Text1.txt");
				fo=new FileWriter("C:\\Users\\kartheek\\OneDrive\\Desktop\\Kartheek\\Mazenet\\EY Training\\Text2.txt");
				int b=fi.read();
				try {
					while(b!=-1) {
						fo.write((char)b);
						System.out.print((char)b);
						b=fi.read();
						
					}
					System.out.println("succes");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					fo.close();
					}

	}

}
