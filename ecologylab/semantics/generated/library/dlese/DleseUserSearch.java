package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.dlese.SearchSection;
import ecologylab.semantics.metadata.builtins.CompoundDocument;

/**
*  DleseUserSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_tag("DDSWebService")
public class DleseUserSearch extends CompoundDocument
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("Search") @mm_name("search_section")	private SearchSection searchSection;

	public DleseUserSearch()
	{ }

	public DleseUserSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchSection getSearchSection()
	{
		return searchSection;
	}

	public void setSearchSection(SearchSection searchSection)
	{
		this.searchSection = searchSection;
	}
}
