package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineMediaContentInYahooMediaRss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineMediaContentInYahooMediaRss extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger height;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("url")	private ecologylab.semantics.metadata.scalar.MetadataParsedURL mediaUrl;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger width;

	public MmdInlineMediaContentInYahooMediaRss()
	{ }

	public MmdInlineMediaContentInYahooMediaRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataInteger	height()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public java.lang.Integer getHeight()
	{
		return this.height == null ? 0 : height().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getHeightMetadata()
	{
		return height;
	}

	public void setHeight(java.lang.Integer height)
	{
		if (height != 0)
			this.height().setValue(height);
	}

	public void setHeightMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger height)
	{
		this.height = height;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	mediaUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.mediaUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.mediaUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getMediaUrl()
	{
		return this.mediaUrl == null ? null : mediaUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getMediaUrlMetadata()
	{
		return mediaUrl;
	}

	public void setMediaUrl(ecologylab.net.ParsedURL mediaUrl)
	{
		if (mediaUrl != null)
			this.mediaUrl().setValue(mediaUrl);
	}

	public void setMediaUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL mediaUrl)
	{
		this.mediaUrl = mediaUrl;
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger	width()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public java.lang.Integer getWidth()
	{
		return this.width == null ? 0 : width().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getWidthMetadata()
	{
		return width;
	}

	public void setWidth(java.lang.Integer width)
	{
		if (width != 0)
			this.width().setValue(width);
	}

	public void setWidthMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger width)
	{
		this.width = width;
	}
}