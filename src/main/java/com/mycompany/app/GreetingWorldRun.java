package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GreetingWorldRun {
	
	final static Logger logger = LogManager.getLogger(GreetingWorldRun.class);
	
	public static void main(String[] args) {
	  
		logger.info(GreetingWorld.greet());

	}
}
