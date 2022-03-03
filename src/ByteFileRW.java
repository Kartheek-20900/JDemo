import java.io.*;
public class ByteFileRW {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream fi=null;
		FileOutputStream fo=null;
			fi=new FileInputStream("C:\\Users\\kartheek\\OneDrive\\Desktop\\Kartheek\\Mazenet\\EY Training\\Text1.txt");
			fo=new FileOutputStream("C:\\Users\\kartheek\\OneDrive\\Desktop\\Kartheek\\Mazenet\\EY Training\\Text2.txt");
			int b;
			try {
				while((b=fi.read())!=-1) {
					fo.write(b);
				}
				System.out.println("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
