package ecologylab.semantics.generated.library.uva;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  KeywordSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class KeywordSet extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString type;

	public KeywordSet()
	{ }

	public KeywordSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	type()
	{
		MetadataString	result = this.type;
		if (result == null)
		{
			result = new MetadataString();
			this.type = result;
		}
		return result;
	}

	public String getType()
	{
		return this.type().getValue();
	}

	public void setType(String type)
	{
		this.type().setValue(type);
	}

}
