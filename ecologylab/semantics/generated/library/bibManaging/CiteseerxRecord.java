package ecologylab.semantics.generated.library.bibManaging;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.bibManaging.CitationInfo;
import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;

/**
*  CiteseerxRecord.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * CiteSeerX record for an article.
 */ 
@simpl_inherit
public class CiteseerxRecord extends ScholarlyArticle
{
	/** 
	 */ 
	@simpl_composite	@mm_name("citation_info")
	private CitationInfo citationInfo;

	public CiteseerxRecord()
	{ }

	public CiteseerxRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public CitationInfo getCitationInfo()
	{
		return citationInfo;
	}

	public void setCitationInfo(CitationInfo citationInfo)
	{
		this.citationInfo = citationInfo;
	}
}
