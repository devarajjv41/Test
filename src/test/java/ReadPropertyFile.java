import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
		
		ReadPropertyFile.readproperty();

	}
	
	public static void readproperty() throws Exception {
		
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("D:\\Property.properiess");
		pro.load(file);
		System.out.println(pro.getProperty("deva"));
		System.out.println(pro.getProperty("testing"));
	}

}
