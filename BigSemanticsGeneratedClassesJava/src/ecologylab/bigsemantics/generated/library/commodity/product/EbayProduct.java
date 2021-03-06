package ecologylab.bigsemantics.generated.library.commodity.product;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.product.Product;
import ecologylab.bigsemantics.generated.library.commodity.product.Seller;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class EbayProduct extends Product
{
	@simpl_scalar
	private MetadataString itemCondition;

	@simpl_scalar
	private MetadataString availability;

	@simpl_composite
	@mm_name("seller")
	private Seller seller;

	public EbayProduct()
	{ super(); }

	public EbayProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	itemCondition()
	{
		MetadataString	result = this.itemCondition;
		if (result == null)
		{
			result = new MetadataString();
			this.itemCondition = result;
		}
		return result;
	}

	public String getItemCondition()
	{
		return this.itemCondition == null ? null : itemCondition().getValue();
	}

	public MetadataString getItemConditionMetadata()
	{
		return itemCondition;
	}

	public void setItemCondition(String itemCondition)
	{
		if (itemCondition != null)
			this.itemCondition().setValue(itemCondition);
	}

	public void setItemConditionMetadata(MetadataString itemCondition)
	{
		this.itemCondition = itemCondition;
	}

	public MetadataString	availability()
	{
		MetadataString	result = this.availability;
		if (result == null)
		{
			result = new MetadataString();
			this.availability = result;
		}
		return result;
	}

	public String getAvailability()
	{
		return this.availability == null ? null : availability().getValue();
	}

	public MetadataString getAvailabilityMetadata()
	{
		return availability;
	}

	public void setAvailability(String availability)
	{
		if (availability != null)
			this.availability().setValue(availability);
	}

	public void setAvailabilityMetadata(MetadataString availability)
	{
		this.availability = availability;
	}

	public Seller getSeller()
	{
		return seller;
	}

	public void setSeller(Seller seller)
	{
		this.seller = seller;
	}
}
