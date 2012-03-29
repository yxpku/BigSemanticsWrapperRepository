package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.flickr.FlickrImageDetail;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *The flickr search class
 */ 
@simpl_inherit
public class FlickrSearchTwo extends CompoundDocument
{
	@simpl_collection("flickr_image_detail")
	@mm_name("flickr_results")
	private List<FlickrImageDetail> flickrResults;

	public FlickrSearchTwo()
	{ super(); }

	public FlickrSearchTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrImageDetail> getFlickrResults()
	{
		return flickrResults;
	}

  // lazy evaluation:
  public List<FlickrImageDetail> flickrResults()
  {
    if (flickrResults == null)
      flickrResults = new ArrayList<FlickrImageDetail>();
    return flickrResults;
  }

  // addTo:
  public void addToFlickrResults(FlickrImageDetail element)
  {
    flickrResults().add(element);
  }

  // size:
  public int flickrResultsSize()
  {
    return flickrResults == null ? 0 : flickrResults.size();
  }

	public void setFlickrResults(List<FlickrImageDetail> flickrResults)
	{
		this.flickrResults = flickrResults;
	}
}
