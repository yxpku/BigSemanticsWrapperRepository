package ecologylab.semantics.generated.library.search;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  FlickrNearbySearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class FlickrNearbySearchResult extends SearchResult
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL linkOther;

	public FlickrNearbySearchResult()
	{ }

	public FlickrNearbySearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	linkOther()
	{
		MetadataParsedURL	result = this.linkOther;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.linkOther = result;
		}
		return result;
	}

	public ParsedURL getLinkOther()
	{
		return this.linkOther == null ? null : linkOther().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkOtherMetadata()
	{
		return linkOther;
	}

	public void setLinkOther(ParsedURL linkOther)
	{
		if (linkOther != null)
			this.linkOther().setValue(linkOther);
	}

	public void setLinkOtherMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL linkOther)
	{
		this.linkOther = linkOther;
	}
}
