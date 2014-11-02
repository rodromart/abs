package com.aqualogybs.main;

import com.aqualogybs.mdc.aclara.io.SSMdcFileReaderAclara;
import com.aqualogybs.mdc.aclara.io.SSMdcFileReaderAppConfiguration;
import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.config.SSMdcFileIOConfiguration;
import com.aqualogybs.mdc.config.SSMdcFileIOConfigurationInterface;

public class SSMdcAppInitializeAclara implements SSMdcAppInitializationInterface {

	private SSMdcAppConfigParameters appcp = new SSMdcAppConfigParameters();
	private SSMdcFileIOConfiguration fioc = new SSMdcFileIOConfiguration();
	
	
	@Override
	public void startMakerInit() {
		
		SSMdcFileReaderAppConfiguration appReaderConfiguration = new SSMdcFileReaderAppConfiguration();
		appcp.parseAppProperties(appReaderConfiguration);
		
		SSMdcFileReaderAppConfiguration ioReaderConfiguration = new SSMdcFileReaderAppConfiguration(appcp.getMakerSpecificConfigurationFilePath());
		fioc.parseIOProperties(ioReaderConfiguration);
		
	}
	
	

}
