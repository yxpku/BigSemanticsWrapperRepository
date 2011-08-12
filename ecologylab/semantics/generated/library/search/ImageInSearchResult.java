package ecologylab.semantics.generated.library.search;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.builtins.Image;

/**
*  ImageInSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Def of an image in a Bing image search result.
 */ 
@simpl_inherit
public class ImageInSearchResult extends Image
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("mms:Title")	private ecologylab.semantics.metadata.scalar.MetadataString caption;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("mms:ContentType")	private ecologylab.semantics.metadata.scalar.MetadataString contentType;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL referrerUrl;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("mms:FileSize")	private ecologylab.semantics.metadata.scalar.MetadataInteger fileSize;

	public ImageInSearchResult()
	{ }

	public ImageInSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	caption()
	{
		MetadataString	result = this.caption;
		if (result == null)
		{
			result = new MetadataString();
			this.caption = result;
		}
		return result;
	}

	public String getCaption()
	{
		return this.caption == null ? null : caption().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCaptionMetadata()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		if (caption != null)
			this.caption().setValue(caption);
	}

	public void setCaptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString caption)
	{
		this.caption = caption;
	}

	public MetadataString	contentType()
	{
		MetadataString	result = this.contentType;
		if (result == null)
		{
			result = new MetadataString();
			this.contentType = result;
		}
		return result;
	}

	public String getContentType()
	{
		return this.contentType == null ? null : contentType().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getContentTypeMetadata()
	{
		return contentType;
	}

	public void setContentType(String contentType)
	{
		if (contentType != null)
			this.contentType().setValue(contentType);
	}

	public void setContentTypeMetadata(ecologylab.semantics.metadata.scalar.MetadataString contentType)
	{
		this.contentType = contentType;
	}

	public MetadataParsedURL	referrerUrl()
	{
		MetadataParsedURL	result = this.referrerUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.referrerUrl = result;
		}
		return result;
	}

	public ParsedURL getReferrerUrl()
	{
		return this.referrerUrl == null ? null : referrerUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getReferrerUrlMetadata()
	{
		return referrerUrl;
	}

	public void setReferrerUrl(ParsedURL referrerUrl)
	{
		if (referrerUrl != null)
			this.referrerUrl().setValue(referrerUrl);
	}

	public void setReferrerUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL referrerUrl)
	{
		this.referrerUrl = referrerUrl;
	}

	public MetadataInteger	fileSize()
	{
		MetadataInteger	result = this.fileSize;
		if (result == null)
		{
			result = new MetadataInteger();
			this.fileSize = result;
		}
		return result;
	}

	public Integer getFileSize()
	{
		return this.fileSize == null ? 0 : fileSize().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getFileSizeMetadata()
	{
		return fileSize;
	}

	public void setFileSize(Integer fileSize)
	{
		if (fileSize != 0)
			this.fileSize().setValue(fileSize);
	}

	public void setFileSizeMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger fileSize)
	{
		this.fileSize = fileSize;
	}
}
