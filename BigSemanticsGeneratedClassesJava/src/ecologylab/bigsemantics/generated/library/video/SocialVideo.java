package ecologylab.bigsemantics.generated.library.video;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.CreativeWork;
import ecologylab.bigsemantics.generated.library.misc.Comment;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataDate;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SocialVideo extends CreativeWork
{
	/** 
	 *Date on which video is uploaded
	 */ 
	@simpl_scalar
	private MetadataDate uploadDate;

	/** 
	 *video License
	 */ 
	@simpl_scalar
	private MetadataString license;

	@simpl_scalar
	private MetadataParsedURL pic;

	/** 
	 *list of tags
	 */ 
	@simpl_collection("document")
	@mm_name("tag")
	private List<Document> tag;

	/** 
	 *Top 2 comments if any
	 */ 
	@simpl_collection("comment")
	@mm_name("top_comments")
	private List<Comment> topComments;

	/** 
	 *Total number of comments received
	 */ 
	@simpl_scalar
	private MetadataInteger numberOfComments;

	/** 
	 *Total number of likes recived
	 */ 
	@simpl_scalar
	private MetadataInteger likes;

	/** 
	 *Total number of dislikes received
	 */ 
	@simpl_scalar
	private MetadataInteger dislikes;

	/** 
	 *Total number of views
	 */ 
	@simpl_scalar
	private MetadataInteger viewCount;

	public SocialVideo()
	{ super(); }

	public SocialVideo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDate	uploadDate()
	{
		MetadataDate	result = this.uploadDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.uploadDate = result;
		}
		return result;
	}

	public Date getUploadDate()
	{
		return this.uploadDate == null ? null : uploadDate().getValue();
	}

	public MetadataDate getUploadDateMetadata()
	{
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate)
	{
		if (uploadDate != null)
			this.uploadDate().setValue(uploadDate);
	}

	public void setUploadDateMetadata(MetadataDate uploadDate)
	{
		this.uploadDate = uploadDate;
	}

	public MetadataString	license()
	{
		MetadataString	result = this.license;
		if (result == null)
		{
			result = new MetadataString();
			this.license = result;
		}
		return result;
	}

	public String getLicense()
	{
		return this.license == null ? null : license().getValue();
	}

	public MetadataString getLicenseMetadata()
	{
		return license;
	}

	public void setLicense(String license)
	{
		if (license != null)
			this.license().setValue(license);
	}

	public void setLicenseMetadata(MetadataString license)
	{
		this.license = license;
	}

	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic == null ? null : pic().getValue();
	}

	public MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		if (pic != null)
			this.pic().setValue(pic);
	}

	public void setPicMetadata(MetadataParsedURL pic)
	{
		this.pic = pic;
	}

	public List<Document> getTag()
	{
		return tag;
	}

  // lazy evaluation:
  public List<Document> tag()
  {
    if (tag == null)
      tag = new ArrayList<Document>();
    return tag;
  }

  // addTo:
  public void addToTag(Document element)
  {
    tag().add(element);
  }

  // size:
  public int tagSize()
  {
    return tag == null ? 0 : tag.size();
  }

	public void setTag(List<Document> tag)
	{
		this.tag = tag;
	}

	public List<Comment> getTopComments()
	{
		return topComments;
	}

  // lazy evaluation:
  public List<Comment> topComments()
  {
    if (topComments == null)
      topComments = new ArrayList<Comment>();
    return topComments;
  }

  // addTo:
  public void addToTopComments(Comment element)
  {
    topComments().add(element);
  }

  // size:
  public int topCommentsSize()
  {
    return topComments == null ? 0 : topComments.size();
  }

	public void setTopComments(List<Comment> topComments)
	{
		this.topComments = topComments;
	}

	public MetadataInteger	numberOfComments()
	{
		MetadataInteger	result = this.numberOfComments;
		if (result == null)
		{
			result = new MetadataInteger();
			this.numberOfComments = result;
		}
		return result;
	}

	public Integer getNumberOfComments()
	{
		return this.numberOfComments == null ? 0 : numberOfComments().getValue();
	}

	public MetadataInteger getNumberOfCommentsMetadata()
	{
		return numberOfComments;
	}

	public void setNumberOfComments(Integer numberOfComments)
	{
		if (numberOfComments != 0)
			this.numberOfComments().setValue(numberOfComments);
	}

	public void setNumberOfCommentsMetadata(MetadataInteger numberOfComments)
	{
		this.numberOfComments = numberOfComments;
	}

	public MetadataInteger	likes()
	{
		MetadataInteger	result = this.likes;
		if (result == null)
		{
			result = new MetadataInteger();
			this.likes = result;
		}
		return result;
	}

	public Integer getLikes()
	{
		return this.likes == null ? 0 : likes().getValue();
	}

	public MetadataInteger getLikesMetadata()
	{
		return likes;
	}

	public void setLikes(Integer likes)
	{
		if (likes != 0)
			this.likes().setValue(likes);
	}

	public void setLikesMetadata(MetadataInteger likes)
	{
		this.likes = likes;
	}

	public MetadataInteger	dislikes()
	{
		MetadataInteger	result = this.dislikes;
		if (result == null)
		{
			result = new MetadataInteger();
			this.dislikes = result;
		}
		return result;
	}

	public Integer getDislikes()
	{
		return this.dislikes == null ? 0 : dislikes().getValue();
	}

	public MetadataInteger getDislikesMetadata()
	{
		return dislikes;
	}

	public void setDislikes(Integer dislikes)
	{
		if (dislikes != 0)
			this.dislikes().setValue(dislikes);
	}

	public void setDislikesMetadata(MetadataInteger dislikes)
	{
		this.dislikes = dislikes;
	}

	public MetadataInteger	viewCount()
	{
		MetadataInteger	result = this.viewCount;
		if (result == null)
		{
			result = new MetadataInteger();
			this.viewCount = result;
		}
		return result;
	}

	public Integer getViewCount()
	{
		return this.viewCount == null ? 0 : viewCount().getValue();
	}

	public MetadataInteger getViewCountMetadata()
	{
		return viewCount;
	}

	public void setViewCount(Integer viewCount)
	{
		if (viewCount != 0)
			this.viewCount().setValue(viewCount);
	}

	public void setViewCountMetadata(MetadataInteger viewCount)
	{
		this.viewCount = viewCount;
	}
}
