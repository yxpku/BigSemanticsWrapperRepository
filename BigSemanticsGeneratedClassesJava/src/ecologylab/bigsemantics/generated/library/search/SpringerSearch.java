package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.publication.SpringerBook;
import ecologylab.bigsemantics.generated.library.search.Search;
import ecologylab.bigsemantics.generated.library.search.SpringerSearch;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *The springer search class
 */ 
@simpl_inherit
public class SpringerSearch extends Search<SpringerBook>
{
	@simpl_collection("search_filter")
	@mm_name("search_filters")
	private List<MetadataString> searchFilters;

	@simpl_collection("springer_search")
	@mm_name("refine_search_by_content_type")
	private List<SpringerSearch> refineSearchByContentType;

	@simpl_collection("springer_search")
	@mm_name("refine_search_by_discipline")
	private List<SpringerSearch> refineSearchByDiscipline;

	@simpl_collection("springer_search")
	@mm_name("refine_search_by_subdiscipline")
	private List<SpringerSearch> refineSearchBySubdiscipline;

	@simpl_collection("springer_search")
	@mm_name("refine_search_by_published_in")
	private List<SpringerSearch> refineSearchByPublishedIn;

	@simpl_collection("springer_search")
	@mm_name("refine_search_by_language")
	private List<SpringerSearch> refineSearchByLanguage;

	public SpringerSearch()
	{ super(); }

	public SpringerSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MetadataString> getSearchFilters()
	{
		return searchFilters;
	}

  // lazy evaluation:
  public List<MetadataString> searchFilters()
  {
    if (searchFilters == null)
      searchFilters = new ArrayList<MetadataString>();
    return searchFilters;
  }

  // addTo:
  public void addToSearchFilters(MetadataString element)
  {
    searchFilters().add(element);
  }

  // size:
  public int searchFiltersSize()
  {
    return searchFilters == null ? 0 : searchFilters.size();
  }

	public void setSearchFilters(List<MetadataString> searchFilters)
	{
		this.searchFilters = searchFilters;
	}

	public List<SpringerSearch> getRefineSearchByContentType()
	{
		return refineSearchByContentType;
	}

  // lazy evaluation:
  public List<SpringerSearch> refineSearchByContentType()
  {
    if (refineSearchByContentType == null)
      refineSearchByContentType = new ArrayList<SpringerSearch>();
    return refineSearchByContentType;
  }

  // addTo:
  public void addToRefineSearchByContentType(SpringerSearch element)
  {
    refineSearchByContentType().add(element);
  }

  // size:
  public int refineSearchByContentTypeSize()
  {
    return refineSearchByContentType == null ? 0 : refineSearchByContentType.size();
  }

	public void setRefineSearchByContentType(List<SpringerSearch> refineSearchByContentType)
	{
		this.refineSearchByContentType = refineSearchByContentType;
	}

	public List<SpringerSearch> getRefineSearchByDiscipline()
	{
		return refineSearchByDiscipline;
	}

  // lazy evaluation:
  public List<SpringerSearch> refineSearchByDiscipline()
  {
    if (refineSearchByDiscipline == null)
      refineSearchByDiscipline = new ArrayList<SpringerSearch>();
    return refineSearchByDiscipline;
  }

  // addTo:
  public void addToRefineSearchByDiscipline(SpringerSearch element)
  {
    refineSearchByDiscipline().add(element);
  }

  // size:
  public int refineSearchByDisciplineSize()
  {
    return refineSearchByDiscipline == null ? 0 : refineSearchByDiscipline.size();
  }

	public void setRefineSearchByDiscipline(List<SpringerSearch> refineSearchByDiscipline)
	{
		this.refineSearchByDiscipline = refineSearchByDiscipline;
	}

	public List<SpringerSearch> getRefineSearchBySubdiscipline()
	{
		return refineSearchBySubdiscipline;
	}

  // lazy evaluation:
  public List<SpringerSearch> refineSearchBySubdiscipline()
  {
    if (refineSearchBySubdiscipline == null)
      refineSearchBySubdiscipline = new ArrayList<SpringerSearch>();
    return refineSearchBySubdiscipline;
  }

  // addTo:
  public void addToRefineSearchBySubdiscipline(SpringerSearch element)
  {
    refineSearchBySubdiscipline().add(element);
  }

  // size:
  public int refineSearchBySubdisciplineSize()
  {
    return refineSearchBySubdiscipline == null ? 0 : refineSearchBySubdiscipline.size();
  }

	public void setRefineSearchBySubdiscipline(List<SpringerSearch> refineSearchBySubdiscipline)
	{
		this.refineSearchBySubdiscipline = refineSearchBySubdiscipline;
	}

	public List<SpringerSearch> getRefineSearchByPublishedIn()
	{
		return refineSearchByPublishedIn;
	}

  // lazy evaluation:
  public List<SpringerSearch> refineSearchByPublishedIn()
  {
    if (refineSearchByPublishedIn == null)
      refineSearchByPublishedIn = new ArrayList<SpringerSearch>();
    return refineSearchByPublishedIn;
  }

  // addTo:
  public void addToRefineSearchByPublishedIn(SpringerSearch element)
  {
    refineSearchByPublishedIn().add(element);
  }

  // size:
  public int refineSearchByPublishedInSize()
  {
    return refineSearchByPublishedIn == null ? 0 : refineSearchByPublishedIn.size();
  }

	public void setRefineSearchByPublishedIn(List<SpringerSearch> refineSearchByPublishedIn)
	{
		this.refineSearchByPublishedIn = refineSearchByPublishedIn;
	}

	public List<SpringerSearch> getRefineSearchByLanguage()
	{
		return refineSearchByLanguage;
	}

  // lazy evaluation:
  public List<SpringerSearch> refineSearchByLanguage()
  {
    if (refineSearchByLanguage == null)
      refineSearchByLanguage = new ArrayList<SpringerSearch>();
    return refineSearchByLanguage;
  }

  // addTo:
  public void addToRefineSearchByLanguage(SpringerSearch element)
  {
    refineSearchByLanguage().add(element);
  }

  // size:
  public int refineSearchByLanguageSize()
  {
    return refineSearchByLanguage == null ? 0 : refineSearchByLanguage.size();
  }

	public void setRefineSearchByLanguage(List<SpringerSearch> refineSearchByLanguage)
	{
		this.refineSearchByLanguage = refineSearchByLanguage;
	}
}
