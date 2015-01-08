package ecologylab.bigsemantics.generated.library.commodity.product;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.product.Modcloth;
import ecologylab.bigsemantics.generated.library.commodity.product.ModclothSearch;
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
public class Modcloth extends Product
{
	@simpl_scalar
	private MetadataString designer;

	@simpl_collection("detail")
	@mm_name("details")
	private List<MetadataString> details;

	@simpl_collection("avalailable_size")
	@mm_name("avalailable_sizes")
	private List<MetadataString> avalailableSizes;

	@simpl_scalar
	private MetadataString sizingReccomendation;

	@simpl_collection("modcloth")
	@mm_name("similar_products")
	private List<Modcloth> similarProducts;

	@simpl_collection("modcloth_search")
	@mm_name("tags")
	private List<ModclothSearch> tags;

	public Modcloth()
	{ super(); }

	public Modcloth(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	designer()
	{
		MetadataString	result = this.designer;
		if (result == null)
		{
			result = new MetadataString();
			this.designer = result;
		}
		return result;
	}

	public String getDesigner()
	{
		return this.designer == null ? null : designer().getValue();
	}

	public MetadataString getDesignerMetadata()
	{
		return designer;
	}

	public void setDesigner(String designer)
	{
		if (designer != null)
			this.designer().setValue(designer);
	}

	public void setDesignerMetadata(MetadataString designer)
	{
		this.designer = designer;
	}

	public List<MetadataString> getDetails()
	{
		return details;
	}

  // lazy evaluation:
  public List<MetadataString> details()
  {
    if (details == null)
      details = new ArrayList<MetadataString>();
    return details;
  }

  // addTo:
  public void addToDetails(MetadataString element)
  {
    details().add(element);
  }

  // size:
  public int detailsSize()
  {
    return details == null ? 0 : details.size();
  }

	public void setDetails(List<MetadataString> details)
	{
		this.details = details;
	}

	public List<MetadataString> getAvalailableSizes()
	{
		return avalailableSizes;
	}

  // lazy evaluation:
  public List<MetadataString> avalailableSizes()
  {
    if (avalailableSizes == null)
      avalailableSizes = new ArrayList<MetadataString>();
    return avalailableSizes;
  }

  // addTo:
  public void addToAvalailableSizes(MetadataString element)
  {
    avalailableSizes().add(element);
  }

  // size:
  public int avalailableSizesSize()
  {
    return avalailableSizes == null ? 0 : avalailableSizes.size();
  }

	public void setAvalailableSizes(List<MetadataString> avalailableSizes)
	{
		this.avalailableSizes = avalailableSizes;
	}

	public MetadataString	sizingReccomendation()
	{
		MetadataString	result = this.sizingReccomendation;
		if (result == null)
		{
			result = new MetadataString();
			this.sizingReccomendation = result;
		}
		return result;
	}

	public String getSizingReccomendation()
	{
		return this.sizingReccomendation == null ? null : sizingReccomendation().getValue();
	}

	public MetadataString getSizingReccomendationMetadata()
	{
		return sizingReccomendation;
	}

	public void setSizingReccomendation(String sizingReccomendation)
	{
		if (sizingReccomendation != null)
			this.sizingReccomendation().setValue(sizingReccomendation);
	}

	public void setSizingReccomendationMetadata(MetadataString sizingReccomendation)
	{
		this.sizingReccomendation = sizingReccomendation;
	}

	public List<Modcloth> getSimilarProducts()
	{
		return similarProducts;
	}

  // lazy evaluation:
  public List<Modcloth> similarProducts()
  {
    if (similarProducts == null)
      similarProducts = new ArrayList<Modcloth>();
    return similarProducts;
  }

  // addTo:
  public void addToSimilarProducts(Modcloth element)
  {
    similarProducts().add(element);
  }

  // size:
  public int similarProductsSize()
  {
    return similarProducts == null ? 0 : similarProducts.size();
  }

	public void setSimilarProducts(List<Modcloth> similarProducts)
	{
		this.similarProducts = similarProducts;
	}

	public List<ModclothSearch> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<ModclothSearch> tags()
  {
    if (tags == null)
      tags = new ArrayList<ModclothSearch>();
    return tags;
  }

  // addTo:
  public void addToTags(ModclothSearch element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<ModclothSearch> tags)
	{
		this.tags = tags;
	}
}
