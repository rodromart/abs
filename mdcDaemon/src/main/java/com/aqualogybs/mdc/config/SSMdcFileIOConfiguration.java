package com.aqualogybs.mdc.config;

public class SSMdcFileIOConfiguration {
	
	String IncomingPath;
	String OutgoingPath;
	String FileStagingPath;
	String DonePath;
	String ErrorPath;
	
	String splitValue;
	
	
	public SSMdcFileIOConfiguration(){
		
	}
	
	public String getIncomingPath() {
		return IncomingPath;
	}
	public String getOutgoingPath() {
		return OutgoingPath;
	}
	public String getFileStagingPath() {
		return FileStagingPath;
	}
	public String getDonePath() {
		return DonePath;
	}
	public String getErrorPath() {
		return ErrorPath;
	}
	public void setIncomingPath(String incomingPath) {
		IncomingPath = incomingPath;
	}
	public void setOutgoingPath(String outgoingPath) {
		OutgoingPath = outgoingPath;
	}
	public void setFileStagingPath(String fileStagingPath) {
		FileStagingPath = fileStagingPath;
	}
	public void setDonePath(String donePath) {
		DonePath = donePath;
	}
	public void setErrorPath(String errorPath) {
		ErrorPath = errorPath;
	}

	public String getSplitValue() {
		return splitValue;
	}

	public void setSplitValue(String splitValue) {
		this.splitValue = splitValue;
	}

	
	
	
	
}
