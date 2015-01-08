package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.Search;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_scope;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *A search.
 */ 
@simpl_inherit
public class Search<SR extends RichDocument> extends RichDocument
{
	/** 
	 *Useful for smaller searches where knowing num results is helpful
	 */ 
	@simpl_scalar
	private MetadataString numberOfResults;

	@simpl_collection
	@simpl_nowrap
	@simpl_scope("repository_documents")
	@mm_name("search_results")
	private List<SR> searchResults;

	@simpl_collection("search")
	@mm_name("related_searches")
	private List<Search> relatedSearches;

	@simpl_composite
	@mm_name("next_page")
	private Search nextPage;

	public Search()
	{ super(); }

	public Search(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	numberOfResults()
	{
		MetadataString	result = this.numberOfResults;
		if (result == null)
		{
			result = new MetadataString();
			this.numberOfResults = result;
		}
		return result;
	}

	public String getNumberOfResults()
	{
		return this.numberOfResults == null ? null : numberOfResults().getValue();
	}

	public MetadataString getNumberOfResultsMetadata()
	{
		return numberOfResults;
	}

	public void setNumberOfResults(String numberOfResults)
	{
		if (numberOfResults != null)
			this.numberOfResults().setValue(numberOfResults);
	}

	public void setNumberOfResultsMetadata(MetadataString numberOfResults)
	{
		this.numberOfResults = numberOfResults;
	}

	public List<SR> getSearchResults()
	{
		return searchResults;
	}

  // lazy evaluation:
  public List<SR> searchResults()
  {
    if (searchResults == null)
      searchResults = new ArrayList<SR>();
    return searchResults;
  }

  // addTo:
  public void addToSearchResults(SR element)
  {
    searchResults().add(element);
  }

  // size:
  public int searchResultsSize()
  {
    return searchResults == null ? 0 : searchResults.size();
  }

	public void setSearchResults(List<SR> searchResults)
	{
		this.searchResults = searchResults;
	}

	public List<Search> getRelatedSearches()
	{
		return relatedSearches;
	}

  // lazy evaluation:
  public List<Search> relatedSearches()
  {
    if (relatedSearches == null)
      relatedSearches = new ArrayList<Search>();
    return relatedSearches;
  }

  // addTo:
  public void addToRelatedSearches(Search element)
  {
    relatedSearches().add(element);
  }

  // size:
  public int relatedSearchesSize()
  {
    return relatedSearches == null ? 0 : relatedSearches.size();
  }

	public void setRelatedSearches(List<Search> relatedSearches)
	{
		this.relatedSearches = relatedSearches;
	}

	public Search getNextPage()
	{
		return nextPage;
	}

	public void setNextPage(Search nextPage)
	{
		this.nextPage = nextPage;
	}
}
