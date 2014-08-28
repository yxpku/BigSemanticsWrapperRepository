//
// IeeeXploreCitedBy.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
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

namespace Ecologylab.Semantics.Generated.Library.IeeeCitedByNS 
{
	[SimplInherit]
	public class IeeeXploreCitedBy : CompoundDocument
	{
		[SimplScalar]
		private MetadataString ieeeXploreId;

		[SimplCollection("scholarly_article")]
		[MmName("citations")]
		private List<ScholarlyArticle> citations;

		public IeeeXploreCitedBy()
		{ }

		public IeeeXploreCitedBy(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString IeeeXploreId
		{
			get{return ieeeXploreId;}
			set
			{
				if (this.ieeeXploreId != value)
				{
					this.ieeeXploreId = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ScholarlyArticle> Citations
		{
			get{return citations;}
			set
			{
				if (this.citations != value)
				{
					this.citations = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
