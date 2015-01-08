package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.Search;
import ecologylab.bigsemantics.generated.library.wikipediaPage.WikipediaPage;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

/** 
 *Wikipedia Web Search Class
 */ 
@simpl_inherit
public class WikipediaSearch extends Search<WikipediaPage>
{
	public WikipediaSearch()
	{ super(); }

	public WikipediaSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

}
