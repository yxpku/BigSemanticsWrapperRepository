package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

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
public class Photostream extends RichDocument
{
	/** 
	 *Collection of all images of a user
	 */ 
	@simpl_collection("flickr_photo")
	@mm_name("stream")
	private List<FlickrPhoto> stream;

	public Photostream()
	{ super(); }

	public Photostream(MetaMetadataCompositeField mmd) {
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
}
