//
// AsosPage.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class AsosPage : RichDocument
	{
		[SimplCollection("asos")]
		[MmName("products")]
		private List<Asos> products;

		public AsosPage()
		{ }

		public AsosPage(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Asos> Products
		{
			get{return products;}
			set
			{
				if (this.products != value)
				{
					this.products = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}