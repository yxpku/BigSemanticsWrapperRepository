package ecologylab.semantics.generated.library.imdb;

import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  ImdbGenre.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * IMDB genre
 */ 
@simpl_inherit
public class ImdbGenre extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("imdb_title") @mm_name("results")	private ArrayList<ImdbTitle> results;

	public ImdbGenre()
	{ }

	public ImdbGenre(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<ImdbTitle> getResults()
	{
		return results;
	}

	public void setResults(ArrayList<ImdbTitle> results)
	{
		this.results = results;
	}
}
