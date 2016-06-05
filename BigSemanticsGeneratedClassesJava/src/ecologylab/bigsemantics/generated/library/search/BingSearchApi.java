package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.Search;
import ecologylab.bigsemantics.generated.library.search.SearchCrumb;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

/** 
 *The bing Search api.
 */ 
@simpl_inherit
public class BingSearchApi extends Search<RichDocument>
{
	@simpl_composite
	@mm_name("search_crumb_composite")
	private SearchCrumb searchCrumbComposite;

	public BingSearchApi()
	{ super(); }

	public BingSearchApi(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchCrumb getSearchCrumbComposite()
	{
		return searchCrumbComposite;
	}

	public void setSearchCrumbComposite(SearchCrumb searchCrumbComposite)
	{
		this.searchCrumbComposite = searchCrumbComposite;
	}
}
