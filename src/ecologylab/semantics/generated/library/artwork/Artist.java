package ecologylab.semantics.generated.library.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.artwork.Artwork;
import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Artist extends Author
{
	@simpl_collection("artwork")
	@mm_name("artworks")
	private List<Artwork> artworks;

	public Artist()
	{ super(); }

	public Artist(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Artwork> getArtworks()
	{
		return artworks;
	}

  // lazy evaluation:
  public List<Artwork> artworks()
  {
    if (artworks == null)
      artworks = new ArrayList<Artwork>();
    return artworks;
  }

  // addTo:
  public void addToArtworks(Artwork element)
  {
    artworks().add(element);
  }

  // size:
  public int artworksSize()
  {
    return artworks == null ? 0 : artworks.size();
  }

	public void setArtworks(List<Artwork> artworks)
	{
		this.artworks = artworks;
	}
}
