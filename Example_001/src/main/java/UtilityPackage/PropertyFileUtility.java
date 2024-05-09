package UtilityPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains methods related to property file
 * 
 * @author Kavyashree
 *
 */
public class PropertyFileUtility {
	/**
	 * This method is used to read data from properties file
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String toReadDatafromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Desktop_Resolution.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}