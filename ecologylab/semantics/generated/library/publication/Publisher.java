package ecologylab.semantics.generated.library.publication;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;

/**
*  Publisher.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A publishing company.
 */ 
@simpl_inherit
public class Publisher extends Document
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString city;

	public Publisher()
	{ }

	public Publisher(MetaMetadataCompositeField mmd) {
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

	public MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(MetadataString city)
	{
		this.city = city;
	}
}
