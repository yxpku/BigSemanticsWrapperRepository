//
// Forever21.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
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

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS 
{
	[SimplInherit]
	[SimplTag("forever_21")]
	public class Forever21 : Product
	{
		[SimplCollection("rich_document")]
		[MmName("available_colors")]
		private List<RichDocument> availableColors;

		public Forever21()
		{ }

		public Forever21(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<RichDocument> AvailableColors
		{
			get{return availableColors;}
			set
			{
				if (this.availableColors != value)
				{
					this.availableColors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
