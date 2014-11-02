package com.aqualogybs.mdc.io;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aqualogybs.mdc.aclara.io.SSMdcFileReaderAclara;
import com.aqualogybs.mdc.config.SSMdcFileIOConfiguration;

public class SSMdcFileReaderAclaraTest {

	SSMdcFileReaderAclara aclaraFileReader;
	SSMdcFileIOConfiguration fiac;
	
	String testFolderPath 	= "/Users/rodrigo/mdcTest/Reading/";
	String incomingPath  	= testFolderPath+"Incoming";
	String outcomingPath  	= testFolderPath+"Outgoing";
	String stagingPath		= testFolderPath+"Staging";
	String donePath			= testFolderPath+"Done";
	String errorPath 		= testFolderPath+"Error";
	String splitValue		= ";";

	
	@Before
	public void setUp() throws Exception {

		aclaraFileReader = new SSMdcFileReaderAclara();
		fiac = new SSMdcFileIOConfiguration();
		
		fiac.setIncomingPath(incomingPath);
		fiac.setOutgoingPath(outcomingPath);
		fiac.setDonePath(donePath);
		fiac.setErrorPath(errorPath);
		fiac.setSplitValue(splitValue);
		
		aclaraFileReader.setConfiguration(fiac);
		
	}

	@After
	public void tearDown() throws Exception {
		aclaraFileReader = null;
		
	}

	@Test
	public void testSetConfiguration() {
		
		Assert.assertEquals(fiac, aclaraFileReader.getConfiguration());
	}
	
	@Test
	public void testGetListOfReading(){
		
	}
	
		
}
