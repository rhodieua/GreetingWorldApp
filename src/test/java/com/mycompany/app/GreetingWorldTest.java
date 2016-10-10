package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.joda.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

import com.mycompany.app.GreetingWorld;

public class GreetingWorldTest {
	
	Locale locale;
	int hour;
	
	@Before
	public void saveDefaultLocale() {
		locale = Locale.getDefault();
	}

	@Test
	public void greetingRu() {
		Locale.setDefault(new Locale("ru", "UA"));
		hour = 7; 
		assertEquals("Доброе утро, Мир!", GreetingWorld.greet(hour));
		hour = 10; 
		assertEquals("Добрый день, Мир!", GreetingWorld.greet(hour));
		hour = 20; 
		assertEquals("Добрый вечер, Мир!", GreetingWorld.greet(hour));
		hour = 2; 
		assertEquals("Доброй ночи, Мир!", GreetingWorld.greet(hour));
	}

	@Test
	public void greetingEn() {
		Locale.setDefault(new Locale("en", "US"));
		hour = 8; 
		assertEquals("Good morning, World!", GreetingWorld.greet(hour));
		hour = 11; 
		assertEquals("Good day, World!", GreetingWorld.greet(hour));
		hour = 21; 
		assertEquals("Good evening, World!", GreetingWorld.greet(hour));
		hour = 3; 
		assertEquals("Good night, World!", GreetingWorld.greet(hour));
	}

	@Test
	public void greetingIsNotEmpty() {
		assertNotEquals("", GreetingWorld.greet());
	}
	
	@After
	public void restoreDefaultLocale() {
		Locale.setDefault(locale);
	}
}
