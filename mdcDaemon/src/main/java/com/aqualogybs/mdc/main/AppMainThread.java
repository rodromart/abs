package com.aqualogybs.mdc.main;

import com.aqualogybs.mdc.config.SSMdcAppConfigParameters;
import com.aqualogybs.mdc.config.SSMdcMakerConfiguration;

public class AppMainThread extends Thread {

	SSMdcAppConfigParameters appConfigParameters;
	SSMdcMakerConfiguration makerConfigParameters;
	
	
	public void run(){
		
		//Inicializar APP configuracion General
		SSMdcInitialize mdcAppInit = new SSMdcInitialize();
		mdcAppInit.start();
		
		synchronized (mdcAppInit) {
			
			try {
				mdcAppInit.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.appConfigParameters = mdcAppInit.getAppConfiguration();
		this.makerConfigParameters = mdcAppInit.getMakerConfiguration();
		
		
		while(true){
			//Lanzar Proceso de generacion de Request y Captura de datos
			
			
			//Lanzar WatchDog de carpete de salida
			
			//Parseo y homogenizacion de datos
			
			
			//Enviar al MDM
			
			try {
				this.sleep(36000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
