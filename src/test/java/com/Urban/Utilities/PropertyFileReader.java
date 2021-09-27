package com.Urban.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	 public static Properties prop;
	public static Properties loadfile() throws IOException {
		// TODO Auto-generated method stub
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".//data.properties");
		prop.load(fis);
		return prop;
	}
}
