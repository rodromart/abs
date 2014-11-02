package com.aqualogybs.factory;

import com.aqualogybs.main.SSMdcAppInitializationInterface;
import com.aqualogybs.main.SSMdcAppInitializeAclara;

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
	
	
	
	public SSMdcAppInitializationInterface getMakerInitializer(String maker){
		
		if(ACLARA.equals(maker)){
			return new SSMdcAppInitializeAclara();
		}
		
		return null;
		
	}
}
