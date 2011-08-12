package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  WeatherReport.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The definition of weather report class.
 */ 
@simpl_inherit
public class WeatherReport extends CompoundDocument
{
	/** 
	 * The name of the city.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString city;

	/** 
	 * The weather condition of the city, like sunny or cloudy.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString weather;

	/** 
	 * The URL of the picture indicating weather condition.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL picUrl;

	/** 
	 * The temperature.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString temperature;

	/** 
	 * The humidity of the air.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString humidity;

	/** 
	 * The wind speed.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString wind;

	/** 
	 * The dew point.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString dewPoint;

	public WeatherReport()
	{ }

	public WeatherReport(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	city()
	{
		MetadataString	result = this.city;
		if (result == null)
		{
			result = new MetadataString();
			this.city = result;
		}
		return result;
	}

	public String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(ecologylab.semantics.metadata.scalar.MetadataString city)
	{
		this.city = city;
	}

	public MetadataString	weather()
	{
		MetadataString	result = this.weather;
		if (result == null)
		{
			result = new MetadataString();
			this.weather = result;
		}
		return result;
	}

	public String getWeather()
	{
		return this.weather == null ? null : weather().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getWeatherMetadata()
	{
		return weather;
	}

	public void setWeather(String weather)
	{
		if (weather != null)
			this.weather().setValue(weather);
	}

	public void setWeatherMetadata(ecologylab.semantics.metadata.scalar.MetadataString weather)
	{
		this.weather = weather;
	}

	public MetadataParsedURL	picUrl()
	{
		MetadataParsedURL	result = this.picUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.picUrl = result;
		}
		return result;
	}

	public ParsedURL getPicUrl()
	{
		return this.picUrl == null ? null : picUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPicUrlMetadata()
	{
		return picUrl;
	}

	public void setPicUrl(ParsedURL picUrl)
	{
		if (picUrl != null)
			this.picUrl().setValue(picUrl);
	}

	public void setPicUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL picUrl)
	{
		this.picUrl = picUrl;
	}

	public MetadataString	temperature()
	{
		MetadataString	result = this.temperature;
		if (result == null)
		{
			result = new MetadataString();
			this.temperature = result;
		}
		return result;
	}

	public String getTemperature()
	{
		return this.temperature == null ? null : temperature().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTemperatureMetadata()
	{
		return temperature;
	}

	public void setTemperature(String temperature)
	{
		if (temperature != null)
			this.temperature().setValue(temperature);
	}

	public void setTemperatureMetadata(ecologylab.semantics.metadata.scalar.MetadataString temperature)
	{
		this.temperature = temperature;
	}

	public MetadataString	humidity()
	{
		MetadataString	result = this.humidity;
		if (result == null)
		{
			result = new MetadataString();
			this.humidity = result;
		}
		return result;
	}

	public String getHumidity()
	{
		return this.humidity == null ? null : humidity().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getHumidityMetadata()
	{
		return humidity;
	}

	public void setHumidity(String humidity)
	{
		if (humidity != null)
			this.humidity().setValue(humidity);
	}

	public void setHumidityMetadata(ecologylab.semantics.metadata.scalar.MetadataString humidity)
	{
		this.humidity = humidity;
	}

	public MetadataString	wind()
	{
		MetadataString	result = this.wind;
		if (result == null)
		{
			result = new MetadataString();
			this.wind = result;
		}
		return result;
	}

	public String getWind()
	{
		return this.wind == null ? null : wind().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getWindMetadata()
	{
		return wind;
	}

	public void setWind(String wind)
	{
		if (wind != null)
			this.wind().setValue(wind);
	}

	public void setWindMetadata(ecologylab.semantics.metadata.scalar.MetadataString wind)
	{
		this.wind = wind;
	}

	public MetadataString	dewPoint()
	{
		MetadataString	result = this.dewPoint;
		if (result == null)
		{
			result = new MetadataString();
			this.dewPoint = result;
		}
		return result;
	}

	public String getDewPoint()
	{
		return this.dewPoint == null ? null : dewPoint().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDewPointMetadata()
	{
		return dewPoint;
	}

	public void setDewPoint(String dewPoint)
	{
		if (dewPoint != null)
			this.dewPoint().setValue(dewPoint);
	}

	public void setDewPointMetadata(ecologylab.semantics.metadata.scalar.MetadataString dewPoint)
	{
		this.dewPoint = dewPoint;
	}
}
