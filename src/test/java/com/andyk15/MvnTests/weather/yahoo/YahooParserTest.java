package com.andyk15.MvnTests.weather.yahoo;

import java.io.InputStream;
import junit.framework.TestCase;

import com.andyk15.MvnTests.weather.Weather;
import com.andyk15.MvnTests.weather.YahooParser;

public class YahooParserTest extends TestCase 
{

	public YahooParserTest(String name)
	{
	
		super (name);
	}

	public void testParser() throws Exception
	{
		InputStream nyData = getClass().getClassLoader().getResourceAsStream("ny-weather.xml");
		Weather weather = new YahooParser.parse(nyData);
		
		assertEquals("New York", weather.getCity());
		assertEquals("NY",weather.getRegion());
		assertEquals("US", weather.getCountry());
	}
}
