package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MmdInlineThumbinnerInThumbinnersInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineThumbinnerInThumbinnersInWikipediaPageType extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString thumbImgCaption;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL thumbImgSrc;

	public MmdInlineThumbinnerInThumbinnersInWikipediaPageType()
	{ }

	public MmdInlineThumbinnerInThumbinnersInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	thumbImgCaption()
	{
		MetadataString	result = this.thumbImgCaption;
		if (result == null)
		{
			result = new MetadataString();
			this.thumbImgCaption = result;
		}
		return result;
	}

	public String getThumbImgCaption()
	{
		return this.thumbImgCaption().getValue();
	}

	public void setThumbImgCaption(String thumbImgCaption)
	{
		this.thumbImgCaption().setValue(thumbImgCaption);
	}

	public MetadataParsedURL	thumbImgSrc()
	{
		MetadataParsedURL	result = this.thumbImgSrc;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbImgSrc = result;
		}
		return result;
	}

	public ParsedURL getThumbImgSrc()
	{
		return this.thumbImgSrc().getValue();
	}

	public void setThumbImgSrc(ParsedURL thumbImgSrc)
	{
		this.thumbImgSrc().setValue(thumbImgSrc);
	}

}
