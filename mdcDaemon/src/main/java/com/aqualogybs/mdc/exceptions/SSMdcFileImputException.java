package com.aqualogybs.mdc.exceptions;

import java.io.IOException;

public class SSMdcFileImputException extends IOException {
	
	
	String message;
	String fileName;
	
	public SSMdcFileImputException(String message, String fileName){
		
		this.fileName = fileName;
		this.message = message;
	
	}
	
	public String toString(){
		
		StringBuffer exceptionOutputMessage = new StringBuffer();
		exceptionOutputMessage.append("ERROR SSMdcFileImputException: ");
		exceptionOutputMessage.append(message);
		exceptionOutputMessage.append(" | produces by:" + fileName);
		
		return exceptionOutputMessage.toString();
	}
	
	
}
