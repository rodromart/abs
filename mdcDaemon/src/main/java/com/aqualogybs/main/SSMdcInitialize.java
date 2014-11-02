package com.aqualogybs.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.aqualogybs.factory.SSMdcAppFactory;
import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.exceptions.SSMdcFileImputException;


public class SSMdcInitialize implements Runnable{

	private Properties prop = new Properties();
	private SSMdcAppConfigParameters appConfigParameters = new SSMdcAppConfigParameters();
	
	
    static final Logger logger = Logger.getLogger(SSMdcInitialize.class);

	@Override
	public void run() {
		
		logger.debug("SSMdcInitialize.run(): Start...");
		if(loadConfigurationParameters())
		{
			SSMdcAppInitializationInterface init = SSMdcAppFactory.getFactoryInstance().getMakerInitializer(appConfigParameters.getMaker());
			init.startMakerInit();
		}
		logger.debug("SSMdcInitialize.run(): End...");
	}
	
	private boolean loadConfigurationParameters(){
		
		String appConfigFileName = "app.config";
	    InputStream input = SSMdcInitialize.class.getClassLoader().getResourceAsStream(appConfigFileName);
	    
		try {
	 			
			if(input==null){
				logger.error("ERROR SSMdcInitialize.loadConfigurationParameters()", new SSMdcFileImputException("Error loading configuration file",appConfigFileName));
	            return false;
			}

			prop.load(input);

			appConfigParameters.setMaker(prop.getProperty("maker"));
            
		 
			
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		
		return true;
	}

}
