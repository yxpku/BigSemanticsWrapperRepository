package ecologylab.semantics.generated.library.imdb;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.imdb.PersonDetails;
import ecologylab.semantics.metadata.Metadata;

/**
*  CastMember.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class CastMember extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@mm_name("actor")
	private PersonDetails actor;

	/** 
	 */ 
	@simpl_composite	@mm_name("character")
	private PersonDetails character;

	public CastMember()
	{ }

	public CastMember(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public PersonDetails getActor()
	{
		return actor;
	}

	public void setActor(PersonDetails actor)
	{
		this.actor = actor;
	}

	public PersonDetails getCharacter()
	{
		return character;
	}

	public void setCharacter(PersonDetails character)
	{
		this.character = character;
	}
}
