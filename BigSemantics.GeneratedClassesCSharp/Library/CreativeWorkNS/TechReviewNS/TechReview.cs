//
// TechReview.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.TechReviewNS 
{
	/// <summary>
	/// Base tech review
	/// </summary>
	[SimplInherit]
	public class TechReview : CreativeWork
	{
		[SimplScalar]
		private MetadataString price;

		[SimplScalar]
		private MetadataString publicationDate;

		public TechReview()
		{ }

		public TechReview(MetaMetadataCompositeField mmd) : base(mmd) { }


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

		public MetadataString PublicationDate
		{
			get{return publicationDate;}
			set
			{
				if (this.publicationDate != value)
				{
					this.publicationDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
