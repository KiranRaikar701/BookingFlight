package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 

{
	
	private Properties propert;
	
//	This method used to load confige properties
	
	
	public Properties init_prop()
	{
		
		propert=new Properties();
		try {
			FileInputStream stream=new FileInputStream("./src/test/resource/com/ConfigProperties/Config.Properties");
			propert.load(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propert;
		
		
	}

}
