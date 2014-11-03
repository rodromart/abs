package com.aqualogybs.factory;

import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.main.SSMdcAppInitializationInterface;
import com.aqualogybs.mdc.main.SSMdcAppInitializeAclara;
import com.aqualogybs.mdc.main.SSMdcRunProcessAclara;
import com.aqualogybs.mdc.main.SSMdcRunProcessInterface;

public class SSMdcAppFactory {

	private static SSMdcAppFactory instance;
	
	//Maker 
	private final String ACLARA = "aclara";
	
	private SSMdcAppFactory(){}
	
	public static SSMdcAppFactory getFactoryInstance(){
		
		if(instance == null){
			instance = new SSMdcAppFactory();
		}
		
		return instance;
	}
	
	
	
	public SSMdcAppInitializationInterface getMakerInitializer(SSMdcAppConfigParameters appConfigParameters){
		
		if(ACLARA.equals(appConfigParameters.getMaker())){
			return new SSMdcAppInitializeAclara(appConfigParameters);
		}
		
		return null;
		
	}
	
	public SSMdcRunProcessInterface getMakerRunProcess(SSMdcAppConfigParameters appConfigParameters){
		if(ACLARA.equals(appConfigParameters.getMaker())){
			return new SSMdcRunProcessAclara(appConfigParameters);
		}
		
		return null;
	}
}
