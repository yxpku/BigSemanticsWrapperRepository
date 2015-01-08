package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GoogleScholarAuthor extends Author
{
	@simpl_collection("rich_document")
	@mm_name("interests")
	private List<RichDocument> interests;

	@simpl_composite
	@mm_name("homepage")
	private RichDocument homepage;

	@simpl_collection("rich_document")
	@mm_name("top_coauthors")
	private List<RichDocument> topCoauthors;

	@simpl_collection("rich_document")
	@mm_name("papers")
	private List<RichDocument> papers;

	public GoogleScholarAuthor()
	{ super(); }

	public GoogleScholarAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichDocument> getInterests()
	{
		return interests;
	}

  // lazy evaluation:
  public List<RichDocument> interests()
  {
    if (interests == null)
      interests = new ArrayList<RichDocument>();
    return interests;
  }

  // addTo:
  public void addToInterests(RichDocument element)
  {
    interests().add(element);
  }

  // size:
  public int interestsSize()
  {
    return interests == null ? 0 : interests.size();
  }

	public void setInterests(List<RichDocument> interests)
	{
		this.interests = interests;
	}

	public RichDocument getHomepage()
	{
		return homepage;
	}

	public void setHomepage(RichDocument homepage)
	{
		this.homepage = homepage;
	}

	public List<RichDocument> getTopCoauthors()
	{
		return topCoauthors;
	}

  // lazy evaluation:
  public List<RichDocument> topCoauthors()
  {
    if (topCoauthors == null)
      topCoauthors = new ArrayList<RichDocument>();
    return topCoauthors;
  }

  // addTo:
  public void addToTopCoauthors(RichDocument element)
  {
    topCoauthors().add(element);
  }

  // size:
  public int topCoauthorsSize()
  {
    return topCoauthors == null ? 0 : topCoauthors.size();
  }

	public void setTopCoauthors(List<RichDocument> topCoauthors)
	{
		this.topCoauthors = topCoauthors;
	}

	public List<RichDocument> getPapers()
	{
		return papers;
	}

  // lazy evaluation:
  public List<RichDocument> papers()
  {
    if (papers == null)
      papers = new ArrayList<RichDocument>();
    return papers;
  }

  // addTo:
  public void addToPapers(RichDocument element)
  {
    papers().add(element);
  }

  // size:
  public int papersSize()
  {
    return papers == null ? 0 : papers.size();
  }

	public void setPapers(List<RichDocument> papers)
	{
		this.papers = papers;
	}
}
