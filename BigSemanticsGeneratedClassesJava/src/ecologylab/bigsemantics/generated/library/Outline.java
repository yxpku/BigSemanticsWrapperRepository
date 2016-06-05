package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.Outline;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Outline extends Metadata
{
	@simpl_collection("outline")
	@simpl_nowrap
	@mm_name("outlines")
	private List<Outline> outlines;

	@simpl_scalar
	@simpl_tag("htmlUrl")
	private MetadataParsedURL htmlUrl;

	@simpl_scalar
	private MetadataString text;

	@simpl_scalar
	private MetadataString title;

	@simpl_scalar
	private MetadataString type;

	@simpl_scalar
	@simpl_tag("xmlUrl")
	private MetadataParsedURL xmlUrl;

	public Outline()
	{ super(); }

	public Outline(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Outline> getOutlines()
	{
		return outlines;
	}

  // lazy evaluation:
  public List<Outline> outlines()
  {
    if (outlines == null)
      outlines = new ArrayList<Outline>();
    return outlines;
  }

  // addTo:
  public void addToOutlines(Outline element)
  {
    outlines().add(element);
  }

  // size:
  public int outlinesSize()
  {
    return outlines == null ? 0 : outlines.size();
  }

	public void setOutlines(List<Outline> outlines)
	{
		this.outlines = outlines;
	}

	public MetadataParsedURL	htmlUrl()
	{
		MetadataParsedURL	result = this.htmlUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.htmlUrl = result;
		}
		return result;
	}

	public ParsedURL getHtmlUrl()
	{
		return this.htmlUrl == null ? null : htmlUrl().getValue();
	}

	public MetadataParsedURL getHtmlUrlMetadata()
	{
		return htmlUrl;
	}

	public void setHtmlUrl(ParsedURL htmlUrl)
	{
		if (htmlUrl != null)
			this.htmlUrl().setValue(htmlUrl);
	}

	public void setHtmlUrlMetadata(MetadataParsedURL htmlUrl)
	{
		this.htmlUrl = htmlUrl;
	}

	public MetadataString	text()
	{
		MetadataString	result = this.text;
		if (result == null)
		{
			result = new MetadataString();
			this.text = result;
		}
		return result;
	}

	public String getText()
	{
		return this.text == null ? null : text().getValue();
	}

	public MetadataString getTextMetadata()
	{
		return text;
	}

	public void setText(String text)
	{
		if (text != null)
			this.text().setValue(text);
	}

	public void setTextMetadata(MetadataString text)
	{
		this.text = text;
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
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
		return this.type == null ? null : type().getValue();
	}

	public MetadataString getTypeMetadata()
	{
		return type;
	}

	public void setType(String type)
	{
		if (type != null)
			this.type().setValue(type);
	}

	public void setTypeMetadata(MetadataString type)
	{
		this.type = type;
	}

	public MetadataParsedURL	xmlUrl()
	{
		MetadataParsedURL	result = this.xmlUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.xmlUrl = result;
		}
		return result;
	}

	public ParsedURL getXmlUrl()
	{
		return this.xmlUrl == null ? null : xmlUrl().getValue();
	}

	public MetadataParsedURL getXmlUrlMetadata()
	{
		return xmlUrl;
	}

	public void setXmlUrl(ParsedURL xmlUrl)
	{
		if (xmlUrl != null)
			this.xmlUrl().setValue(xmlUrl);
	}

	public void setXmlUrlMetadata(MetadataParsedURL xmlUrl)
	{
		this.xmlUrl = xmlUrl;
	}
}
