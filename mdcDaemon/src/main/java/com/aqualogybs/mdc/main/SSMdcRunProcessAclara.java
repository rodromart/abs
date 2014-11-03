package com.aqualogybs.mdc.main;

import com.aqualogybs.mdc.config.SSMdcMakerConfiguration;

public class SSMdcRunProcessAclara extends SSMdcRunProcessInterface {
	
	private SSMdcMakerConfiguration makerConfig;
	
	public SSMdcRunProcessAclara(){ }
	
	public SSMdcRunProcessAclara(SSMdcMakerConfiguration makerConfig){
		
		this.makerConfig = makerConfig;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean createAclaraRequestFile(){
		return false;
	}
	
	private void launchWachtDog(){
		
	}

}
