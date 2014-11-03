package com.aqualogybs.mdc.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.aqualogybs.factory.SSMdcAppFactory;
import com.aqualogybs.mdc.aclara.io.SSMdcFileReaderAppConfiguration;
import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.config.SSMdcMakerConfiguration;
import com.aqualogybs.mdc.exceptions.SSMdcFileImputException;
/**
 * Esta clase carga el procesos de inicializacion generico de la aplicacion
 * LLama al factory pasandole como argumento 
 * @author rmmartin
 *
 */

public class SSMdcInitialize extends Thread{

	static final Logger logger = Logger.getLogger(SSMdcInitialize.class);
	String appConfigPath =  "/mdcDaemon/src/main/resources/app.properties";
	
	SSMdcAppConfigParameters appConfig;
	SSMdcMakerConfiguration makerConfig;
	
	public void run() {
		
		logger.debug("SSMdcInitialize.run(): Start...");
		if(loadConfigurationParameters())
		{
			/*El factory nos devolvera en funcion del nombre de fabricante, la clase de inicializacion correspondiente 
			 * e injectara la POJO de configuracion general de la app
			 */			
			SSMdcAppInitializationInterface init = SSMdcAppFactory.getFactoryInstance().getMakerInitializer(appConfig);
			//Inicializar la carga de la configuracion del fabricante correspondiente
			init.startMakerInit();
			//Esperamos a que el proceso acabe antes de seguir adelante
			synchronized (init) 
			{				
				try {
					init.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.makerConfig = init.getMakerConfiguration();
			
		}
		notify();
		logger.debug("SSMdcInitialize.run(): End...");
	}
	
	private boolean loadConfigurationParameters(){
		
		//Cargamos la configuracion general de la aplicacion
		FileInputStream input = null;
	    
		try {
			input = new FileInputStream(new File(appConfigPath));
		    
			Properties appProp = new Properties();
		    appProp.load(input);
		    //Cargamos POJO de parametros de configuracion
		    appConfig =  new SSMdcFileReaderAppConfiguration().getAppConfigurationParameters();
		    
		    if(appConfig == null){
		    	return false;
		    }
			
		}catch (IOException ex) {
				ex.printStackTrace();
		} finally {
				if (input != null) 
				{
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		}
		
		return true;
	}
	
	public SSMdcAppConfigParameters getAppConfiguration() {
		return this.appConfig;
	}
	
	public SSMdcMakerConfiguration getMakerConfiguration(){
		return this.makerConfig;
	}

}
