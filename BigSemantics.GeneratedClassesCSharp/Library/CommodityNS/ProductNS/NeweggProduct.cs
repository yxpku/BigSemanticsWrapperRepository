//
// NeweggProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS 
{
	[SimplInherit]
	public class NeweggProduct : Product
	{
		[SimplScalar]
		private MetadataString itemNumber;

		[SimplCollection("feature")]
		[MmName("features")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> features;

		public NeweggProduct()
		{ }

		public NeweggProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString ItemNumber
		{
			get{return itemNumber;}
			set
			{
				if (this.itemNumber != value)
				{
					this.itemNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> Features
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
	}
}