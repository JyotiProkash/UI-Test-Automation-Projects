package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	private static Properties properties;
	
	public String getProperty(String nameOfPropertyFile, String nameOfProperty) throws IOException{
		properties=new Properties();
		InputStream its=this.getClass().getClassLoader().getResourceAsStream(nameOfPropertyFile);
		if(its!=null){
			properties.load(its);
		}
		
		else{
			throw new FileNotFoundException(nameOfPropertyFile+"Not Found");
		}
		
		return null;
		
	}

}
