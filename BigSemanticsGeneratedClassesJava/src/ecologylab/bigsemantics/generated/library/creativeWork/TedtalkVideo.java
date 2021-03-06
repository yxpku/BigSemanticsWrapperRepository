package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.SocialVideo;
import ecologylab.bigsemantics.generated.library.creativeWork.TedTopic;
import ecologylab.bigsemantics.generated.library.creativeWork.TedtalkVideo;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
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
public class TedtalkVideo extends SocialVideo
{
	@simpl_scalar
	private MetadataString numberOfViews;

	@simpl_collection("ted_topic")
	@mm_name("similar_topics")
	private List<TedTopic> similarTopics;

	@simpl_collection("tedtalk_video")
	@mm_name("suggested_videos")
	private List<TedtalkVideo> suggestedVideos;

	public TedtalkVideo()
	{ super(); }

	public TedtalkVideo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	numberOfViews()
	{
		MetadataString	result = this.numberOfViews;
		if (result == null)
		{
			result = new MetadataString();
			this.numberOfViews = result;
		}
		return result;
	}

	public String getNumberOfViews()
	{
		return this.numberOfViews == null ? null : numberOfViews().getValue();
	}

	public MetadataString getNumberOfViewsMetadata()
	{
		return numberOfViews;
	}

	public void setNumberOfViews(String numberOfViews)
	{
		if (numberOfViews != null)
			this.numberOfViews().setValue(numberOfViews);
	}

	public void setNumberOfViewsMetadata(MetadataString numberOfViews)
	{
		this.numberOfViews = numberOfViews;
	}

	public List<TedTopic> getSimilarTopics()
	{
		return similarTopics;
	}

  // lazy evaluation:
  public List<TedTopic> similarTopics()
  {
    if (similarTopics == null)
      similarTopics = new ArrayList<TedTopic>();
    return similarTopics;
  }

  // addTo:
  public void addToSimilarTopics(TedTopic element)
  {
    similarTopics().add(element);
  }

  // size:
  public int similarTopicsSize()
  {
    return similarTopics == null ? 0 : similarTopics.size();
  }

	public void setSimilarTopics(List<TedTopic> similarTopics)
	{
		this.similarTopics = similarTopics;
	}

	public List<TedtalkVideo> getSuggestedVideos()
	{
		return suggestedVideos;
	}

  // lazy evaluation:
  public List<TedtalkVideo> suggestedVideos()
  {
    if (suggestedVideos == null)
      suggestedVideos = new ArrayList<TedtalkVideo>();
    return suggestedVideos;
  }

  // addTo:
  public void addToSuggestedVideos(TedtalkVideo element)
  {
    suggestedVideos().add(element);
  }

  // size:
  public int suggestedVideosSize()
  {
    return suggestedVideos == null ? 0 : suggestedVideos.size();
  }

	public void setSuggestedVideos(List<TedtalkVideo> suggestedVideos)
	{
		this.suggestedVideos = suggestedVideos;
	}
}
