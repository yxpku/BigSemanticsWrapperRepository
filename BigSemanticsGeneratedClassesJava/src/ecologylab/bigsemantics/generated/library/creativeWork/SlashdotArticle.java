package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.SlashdotArticle;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.Post;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SlashdotArticle extends Post
{
	@simpl_collection("rich_document")
	@mm_name("anchors")
	private List<RichDocument> anchors;

	@simpl_collection("slashdot_article")
	@mm_name("related_stories")
	private List<SlashdotArticle> relatedStories;

	public SlashdotArticle()
	{ super(); }

	public SlashdotArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichDocument> getAnchors()
	{
		return anchors;
	}

  // lazy evaluation:
  public List<RichDocument> anchors()
  {
    if (anchors == null)
      anchors = new ArrayList<RichDocument>();
    return anchors;
  }

  // addTo:
  public void addToAnchors(RichDocument element)
  {
    anchors().add(element);
  }

  // size:
  public int anchorsSize()
  {
    return anchors == null ? 0 : anchors.size();
  }

	public void setAnchors(List<RichDocument> anchors)
	{
		this.anchors = anchors;
	}

	public List<SlashdotArticle> getRelatedStories()
	{
		return relatedStories;
	}

  // lazy evaluation:
  public List<SlashdotArticle> relatedStories()
  {
    if (relatedStories == null)
      relatedStories = new ArrayList<SlashdotArticle>();
    return relatedStories;
  }

  // addTo:
  public void addToRelatedStories(SlashdotArticle element)
  {
    relatedStories().add(element);
  }

  // size:
  public int relatedStoriesSize()
  {
    return relatedStories == null ? 0 : relatedStories.size();
  }

	public void setRelatedStories(List<SlashdotArticle> relatedStories)
	{
		this.relatedStories = relatedStories;
	}
}
