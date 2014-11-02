package com.aqualogybs.mdc.aclara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.aqualogybs.mdc.config.SSMdcFileIOConfiguration;

public interface SSMdcFileReaderInterface {
	
	SSMdcFileIOConfiguration config = null;
	File outgoingFile = null;
	BufferedReader br = null; 
	
	public void setConfiguration(SSMdcFileIOConfiguration config);
	public SSMdcFileIOConfiguration getConfiguration();
	boolean initializateFileReader();
	public List<String> getLinesList();

}

