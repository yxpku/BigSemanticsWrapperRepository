package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.FlickrPhoto;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Author on flickr
 */ 
@simpl_inherit
public class FlickrAuthor extends Author
{
	/** 
	 *Image favorites
	 */ 
	@simpl_collection("flickr_photo")
	@mm_name("favorites")
	private List<FlickrPhoto> favorites;

	public FlickrAuthor()
	{ super(); }

	public FlickrAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrPhoto> getFavorites()
	{
		return favorites;
	}

  // lazy evaluation:
  public List<FlickrPhoto> favorites()
  {
    if (favorites == null)
      favorites = new ArrayList<FlickrPhoto>();
    return favorites;
  }

  // addTo:
  public void addToFavorites(FlickrPhoto element)
  {
    favorites().add(element);
  }

  // size:
  public int favoritesSize()
  {
    return favorites == null ? 0 : favorites.size();
  }

	public void setFavorites(List<FlickrPhoto> favorites)
	{
		this.favorites = favorites;
	}
}
