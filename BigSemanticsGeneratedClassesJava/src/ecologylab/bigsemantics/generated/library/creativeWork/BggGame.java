package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.BggGame;
import ecologylab.bigsemantics.generated.library.creativeWork.BoardGame;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *boardgamegeek.com
 */ 
@simpl_inherit
public class BggGame extends BoardGame
{
	@simpl_collection("bgg_game")
	@mm_name("expansions")
	private List<BggGame> expansions;

	public BggGame()
	{ super(); }

	public BggGame(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<BggGame> getExpansions()
	{
		return expansions;
	}

  // lazy evaluation:
  public List<BggGame> expansions()
  {
    if (expansions == null)
      expansions = new ArrayList<BggGame>();
    return expansions;
  }

  // addTo:
  public void addToExpansions(BggGame element)
  {
    expansions().add(element);
  }

  // size:
  public int expansionsSize()
  {
    return expansions == null ? 0 : expansions.size();
  }

	public void setExpansions(List<BggGame> expansions)
	{
		this.expansions = expansions;
	}
}
