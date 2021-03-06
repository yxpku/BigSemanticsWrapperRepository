package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.Attraction;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AttractionList extends RichDocument
{
	@simpl_collection("attraction")
	@mm_name("attractions")
	private List<Attraction> attractions;

	public AttractionList()
	{ super(); }

	public AttractionList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Attraction> getAttractions()
	{
		return attractions;
	}

  // lazy evaluation:
  public List<Attraction> attractions()
  {
    if (attractions == null)
      attractions = new ArrayList<Attraction>();
    return attractions;
  }

  // addTo:
  public void addToAttractions(Attraction element)
  {
    attractions().add(element);
  }

  // size:
  public int attractionsSize()
  {
    return attractions == null ? 0 : attractions.size();
  }

	public void setAttractions(List<Attraction> attractions)
	{
		this.attractions = attractions;
	}
}
