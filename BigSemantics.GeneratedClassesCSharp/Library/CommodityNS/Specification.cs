//
// Specification.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


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

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS 
{
	[SimplInherit]
	public class Specification : Metadata
	{
		[SimplScalar]
		private MetadataString name;

		[SimplScalar]
		private MetadataString value;

		public Specification()
		{ }

		public Specification(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Name
		{
			get{return name;}
			set
			{
				if (this.name != value)
				{
					this.name = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Value
		{
			get{return value;}
			set
			{
				if (this.value != value)
				{
					this.value = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
