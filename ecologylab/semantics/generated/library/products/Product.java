package ecologylab.semantics.generated.library.products;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.products.ProductReview;

/**
*  Product.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Product extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString price;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString model;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL imageUrl;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL reviewsLocation;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString overallRating;

	/** 
	 */ 
	@simpl_collection("product_review")	@mm_name("reviews")
	private List<ProductReview> reviews;

	public Product()
	{ }

	public Product(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	price()
	{
		MetadataString	result = this.price;
		if (result == null)
		{
			result = new MetadataString();
			this.price = result;
		}
		return result;
	}

	public String getPrice()
	{
		return this.price == null ? null : price().getValue();
	}

	public MetadataString getPriceMetadata()
	{
		return price;
	}

	public void setPrice(String price)
	{
		if (price != null)
			this.price().setValue(price);
	}

	public void setPriceMetadata(MetadataString price)
	{
		this.price = price;
	}

	public MetadataString	model()
	{
		MetadataString	result = this.model;
		if (result == null)
		{
			result = new MetadataString();
			this.model = result;
		}
		return result;
	}

	public String getModel()
	{
		return this.model == null ? null : model().getValue();
	}

	public MetadataString getModelMetadata()
	{
		return model;
	}

	public void setModel(String model)
	{
		if (model != null)
			this.model().setValue(model);
	}

	public void setModelMetadata(MetadataString model)
	{
		this.model = model;
	}

	public MetadataParsedURL	imageUrl()
	{
		MetadataParsedURL	result = this.imageUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageUrl = result;
		}
		return result;
	}

	public ParsedURL getImageUrl()
	{
		return this.imageUrl == null ? null : imageUrl().getValue();
	}

	public MetadataParsedURL getImageUrlMetadata()
	{
		return imageUrl;
	}

	public void setImageUrl(ParsedURL imageUrl)
	{
		if (imageUrl != null)
			this.imageUrl().setValue(imageUrl);
	}

	public void setImageUrlMetadata(MetadataParsedURL imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public MetadataParsedURL	reviewsLocation()
	{
		MetadataParsedURL	result = this.reviewsLocation;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.reviewsLocation = result;
		}
		return result;
	}

	public ParsedURL getReviewsLocation()
	{
		return this.reviewsLocation == null ? null : reviewsLocation().getValue();
	}

	public MetadataParsedURL getReviewsLocationMetadata()
	{
		return reviewsLocation;
	}

	public void setReviewsLocation(ParsedURL reviewsLocation)
	{
		if (reviewsLocation != null)
			this.reviewsLocation().setValue(reviewsLocation);
	}

	public void setReviewsLocationMetadata(MetadataParsedURL reviewsLocation)
	{
		this.reviewsLocation = reviewsLocation;
	}

	public MetadataString	overallRating()
	{
		MetadataString	result = this.overallRating;
		if (result == null)
		{
			result = new MetadataString();
			this.overallRating = result;
		}
		return result;
	}

	public String getOverallRating()
	{
		return this.overallRating == null ? null : overallRating().getValue();
	}

	public MetadataString getOverallRatingMetadata()
	{
		return overallRating;
	}

	public void setOverallRating(String overallRating)
	{
		if (overallRating != null)
			this.overallRating().setValue(overallRating);
	}

	public void setOverallRatingMetadata(MetadataString overallRating)
	{
		this.overallRating = overallRating;
	}

	public List<ProductReview> getReviews()
	{
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews)
	{
		this.reviews = reviews;
	}
}
