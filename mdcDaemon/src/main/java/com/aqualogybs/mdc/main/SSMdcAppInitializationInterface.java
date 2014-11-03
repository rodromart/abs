package com.aqualogybs.mdc.main;

import java.util.List;

import com.aqualogybs.mdc.config.SSMdcMakerConfiguration;

public interface SSMdcAppInitializationInterface{

	
	 public void startMakerInit();
	 public SSMdcMakerConfiguration getMakerConfiguration();
	 public void launchRequestProcess();
	 public List<E> getCollectedData();

}
