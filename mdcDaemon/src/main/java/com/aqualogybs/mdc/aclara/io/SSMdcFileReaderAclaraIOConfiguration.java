package com.aqualogybs.mdc.aclara.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.config.SSMdcFileIOConfiguration;

public class SSMdcFileReaderAclaraIOConfiguration {

	static final Logger logger = Logger.getLogger(SSMdcFileReaderAclaraIOConfiguration.class);
	private SSMdcFileIOConfiguration aclaraFileIOConfig;
	
	public SSMdcFileReaderAclaraIOConfiguration() {}
	
	public SSMdcFileReaderAclaraIOConfiguration(SSMdcAppConfigParameters appcp) {
		try {
			InputStream input = new FileInputStream(appcp.getMakerConfigFile());
			Properties prop = new Properties();
			prop.load(input);
			
			this.aclaraFileIOConfig = new SSMdcFileIOConfiguration(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public SSMdcFileIOConfiguration getAclaraIOConfiguration(){
		return this.aclaraFileIOConfig;
	}

	
	

}
