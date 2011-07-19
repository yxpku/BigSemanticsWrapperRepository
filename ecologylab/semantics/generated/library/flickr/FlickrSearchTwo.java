package ecologylab.semantics.generated.library.flickr;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.flickr.FlickrImageDetail;

/**
*  FlickrSearchTwo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The flickr search class
 */ 
@simpl_inherit
public class FlickrSearchTwo extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("flickr_image_detail") @mm_name("flickr_results")	private ArrayList<FlickrImageDetail> flickrResults;

	public FlickrSearchTwo()
	{ }

	public FlickrSearchTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<FlickrImageDetail> getFlickrResults()
	{
		return flickrResults;
	}

	public void setFlickrResults(ArrayList<FlickrImageDetail> flickrResults)
	{
		this.flickrResults = flickrResults;
	}
}
