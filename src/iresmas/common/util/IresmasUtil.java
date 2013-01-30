package iresmas.common.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class IresmasUtil {

	public static String msnResourceMsn (String lbl) throws IOException{
			
		 Properties prop = new Properties();
		    InputStream is = null;

		    try {
		      is=new FileInputStream("resources/messages.properties");
		      prop.load(is);
		    } catch(IOException ioe) {}
		return prop.getProperty(lbl);
	}
	
}
