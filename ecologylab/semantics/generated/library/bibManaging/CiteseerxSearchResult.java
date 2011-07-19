package ecologylab.semantics.generated.library.bibManaging;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  CiteseerxSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class CiteseerxSearchResult extends SearchResult
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString citationInfo;

	public CiteseerxSearchResult()
	{ }

	public CiteseerxSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	citationInfo()
	{
		MetadataString	result = this.citationInfo;
		if (result == null)
		{
			result = new MetadataString();
			this.citationInfo = result;
		}
		return result;
	}

	public String getCitationInfo()
	{
		return this.citationInfo().getValue();
	}

	public void setCitationInfo(String citationInfo)
	{
		this.citationInfo().setValue(citationInfo);
	}

}
