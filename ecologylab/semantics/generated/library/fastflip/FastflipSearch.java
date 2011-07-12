package ecologylab.semantics.generated.library.fastflip;

import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  FastflipSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Fast Flip Search
 */ 
@simpl_inherit
public class FastflipSearch extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("thumbnail") @mm_name("thumbnails")	private ArrayList<Thumbnail> thumbnails;

	public FastflipSearch()
	{ }

	public FastflipSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<Thumbnail> getThumbnails()
	{
		return thumbnails;
	}

	public void setThumbnails(ArrayList<Thumbnail> thumbnails)
	{
		this.thumbnails = thumbnails;
	}
}
