//
// Commodity.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CommentNS;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS 
{
	[SimplInherit]
	public class Commodity : RichDocument
	{
		[SimplScalar]
		private MetadataString price;

		[SimplCollection("commodity")]
		[MmName("companion_products")]
		private List<Commodity> companionProducts;

		[SimplCollection("commodity")]
		[MmName("comparitive_products")]
		private List<Commodity> comparitiveProducts;

		[SimplCollection("product_detail")]
		[MmName("product_details")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> productDetails;

		[SimplCollection("specification")]
		[MmName("specifications")]
		private List<Specification> specifications;

		[SimplCollection("labeled_specifications")]
		[MmName("specifications_table")]
		private List<LabeledSpecifications> specificationsTable;

		[SimplScalar]
		private MetadataString overallRating;

		[SimplScalar]
		private MetadataParsedURL reviewsLocation;

		[SimplScalar]
		private MetadataInteger numReviews;

		[SimplCollection("review")]
		[MmName("reviews")]
		private List<Review> reviews;

		[SimplComposite]
		[MmName("business_website")]
		private RichDocument businessWebsite;

		[SimplComposite]
		[MmName("business_address")]
		private PostalAddress businessAddress;

		[SimplComposite]
		[MmName("business_gis_location")]
		private GisLocation businessGisLocation;

		public Commodity()
		{ }

		public Commodity(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Price
		{
			get{return price;}
			set
			{
				if (this.price != value)
				{
					this.price = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Commodity> CompanionProducts
		{
			get{return companionProducts;}
			set
			{
				if (this.companionProducts != value)
				{
					this.companionProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Commodity> ComparitiveProducts
		{
			get{return comparitiveProducts;}
			set
			{
				if (this.comparitiveProducts != value)
				{
					this.comparitiveProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> ProductDetails
		{
			get{return productDetails;}
			set
			{
				if (this.productDetails != value)
				{
					this.productDetails = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Specification> Specifications
		{
			get{return specifications;}
			set
			{
				if (this.specifications != value)
				{
					this.specifications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<LabeledSpecifications> SpecificationsTable
		{
			get{return specificationsTable;}
			set
			{
				if (this.specificationsTable != value)
				{
					this.specificationsTable = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString OverallRating
		{
			get{return overallRating;}
			set
			{
				if (this.overallRating != value)
				{
					this.overallRating = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL ReviewsLocation
		{
			get{return reviewsLocation;}
			set
			{
				if (this.reviewsLocation != value)
				{
					this.reviewsLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger NumReviews
		{
			get{return numReviews;}
			set
			{
				if (this.numReviews != value)
				{
					this.numReviews = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Review> Reviews
		{
			get{return reviews;}
			set
			{
				if (this.reviews != value)
				{
					this.reviews = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument BusinessWebsite
		{
			get{return businessWebsite;}
			set
			{
				if (this.businessWebsite != value)
				{
					this.businessWebsite = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public PostalAddress BusinessAddress
		{
			get{return businessAddress;}
			set
			{
				if (this.businessAddress != value)
				{
					this.businessAddress = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GisLocation BusinessGisLocation
		{
			get{return businessGisLocation;}
			set
			{
				if (this.businessGisLocation != value)
				{
					this.businessGisLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
