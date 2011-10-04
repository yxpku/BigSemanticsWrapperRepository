package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Category.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Category extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString name;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL catLink;

	public Category()
	{ }

	public Category(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	name()
	{
		MetadataString	result = this.name;
		if (result == null)
		{
			result = new MetadataString();
			this.name = result;
		}
		return result;
	}

	public String getName()
	{
		return this.name == null ? null : name().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString name)
	{
		this.name = name;
	}

	public MetadataParsedURL	catLink()
	{
		MetadataParsedURL	result = this.catLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.catLink = result;
		}
		return result;
	}

	public ParsedURL getCatLink()
	{
		return this.catLink == null ? null : catLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getCatLinkMetadata()
	{
		return catLink;
	}

	public void setCatLink(ParsedURL catLink)
	{
		if (catLink != null)
			this.catLink().setValue(catLink);
	}

	public void setCatLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL catLink)
	{
		this.catLink = catLink;
	}
}
