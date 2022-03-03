import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProperties {

	private Properties loadProperties() {
		InputStream iStream=null;
		Properties props=new Properties();
		try {
			iStream=this.getClass().getClassLoader().getResourceAsStream("PropFile2.properties");
			if(iStream==null) {
				throw new IOException("Fill not fozund");
			}
			props.load(iStream);
		}catch(IOException e) {
			e.fillInStackTrace();
		}finally {
			try {
				if(iStream!=null) {
					iStream.close();
				}
			}catch(IOException e) {
				e.fillInStackTrace();
			}
		}
			return props;
		}
	private void readProperties(Properties props) {
		System.out.println("name  is :"+props.getProperty("Name"));
		System.out.println("pass is :"+props.getProperty("passw"));
	}
	public static void main(String[] args) {
		DBProperties pdemo=new DBProperties();
		Properties props=pdemo.loadProperties();
		pdemo.readProperties(props);
	}

}


