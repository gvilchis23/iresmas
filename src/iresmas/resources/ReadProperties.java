package iresmas.resources;

import iresmas.common.util.Iconstants;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties{

private Properties pro;

public ReadProperties(String locale) {
pro=new Properties();
	try {
		if(locale.equals(Iconstants.LOCALE_ESPANISH)){
			pro.load(this.getClass().getResource(Iconstants.MESSAGE_ES).openStream());	
		}else if(locale.equals(Iconstants.LOCALE_ENGLISH)){
			pro.load(this.getClass().getResource(Iconstants.MESSAGE_EN).openStream());
		}
		
		} catch (IOException ex) {
		}
	}

public String getValue(String key) {
	return pro.getProperty(key);
}

}