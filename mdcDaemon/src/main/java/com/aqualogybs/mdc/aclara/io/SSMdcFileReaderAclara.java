package com.aqualogybs.mdc.aclara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.aqualogybs.main.SSMdcInitialize;
import com.aqualogybs.mdc.config.SSMdcFileIOConfiguration;

public class SSMdcFileReaderAclara implements SSMdcFileReaderInterface{

    static final Logger logger = Logger.getLogger(SSMdcFileReaderAclara.class);
	SSMdcFileIOConfiguration config;
	File outgoingFile;
	BufferedReader br;
	
	public SSMdcFileReaderAclara() {
		this.config = new SSMdcFileIOConfiguration();
	}
	
	public SSMdcFileReaderAclara(SSMdcFileIOConfiguration config){
		this.config = config;
	}
	@Override
	public void setConfiguration(SSMdcFileIOConfiguration config) {
		this.config = config;
	}

	@Override
	public SSMdcFileIOConfiguration getConfiguration() {
		return config;
	}
	
	
	
	@Override
	public boolean initializateFileReader() {
		
		if(this.config == null){
			return false;
		}
		
		outgoingFile = new File(this.config.getOutgoingPath());
		FileReader fr;
		try {
			fr = new FileReader (outgoingFile);
			br = new BufferedReader(fr);
			
		} catch (FileNotFoundException e) {
			logger.error(e);
			return false; 	
				
		}
		return true;
	}
	
	public List<String> getLinesList(){
		
		List<String> listOfRead = new LinkedList<String>();
		try {
			String line;
			while((line=br.readLine())!=null){
				listOfRead.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listOfRead;
	}

}
