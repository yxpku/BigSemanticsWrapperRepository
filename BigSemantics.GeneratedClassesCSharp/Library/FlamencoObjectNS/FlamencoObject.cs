//
// FlamencoObject.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.Generated.Library.FlamencoFacetNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.FlamencoObjectNS 
{
	[SimplInherit]
	public class FlamencoObject : Artwork
	{
		[SimplScalar]
		private MetadataString category;

		[SimplCollection("flamenco_facet")]
		[MmName("general_facets")]
		private List<FlamencoFacet> generalFacets;

		[SimplCollection("flamenco_facet")]
		[MmName("specific_facets")]
		private List<FlamencoFacet> specificFacets;

		public FlamencoObject()
		{ }

		public FlamencoObject(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Category
		{
			get{return category;}
			set
			{
				if (this.category != value)
				{
					this.category = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FlamencoFacet> GeneralFacets
		{
			get{return generalFacets;}
			set
			{
				if (this.generalFacets != value)
				{
					this.generalFacets = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FlamencoFacet> SpecificFacets
		{
			get{return specificFacets;}
			set
			{
				if (this.specificFacets != value)
				{
					this.specificFacets = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
