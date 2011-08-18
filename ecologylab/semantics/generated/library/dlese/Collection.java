package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;

/**
*  Collection.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Collection extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("recordId")	
	private ecologylab.semantics.metadata.scalar.MetadataString id;

	public Collection()
	{ }

	public Collection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	id()
	{
		MetadataString	result = this.id;
		if (result == null)
		{
			result = new MetadataString();
			this.id = result;
		}
		return result;
	}

	public String getId()
	{
		return this.id == null ? null : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getIdMetadata()
	{
		return id;
	}

	public void setId(String id)
	{
		if (id != null)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataString id)
	{
		this.id = id;
	}
}
