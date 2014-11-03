package com.aqualogybs.mdc.main;

import java.util.List;

import com.aqualogybs.mdc.aclara.io.SSMdcFileReaderAclaraIOConfiguration;
import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.config.SSMdcFileIOConfiguration;
import com.aqualogybs.mdc.config.SSMdcMakerConfiguration;

public class SSMdcAppInitializeAclara implements SSMdcAppInitializationInterface {

	private SSMdcAppConfigParameters appcp = new SSMdcAppConfigParameters();
	private SSMdcFileIOConfiguration fioc = new SSMdcFileIOConfiguration();
	
	public SSMdcAppInitializeAclara(){}
	public SSMdcAppInitializeAclara(SSMdcAppConfigParameters appcp){
		this.appcp = appcp;
	}
	
	
	

	public void startMakerInit() {		
		SSMdcFileReaderAclaraIOConfiguration ioReaderConfiguration = new SSMdcFileReaderAclaraIOConfiguration(appcp);
		this.fioc =  ioReaderConfiguration.getAclaraIOConfiguration();
		notify();
	}
	
	
	

	public SSMdcMakerConfiguration getMakerConfiguration() {
		return this.fioc;
	}
	public void launchRequestProcess() {
		//Generate Request File under configuration specification
		
		//Get Aclara output file
		
		//Process it
		
	}
	public List getCollectedData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
