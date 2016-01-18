package com.andyk15.MvnTests.weather; 

public class Weather
{
	private String city;
	private String region;
	private String country;
	private String temp;
	private String condition;
	private String chill;
	private String humidity;

	public Weather() 
	{ 
		// CLASS constructor
	}
	public String getCity()
	{	
		return city;
	}

	public void setCity(final String city)
	{
		this.city=city;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(final String region)
	{	
		this.region=region;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(final String country)
	{
		this.country=country;
	}

	public String getCondition()
	{
		return condition;
	}

	public void setCondition(final String condition)
	{
		this.condition=condition;
	}

	public String getTemp()
	{
		return temp;
	}

	public void setTemp(final String temp)
	{
		this.temp=temp;
	}

	public String getChill()
	{
		return chill;
	}

	public void setChill(final String chill)
	{
		this.chill=chill;
	}

	public String getHumidity()
	{	
		return humidity;
	}

	public void setHumidity(final String humidity)
	{
		this.humidity=humidity;
	}
}
