package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.Item;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *A news feed, yucky style.
 */ 
@simpl_inherit
@simpl_tag("rss_2_2")
public class Rss22 extends RichDocument
{
	@simpl_collection("item")
	@simpl_nowrap
	@mm_name("items")
	private List<Item> items;

	public Rss22()
	{ super(); }

	public Rss22(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Item> getItems()
	{
		return items;
	}

  // lazy evaluation:
  public List<Item> items()
  {
    if (items == null)
      items = new ArrayList<Item>();
    return items;
  }

  // addTo:
  public void addToItems(Item element)
  {
    items().add(element);
  }

  // size:
  public int itemsSize()
  {
    return items == null ? 0 : items.size();
  }

	public void setItems(List<Item> items)
	{
		this.items = items;
	}
}
