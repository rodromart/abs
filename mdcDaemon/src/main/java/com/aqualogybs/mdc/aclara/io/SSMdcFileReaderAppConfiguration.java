package com.aqualogybs.mdc.aclara.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;

public class SSMdcFileReaderAppConfiguration {
	

    static final Logger logger = Logger.getLogger(SSMdcFileReaderAppConfiguration.class);

	SSMdcAppConfigParameters appConfigParameters;
	String appConfigPath =  "/mdcDaemon/src/main/resources/app.properties";
	
	public SSMdcFileReaderAppConfiguration(){
	
		try {
			InputStream input = new FileInputStream(this.appConfigPath);
			Properties prop = new Properties();
			prop.load(input);
			
			this.appConfigParameters = new SSMdcAppConfigParameters(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public SSMdcAppConfigParameters getAppConfigurationParameters(){
		return appConfigParameters;
		
	}
	

	
}
