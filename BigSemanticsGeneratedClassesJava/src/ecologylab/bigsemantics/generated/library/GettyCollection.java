package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.artwork.GettyObject;
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
public class GettyCollection extends RichDocument
{
	@simpl_collection("getty_object")
	@mm_name("artworks")
	private List<GettyObject> artworks;

	public GettyCollection()
	{ super(); }

	public GettyCollection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GettyObject> getArtworks()
	{
		return artworks;
	}

  // lazy evaluation:
  public List<GettyObject> artworks()
  {
    if (artworks == null)
      artworks = new ArrayList<GettyObject>();
    return artworks;
  }

  // addTo:
  public void addToArtworks(GettyObject element)
  {
    artworks().add(element);
  }

  // size:
  public int artworksSize()
  {
    return artworks == null ? 0 : artworks.size();
  }

	public void setArtworks(List<GettyObject> artworks)
	{
		this.artworks = artworks;
	}
}
