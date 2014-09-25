package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class MediaContent extends Metadata
{
	@simpl_scalar
	private MetadataInteger height;

	@simpl_scalar
	private MetadataParsedURL mediaUrl;

	@simpl_scalar
	private MetadataInteger width;

	public MediaContent()
	{ super(); }

	public MediaContent(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	height()
	{
		MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public Integer getHeight()
	{
		return this.height == null ? 0 : height().getValue();
	}

	public MetadataInteger getHeightMetadata()
	{
		return height;
	}

	public void setHeight(Integer height)
	{
		if (height != 0)
			this.height().setValue(height);
	}

	public void setHeightMetadata(MetadataInteger height)
	{
		this.height = height;
	}

	public MetadataParsedURL	mediaUrl()
	{
		MetadataParsedURL	result = this.mediaUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.mediaUrl = result;
		}
		return result;
	}

	public ParsedURL getMediaUrl()
	{
		return this.mediaUrl == null ? null : mediaUrl().getValue();
	}

	public MetadataParsedURL getMediaUrlMetadata()
	{
		return mediaUrl;
	}

	public void setMediaUrl(ParsedURL mediaUrl)
	{
		if (mediaUrl != null)
			this.mediaUrl().setValue(mediaUrl);
	}

	public void setMediaUrlMetadata(MetadataParsedURL mediaUrl)
	{
		this.mediaUrl = mediaUrl;
	}

	public MetadataInteger	width()
	{
		MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public Integer getWidth()
	{
		return this.width == null ? 0 : width().getValue();
	}

	public MetadataInteger getWidthMetadata()
	{
		return width;
	}

	public void setWidth(Integer width)
	{
		if (width != 0)
			this.width().setValue(width);
	}

	public void setWidthMetadata(MetadataInteger width)
	{
		this.width = width;
	}
}
