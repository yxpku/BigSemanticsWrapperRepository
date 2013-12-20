package ecologylab.bigsemantics.generated.library.socialMedia;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.blog.Blog;
import ecologylab.bigsemantics.generated.library.socialMedia.Tweeter;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class TwitterMicroblog extends Blog
{
	@simpl_collection("tweeter")
	@mm_name("tweeters")
	private List<Tweeter> tweeters;

	public TwitterMicroblog()
	{ super(); }

	public TwitterMicroblog(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Tweeter> getTweeters()
	{
		return tweeters;
	}

  // lazy evaluation:
  public List<Tweeter> tweeters()
  {
    if (tweeters == null)
      tweeters = new ArrayList<Tweeter>();
    return tweeters;
  }

  // addTo:
  public void addToTweeters(Tweeter element)
  {
    tweeters().add(element);
  }

  // size:
  public int tweetersSize()
  {
    return tweeters == null ? 0 : tweeters.size();
  }

	public void setTweeters(List<Tweeter> tweeters)
	{
		this.tweeters = tweeters;
	}
}
