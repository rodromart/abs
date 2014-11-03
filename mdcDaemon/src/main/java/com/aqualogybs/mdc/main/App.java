package com.aqualogybs.mdc.main;

import org.apache.log4j.Logger;

import com.aqualogy.mdc.main.MdcMainThread;

/**
 * Lanza el hilo principal de la aplicacion 
 * Controla que el hilo sigue vivo, en caso contrario lo vuelve a lanzar
 * Se compone de un bucle infinito.
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	System.out.println("Entering main Method");
    	
    	logger.debug("MDC START ........");

    	AppMainThread t = new AppMainThread();
        t.setDaemon(true);
        t.start();

        while(true){
        	if(!t.isAlive()){
        		logger.debug("MDC IS DEAD ........");
        		t= new AppMainThread();
        		t.start();
        		logger.debug("MDC RE-LAUNCH ........");
        	}
        }

    }
}
