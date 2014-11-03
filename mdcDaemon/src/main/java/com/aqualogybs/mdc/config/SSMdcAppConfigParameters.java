package com.aqualogybs.mdc.config;

import java.util.Properties;

import com.aqualogybs.mdc.aclara.io.SSMdcFileReaderAppConfiguration;

public class SSMdcAppConfigParameters {


	String Maker;
	String MakerConfigFile;

	public SSMdcAppConfigParameters() {
	
	}
	
	public SSMdcAppConfigParameters(Properties prop) {
		
		setMaker(prop.getProperty("maker"));
		setMakerConfigFile(prop.getProperty("MakerConfigFile"));
	}
	
	public String getMaker() {
		return Maker;
	}

	public void setMaker(String maker) {
		this.Maker = maker;
	}


	public String getMakerConfigFile() {
		return MakerConfigFile;
	}


	public void setMakerConfigFile(String makerConfigFile) {
		MakerConfigFile = makerConfigFile;
	}

	
	
	

}
