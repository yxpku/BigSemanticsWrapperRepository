package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class YahooThumbnail extends Metadata
{
	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	private MetadataParsedURL thumbUrl;

	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	private MetadataInteger width;

	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	private MetadataInteger height;

	public YahooThumbnail()
	{ super(); }

	public YahooThumbnail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	thumbUrl()
	{
		MetadataParsedURL	result = this.thumbUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbUrl = result;
		}
		return result;
	}

	public ParsedURL getThumbUrl()
	{
		return this.thumbUrl == null ? null : thumbUrl().getValue();
	}

	public MetadataParsedURL getThumbUrlMetadata()
	{
		return thumbUrl;
	}

	public void setThumbUrl(ParsedURL thumbUrl)
	{
		if (thumbUrl != null)
			this.thumbUrl().setValue(thumbUrl);
	}

	public void setThumbUrlMetadata(MetadataParsedURL thumbUrl)
	{
		this.thumbUrl = thumbUrl;
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
}
