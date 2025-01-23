package UtilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static String getProperty(String keyname) {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/Config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			return prop.getProperty(keyname);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;

	}

}
