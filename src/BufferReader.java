import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) {
		writeFileContent("C:\\Users\\kartheek\\OneDrive\\Desktop\\Kartheek\\Mazenet\\EY Training\\T1.txt");
		writeFileChar("C:\\Users\\kartheek\\OneDrive\\Desktop\\Kartheek\\Mazenet\\EY Training\\T2.txt");
		
	}

	private static void writeFileContent(String fname) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(fname))){
			bw.write("First line");
			bw.newLine();
			bw.write("Second line");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void writeFileChar(String fname) {
		BufferedOutputStream b=null;
		try {
			b=new BufferedOutputStream(new FileOutputStream(fname));
			b.write("First line".getBytes());
			b.write("\r\n".getBytes());
			b.write("Second line".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(b!=null) {
				try {
					b.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}