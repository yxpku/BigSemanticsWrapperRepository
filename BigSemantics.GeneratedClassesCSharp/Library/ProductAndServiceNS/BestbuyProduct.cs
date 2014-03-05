//
// BestbuyProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ProductAndServiceNS 
{
	[SimplInherit]
	public class BestbuyProduct : Product
	{
		[SimplCollection("document")]
		[MmName("features")]
		private List<Document> features;

		[SimplCollection("document")]
		[MmName("whats_included")]
		private List<Document> whatsIncluded;

		[SimplCollection("document")]
		[MmName("specifications")]
		private List<Document> specifications;

		[SimplCollection("bestbuy_product")]
		[MmName("companion_products")]
		private List<BestbuyProduct> companionProducts;

		[SimplCollection("bestbuy_product")]
		[MmName("comparative_products")]
		private List<BestbuyProduct> comparativeProducts;

		public BestbuyProduct()
		{ }

		public BestbuyProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Document> Features
		{
			get{return features;}
			set
			{
				if (this.features != value)
				{
					this.features = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> WhatsIncluded
		{
			get{return whatsIncluded;}
			set
			{
				if (this.whatsIncluded != value)
				{
					this.whatsIncluded = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> Specifications
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

		public List<BestbuyProduct> CompanionProducts
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

		public List<BestbuyProduct> ComparativeProducts
		{
			get{return comparativeProducts;}
			set
			{
				if (this.comparativeProducts != value)
				{
					this.comparativeProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}