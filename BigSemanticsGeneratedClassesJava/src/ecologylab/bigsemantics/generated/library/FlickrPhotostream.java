package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.FlickrPhotostream;
import ecologylab.bigsemantics.generated.library.Groups;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.FlickrPhoto;
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

/** 
 *All flickr photos of a particular user
 */ 
@simpl_inherit
public class FlickrPhotostream extends RichDocument
{
	/** 
	 *Collection of all images of a user
	 */ 
	@simpl_collection("flickr_photo")
	@mm_name("stream")
	private List<FlickrPhoto> stream;

	@simpl_collection("flickr_photostream")
	@mm_name("following")
	private List<FlickrPhotostream> following;

	@simpl_collection("groups")
	@mm_name("groups")
	private List<Groups> groups;

	public FlickrPhotostream()
	{ super(); }

	public FlickrPhotostream(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrPhoto> getStream()
	{
		return stream;
	}

  // lazy evaluation:
  public List<FlickrPhoto> stream()
  {
    if (stream == null)
      stream = new ArrayList<FlickrPhoto>();
    return stream;
  }

  // addTo:
  public void addToStream(FlickrPhoto element)
  {
    stream().add(element);
  }

  // size:
  public int streamSize()
  {
    return stream == null ? 0 : stream.size();
  }

	public void setStream(List<FlickrPhoto> stream)
	{
		this.stream = stream;
	}

	public List<FlickrPhotostream> getFollowing()
	{
		return following;
	}

  // lazy evaluation:
  public List<FlickrPhotostream> following()
  {
    if (following == null)
      following = new ArrayList<FlickrPhotostream>();
    return following;
  }

  // addTo:
  public void addToFollowing(FlickrPhotostream element)
  {
    following().add(element);
  }

  // size:
  public int followingSize()
  {
    return following == null ? 0 : following.size();
  }

	public void setFollowing(List<FlickrPhotostream> following)
	{
		this.following = following;
	}

	public List<Groups> getGroups()
	{
		return groups;
	}

  // lazy evaluation:
  public List<Groups> groups()
  {
    if (groups == null)
      groups = new ArrayList<Groups>();
    return groups;
  }

  // addTo:
  public void addToGroups(Groups element)
  {
    groups().add(element);
  }

  // size:
  public int groupsSize()
  {
    return groups == null ? 0 : groups.size();
  }

	public void setGroups(List<Groups> groups)
	{
		this.groups = groups;
	}
}
