package com.aqualogybs.mdc.config;

import java.util.Properties;

public class SSMdcFileIOConfiguration implements SSMdcMakerConfiguration{
	
	String IncomingPath;
	String OutgoingPath;
	String DonePath;
	String FileStagingPath;
	String ErrorPath;
	String RequestFileName;
	String RequestFileExtension;
	String FileOutExt;
	String FileLineLimit;
	String FileInLineLimit;
	String StarInstallDir;
	String IncomingDelimiter;
	String OutgoingDelimiter;
	String ProcessDelay;
	String WatchDogMinutes;
	
	
	public SSMdcFileIOConfiguration(){
		
	}

	public SSMdcFileIOConfiguration(Properties prop){
		
		setIncomingPath(prop.getProperty("IncomingPath"));
		setOutgoingPath(prop.getProperty("OutgoingPath"));
		setDonePath(prop.getProperty("DonePath"));
		setFileStagingPath(prop.getProperty("FileStagingPath"));
		setErrorPath(prop.getProperty("ErrorPath"));
		setRequestFileName(prop.getProperty("RequestFileName"));
		setRequestFileExtension(prop.getProperty("RequestFileExtension"));
		setFileOutExt(prop.getProperty("FileOutExt"));
		setFileLineLimit(prop.getProperty("FileLineLimit"));
		setFileInLineLimit(prop.getProperty("fileInLineLimit"));
		setStarInstallDir(prop.getProperty("starInstallDir"));
		setDonePath(prop.getProperty("donePath"));
		setIncomingDelimiter(prop.getProperty("incomingDelimiter"));
		setOutgoingDelimiter(prop.getProperty("outgoingDelimiter"));
		setProcessDelay(prop.getProperty("processDelay"));
		setWatchDogMinutes(prop.getProperty("watchDogMinutes"));
	}

	public String getIncomingPath() {
		return IncomingPath;
	}


	public void setIncomingPath(String incomingPath) {
		IncomingPath = incomingPath;
	}


	public String getOutgoingPath() {
		return OutgoingPath;
	}


	public void setOutgoingPath(String outgoingPath) {
		OutgoingPath = outgoingPath;
	}


	public String getDonePath() {
		return DonePath;
	}


	public void setDonePath(String donePath) {
		DonePath = donePath;
	}


	public String getFileStagingPath() {
		return FileStagingPath;
	}


	public void setFileStagingPath(String fileStagingPath) {
		FileStagingPath = fileStagingPath;
	}


	public String getErrorPath() {
		return ErrorPath;
	}


	public String getRequestFileName() {
		return RequestFileName;
	}

	public void setRequestFileName(String requestFileName) {
		RequestFileName = requestFileName;
	}

	public String getRequestFileExtension() {
		return RequestFileExtension;
	}

	public void setRequestFileExtension(String requestFileExtension) {
		RequestFileExtension = requestFileExtension;
	}

	public void setErrorPath(String errorPath) {
		ErrorPath = errorPath;
	}


	

	public String getFileOutExt() {
		return FileOutExt;
	}


	public void setFileOutExt(String fileOutExt) {
		FileOutExt = fileOutExt;
	}


	public String getFileLineLimit() {
		return FileLineLimit;
	}


	public void setFileLineLimit(String fileLineLimit) {
		FileLineLimit = fileLineLimit;
	}


	public String getFileInLineLimit() {
		return FileInLineLimit;
	}


	public void setFileInLineLimit(String fileInLineLimit) {
		FileInLineLimit = fileInLineLimit;
	}


	public String getStarInstallDir() {
		return StarInstallDir;
	}


	public void setStarInstallDir(String starInstallDir) {
		StarInstallDir = starInstallDir;
	}


	public String getIncomingDelimiter() {
		return IncomingDelimiter;
	}


	public void setIncomingDelimiter(String incomingDelimiter) {
		IncomingDelimiter = incomingDelimiter;
	}


	public String getOutgoingDelimiter() {
		return OutgoingDelimiter;
	}


	public void setOutgoingDelimiter(String outgoingDelimiter) {
		OutgoingDelimiter = outgoingDelimiter;
	}


	public String getProcessDelay() {
		return ProcessDelay;
	}


	public void setProcessDelay(String processDelay) {
		ProcessDelay = processDelay;
	}


	public String getWatchDogMinutes() {
		return WatchDogMinutes;
	}


	public void setWatchDogMinutes(String watchDogMinutes) {
		WatchDogMinutes = watchDogMinutes;
	}
	
}