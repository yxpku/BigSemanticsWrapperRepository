package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.FondationTag;
import ecologylab.bigsemantics.generated.library.creativeWork.FondationArticle;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.builtins.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FondationArticle extends CreativeWork
{
	@simpl_scalar
	private MetadataString collectionName;

	@simpl_scalar
	private MetadataString articleType;

	@simpl_collection("rich_document")
	@mm_name("external_links")
	private List<RichDocument> externalLinks;

	@simpl_collection("rich_document")
	@mm_name("external_link")
	private List<RichDocument> externalLink;

	@simpl_collection("fondation_article")
	@mm_name("related_page")
	private List<FondationArticle> relatedPage;

	@simpl_collection("fondation_article")
	@mm_name("related_pages")
	private List<FondationArticle> relatedPages;

	@simpl_collection("fondation_tag")
	@mm_name("tags")
	private List<FondationTag> tags;

	@simpl_collection("fondation_article")
	@mm_name("index")
	private List<FondationArticle> index;

	@simpl_collection("rich_document")
	@mm_name("footnotes")
	private List<RichDocument> footnotes;

	public FondationArticle()
	{ super(); }

	public FondationArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	collectionName()
	{
		MetadataString	result = this.collectionName;
		if (result == null)
		{
			result = new MetadataString();
			this.collectionName = result;
		}
		return result;
	}

	public String getCollectionName()
	{
		return this.collectionName == null ? null : collectionName().getValue();
	}

	public MetadataString getCollectionNameMetadata()
	{
		return collectionName;
	}

	public void setCollectionName(String collectionName)
	{
		if (collectionName != null)
			this.collectionName().setValue(collectionName);
	}

	public void setCollectionNameMetadata(MetadataString collectionName)
	{
		this.collectionName = collectionName;
	}

	public MetadataString	articleType()
	{
		MetadataString	result = this.articleType;
		if (result == null)
		{
			result = new MetadataString();
			this.articleType = result;
		}
		return result;
	}

	public String getArticleType()
	{
		return this.articleType == null ? null : articleType().getValue();
	}

	public MetadataString getArticleTypeMetadata()
	{
		return articleType;
	}

	public void setArticleType(String articleType)
	{
		if (articleType != null)
			this.articleType().setValue(articleType);
	}

	public void setArticleTypeMetadata(MetadataString articleType)
	{
		this.articleType = articleType;
	}

	public List<RichDocument> getExternalLinks()
	{
		return externalLinks;
	}

  // lazy evaluation:
  public List<RichDocument> externalLinks()
  {
    if (externalLinks == null)
      externalLinks = new ArrayList<RichDocument>();
    return externalLinks;
  }

  // addTo:
  public void addToExternalLinks(RichDocument element)
  {
    externalLinks().add(element);
  }

  // size:
  public int externalLinksSize()
  {
    return externalLinks == null ? 0 : externalLinks.size();
  }

	public void setExternalLinks(List<RichDocument> externalLinks)
	{
		this.externalLinks = externalLinks;
	}

	public List<RichDocument> getExternalLink()
	{
		return externalLink;
	}

  // lazy evaluation:
  public List<RichDocument> externalLink()
  {
    if (externalLink == null)
      externalLink = new ArrayList<RichDocument>();
    return externalLink;
  }

  // addTo:
  public void addToExternalLink(RichDocument element)
  {
    externalLink().add(element);
  }

  // size:
  public int externalLinkSize()
  {
    return externalLink == null ? 0 : externalLink.size();
  }

	public void setExternalLink(List<RichDocument> externalLink)
	{
		this.externalLink = externalLink;
	}

	public List<FondationArticle> getRelatedPage()
	{
		return relatedPage;
	}

  // lazy evaluation:
  public List<FondationArticle> relatedPage()
  {
    if (relatedPage == null)
      relatedPage = new ArrayList<FondationArticle>();
    return relatedPage;
  }

  // addTo:
  public void addToRelatedPage(FondationArticle element)
  {
    relatedPage().add(element);
  }

  // size:
  public int relatedPageSize()
  {
    return relatedPage == null ? 0 : relatedPage.size();
  }

	public void setRelatedPage(List<FondationArticle> relatedPage)
	{
		this.relatedPage = relatedPage;
	}

	public List<FondationArticle> getRelatedPages()
	{
		return relatedPages;
	}

  // lazy evaluation:
  public List<FondationArticle> relatedPages()
  {
    if (relatedPages == null)
      relatedPages = new ArrayList<FondationArticle>();
    return relatedPages;
  }

  // addTo:
  public void addToRelatedPages(FondationArticle element)
  {
    relatedPages().add(element);
  }

  // size:
  public int relatedPagesSize()
  {
    return relatedPages == null ? 0 : relatedPages.size();
  }

	public void setRelatedPages(List<FondationArticle> relatedPages)
	{
		this.relatedPages = relatedPages;
	}

	public List<FondationTag> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<FondationTag> tags()
  {
    if (tags == null)
      tags = new ArrayList<FondationTag>();
    return tags;
  }

  // addTo:
  public void addToTags(FondationTag element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<FondationTag> tags)
	{
		this.tags = tags;
	}

	public List<FondationArticle> getIndex()
	{
		return index;
	}

  // lazy evaluation:
  public List<FondationArticle> index()
  {
    if (index == null)
      index = new ArrayList<FondationArticle>();
    return index;
  }

  // addTo:
  public void addToIndex(FondationArticle element)
  {
    index().add(element);
  }

  // size:
  public int indexSize()
  {
    return index == null ? 0 : index.size();
  }

	public void setIndex(List<FondationArticle> index)
	{
		this.index = index;
	}

	public List<RichDocument> getFootnotes()
	{
		return footnotes;
	}

  // lazy evaluation:
  public List<RichDocument> footnotes()
  {
    if (footnotes == null)
      footnotes = new ArrayList<RichDocument>();
    return footnotes;
  }

  // addTo:
  public void addToFootnotes(RichDocument element)
  {
    footnotes().add(element);
  }

  // size:
  public int footnotesSize()
  {
    return footnotes == null ? 0 : footnotes.size();
  }

	public void setFootnotes(List<RichDocument> footnotes)
	{
		this.footnotes = footnotes;
	}
}
