package ecologylab.semantics.generated.library.flickr;

import ecologylab.serialization.annotations.simpl_composite;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.flickr.AuthorPhotos;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.generated.library.flickr.FlickrTag;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  FlickrImageDetailTwo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A Flickr Image result page
 */ 
@simpl_inherit
public class FlickrImageDetailTwo extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString views;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString place;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL placeLink;

	/** 
	 */ 
	@simpl_collection("flickr_tag")	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	/** 
	 */ 
	@simpl_composite	@mm_name("author_photos")
	private AuthorPhotos authorPhotos;

	public FlickrImageDetailTwo()
	{ }

	public FlickrImageDetailTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	views()
	{
		MetadataString	result = this.views;
		if (result == null)
		{
			result = new MetadataString();
			this.views = result;
		}
		return result;
	}

	public String getViews()
	{
		return this.views == null ? null : views().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getViewsMetadata()
	{
		return views;
	}

	public void setViews(String views)
	{
		if (views != null)
			this.views().setValue(views);
	}

	public void setViewsMetadata(ecologylab.semantics.metadata.scalar.MetadataString views)
	{
		this.views = views;
	}

	public MetadataString	place()
	{
		MetadataString	result = this.place;
		if (result == null)
		{
			result = new MetadataString();
			this.place = result;
		}
		return result;
	}

	public String getPlace()
	{
		return this.place == null ? null : place().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPlaceMetadata()
	{
		return place;
	}

	public void setPlace(String place)
	{
		if (place != null)
			this.place().setValue(place);
	}

	public void setPlaceMetadata(ecologylab.semantics.metadata.scalar.MetadataString place)
	{
		this.place = place;
	}

	public MetadataParsedURL	placeLink()
	{
		MetadataParsedURL	result = this.placeLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placeLink = result;
		}
		return result;
	}

	public ParsedURL getPlaceLink()
	{
		return this.placeLink == null ? null : placeLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPlaceLinkMetadata()
	{
		return placeLink;
	}

	public void setPlaceLink(ParsedURL placeLink)
	{
		if (placeLink != null)
			this.placeLink().setValue(placeLink);
	}

	public void setPlaceLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL placeLink)
	{
		this.placeLink = placeLink;
	}

	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}

	public AuthorPhotos getAuthorPhotos()
	{
		return authorPhotos;
	}

	public void setAuthorPhotos(AuthorPhotos authorPhotos)
	{
		this.authorPhotos = authorPhotos;
	}
}
