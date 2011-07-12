package ecologylab.semantics.generated.library.fastflip;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Thumbnail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Thumbnail extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL pic;

	public Thumbnail()
	{ }

	public Thumbnail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic().getValue();
	}

	public void setPic(ParsedURL pic)
	{
		this.pic().setValue(pic);
	}

}
