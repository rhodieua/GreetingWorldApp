package com.mycompany.app;

import org.joda.time.LocalTime;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingWorld {
	
	public static String greet() {
		
		int hour = LocalTime.now().getHourOfDay();
		  
		return greet(hour);
	}
	
	public static String greet(int hour) {
		  
		Locale locale = Locale.getDefault();
		ResourceBundle bundle = ResourceBundle.getBundle("message", new UTF8Control());

		if (locale.getLanguage().equals("ru")) 
			bundle = ResourceBundle.getBundle("message_ru_UA", new UTF8Control());

		String greeting = "";
		  
		if ((hour >= 6) && (hour < 9))
			greeting = bundle.getString("morning"); 
		else if ((hour >= 9) && (hour < 19))
			greeting = bundle.getString("day"); 
		else if ((hour >= 19) && (hour < 23))
			greeting = bundle.getString("evening"); 
		else if ((hour == 23) || (hour < 6))
			greeting = bundle.getString("night");

		return greeting;
	}
}
