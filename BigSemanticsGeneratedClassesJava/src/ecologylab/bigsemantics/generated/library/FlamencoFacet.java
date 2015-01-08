package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.artwork.FlamencoObject;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FlamencoFacet extends RichDocument
{
	@simpl_collection("flamenco_object")
	@mm_name("sub_facets")
	private List<FlamencoObject> subFacets;

	@simpl_collection("flamenco_object")
	@mm_name("flamenco_objects")
	private List<FlamencoObject> flamencoObjects;

	@simpl_scalar
	private MetadataString objectCount;

	public FlamencoFacet()
	{ super(); }

	public FlamencoFacet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlamencoObject> getSubFacets()
	{
		return subFacets;
	}

  // lazy evaluation:
  public List<FlamencoObject> subFacets()
  {
    if (subFacets == null)
      subFacets = new ArrayList<FlamencoObject>();
    return subFacets;
  }

  // addTo:
  public void addToSubFacets(FlamencoObject element)
  {
    subFacets().add(element);
  }

  // size:
  public int subFacetsSize()
  {
    return subFacets == null ? 0 : subFacets.size();
  }

	public void setSubFacets(List<FlamencoObject> subFacets)
	{
		this.subFacets = subFacets;
	}

	public List<FlamencoObject> getFlamencoObjects()
	{
		return flamencoObjects;
	}

  // lazy evaluation:
  public List<FlamencoObject> flamencoObjects()
  {
    if (flamencoObjects == null)
      flamencoObjects = new ArrayList<FlamencoObject>();
    return flamencoObjects;
  }

  // addTo:
  public void addToFlamencoObjects(FlamencoObject element)
  {
    flamencoObjects().add(element);
  }

  // size:
  public int flamencoObjectsSize()
  {
    return flamencoObjects == null ? 0 : flamencoObjects.size();
  }

	public void setFlamencoObjects(List<FlamencoObject> flamencoObjects)
	{
		this.flamencoObjects = flamencoObjects;
	}

	public MetadataString	objectCount()
	{
		MetadataString	result = this.objectCount;
		if (result == null)
		{
			result = new MetadataString();
			this.objectCount = result;
		}
		return result;
	}

	public String getObjectCount()
	{
		return this.objectCount == null ? null : objectCount().getValue();
	}

	public MetadataString getObjectCountMetadata()
	{
		return objectCount;
	}

	public void setObjectCount(String objectCount)
	{
		if (objectCount != null)
			this.objectCount().setValue(objectCount);
	}

	public void setObjectCountMetadata(MetadataString objectCount)
	{
		this.objectCount = objectCount;
	}
}
