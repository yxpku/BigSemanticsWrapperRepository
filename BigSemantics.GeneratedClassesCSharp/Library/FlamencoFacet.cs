//
// FlamencoFacet.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS;
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class FlamencoFacet : RichDocument
	{
		[SimplCollection("flamenco_object")]
		[MmName("sub_facets")]
		private List<FlamencoObject> subFacets;

		[SimplCollection("flamenco_object")]
		[MmName("flamenco_objects")]
		private List<FlamencoObject> flamencoObjects;

		[SimplScalar]
		private MetadataString objectCount;

		public FlamencoFacet()
		{ }

		public FlamencoFacet(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<FlamencoObject> SubFacets
		{
			get{return subFacets;}
			set
			{
				if (this.subFacets != value)
				{
					this.subFacets = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FlamencoObject> FlamencoObjects
		{
			get{return flamencoObjects;}
			set
			{
				if (this.flamencoObjects != value)
				{
					this.flamencoObjects = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ObjectCount
		{
			get{return objectCount;}
			set
			{
				if (this.objectCount != value)
				{
					this.objectCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}