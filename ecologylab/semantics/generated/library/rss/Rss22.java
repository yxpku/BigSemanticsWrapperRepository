package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Rss22.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A news feed, yucky style.
 */ 
@simpl_inherit
@xml_tag("rss_2_2")
public class Rss22 extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item") @mm_name("items")	private ArrayList<Item> items;

	public Rss22()
	{ }

	public Rss22(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<Item> getItems()
	{
		return items;
	}

	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
}
