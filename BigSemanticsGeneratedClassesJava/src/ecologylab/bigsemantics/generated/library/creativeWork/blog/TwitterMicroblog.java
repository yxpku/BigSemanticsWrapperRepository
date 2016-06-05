package ecologylab.bigsemantics.generated.library.creativeWork.blog;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.blog.Blog;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.Tweet;
import ecologylab.bigsemantics.generated.library.person.author.Tweeter;
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
public class TwitterMicroblog extends Blog
{
	@simpl_scalar
	private MetadataString username;

	@simpl_collection("tweeter")
	@mm_name("tweeters")
	private List<Tweeter> tweeters;

	@simpl_collection("tweet")
	@mm_name("tweets")
	private List<Tweet> tweets;

	public TwitterMicroblog()
	{ super(); }

	public TwitterMicroblog(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	username()
	{
		MetadataString	result = this.username;
		if (result == null)
		{
			result = new MetadataString();
			this.username = result;
		}
		return result;
	}

	public String getUsername()
	{
		return this.username == null ? null : username().getValue();
	}

	public MetadataString getUsernameMetadata()
	{
		return username;
	}

	public void setUsername(String username)
	{
		if (username != null)
			this.username().setValue(username);
	}

	public void setUsernameMetadata(MetadataString username)
	{
		this.username = username;
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

	public List<Tweet> getTweets()
	{
		return tweets;
	}

  // lazy evaluation:
  public List<Tweet> tweets()
  {
    if (tweets == null)
      tweets = new ArrayList<Tweet>();
    return tweets;
  }

  // addTo:
  public void addToTweets(Tweet element)
  {
    tweets().add(element);
  }

  // size:
  public int tweetsSize()
  {
    return tweets == null ? 0 : tweets.size();
  }

	public void setTweets(List<Tweet> tweets)
	{
		this.tweets = tweets;
	}
}
