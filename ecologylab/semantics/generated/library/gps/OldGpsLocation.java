package ecologylab.semantics.generated.library.gps;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  OldGpsLocation.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class OldGpsLocation extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString latitude;

	/** 
	 */ 
	@simpl_scalar	private MetadataString longitude;

	/** 
	 */ 
	@simpl_scalar	private MetadataString altitude;

	/** 
	 */ 
	@simpl_scalar	private MetadataString satellites;

	public OldGpsLocation()
	{ }

	public OldGpsLocation(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	latitude()
	{
		MetadataString	result = this.latitude;
		if (result == null)
		{
			result = new MetadataString();
			this.latitude = result;
		}
		return result;
	}

	public String getLatitude()
	{
		return this.latitude().getValue();
	}

	public void setLatitude(String latitude)
	{
		this.latitude().setValue(latitude);
	}

	public MetadataString	longitude()
	{
		MetadataString	result = this.longitude;
		if (result == null)
		{
			result = new MetadataString();
			this.longitude = result;
		}
		return result;
	}

	public String getLongitude()
	{
		return this.longitude().getValue();
	}

	public void setLongitude(String longitude)
	{
		this.longitude().setValue(longitude);
	}

	public MetadataString	altitude()
	{
		MetadataString	result = this.altitude;
		if (result == null)
		{
			result = new MetadataString();
			this.altitude = result;
		}
		return result;
	}

	public String getAltitude()
	{
		return this.altitude().getValue();
	}

	public void setAltitude(String altitude)
	{
		this.altitude().setValue(altitude);
	}

	public MetadataString	satellites()
	{
		MetadataString	result = this.satellites;
		if (result == null)
		{
			result = new MetadataString();
			this.satellites = result;
		}
		return result;
	}

	public String getSatellites()
	{
		return this.satellites().getValue();
	}

	public void setSatellites(String satellites)
	{
		this.satellites().setValue(satellites);
	}

}
