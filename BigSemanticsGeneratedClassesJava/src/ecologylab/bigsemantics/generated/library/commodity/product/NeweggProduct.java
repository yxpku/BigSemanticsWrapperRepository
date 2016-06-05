package ecologylab.bigsemantics.generated.library.commodity.product;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.product.Product;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
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
public class NeweggProduct extends Product
{
	@simpl_scalar
	private MetadataString itemNumber;

	@simpl_collection("feature")
	@mm_name("features")
	private List<MetadataString> features;

	public NeweggProduct()
	{ super(); }

	public NeweggProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	itemNumber()
	{
		MetadataString	result = this.itemNumber;
		if (result == null)
		{
			result = new MetadataString();
			this.itemNumber = result;
		}
		return result;
	}

	public String getItemNumber()
	{
		return this.itemNumber == null ? null : itemNumber().getValue();
	}

	public MetadataString getItemNumberMetadata()
	{
		return itemNumber;
	}

	public void setItemNumber(String itemNumber)
	{
		if (itemNumber != null)
			this.itemNumber().setValue(itemNumber);
	}

	public void setItemNumberMetadata(MetadataString itemNumber)
	{
		this.itemNumber = itemNumber;
	}

	public List<MetadataString> getFeatures()
	{
		return features;
	}

  // lazy evaluation:
  public List<MetadataString> features()
  {
    if (features == null)
      features = new ArrayList<MetadataString>();
    return features;
  }

  // addTo:
  public void addToFeatures(MetadataString element)
  {
    features().add(element);
  }

  // size:
  public int featuresSize()
  {
    return features == null ? 0 : features.size();
  }

	public void setFeatures(List<MetadataString> features)
	{
		this.features = features;
	}
}
