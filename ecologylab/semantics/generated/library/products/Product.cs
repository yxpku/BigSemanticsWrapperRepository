//
// Product.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/11/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.products;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.products 
{
	[SimplInherit]
	public class Product : CompoundDocument
	{
		[SimplScalar]
		private MetadataString price;

		[SimplScalar]
		private MetadataString model;

		[SimplScalar]
		private MetadataParsedURL imageUrl;

		[SimplScalar]
		private MetadataParsedURL reviewsLocation;

		[SimplScalar]
		private MetadataString overallRating;

		[SimplCollection("product_review")]
		[MmName("reviews")]
		private List<ProductReview> reviews;

		public Product()
		{ }

		public MetadataString Price
		{
			get{return price;}
			set{price = value;}
		}

		public MetadataString Model
		{
			get{return model;}
			set{model = value;}
		}

		public MetadataParsedURL ImageUrl
		{
			get{return imageUrl;}
			set{imageUrl = value;}
		}

		public MetadataParsedURL ReviewsLocation
		{
			get{return reviewsLocation;}
			set{reviewsLocation = value;}
		}

		public MetadataString OverallRating
		{
			get{return overallRating;}
			set{overallRating = value;}
		}

		public List<ProductReview> Reviews
		{
			get{return reviews;}
			set{reviews = value;}
		}
	}
}
