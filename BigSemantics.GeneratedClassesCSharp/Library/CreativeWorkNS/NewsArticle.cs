//
// NewsArticle.cs
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	[SimplInherit]
	public class NewsArticle : CreativeWork
	{
		[SimplScalar]
		private MetadataString publicationDate;

		[SimplScalar]
		private MetadataString subject;

		public NewsArticle()
		{ }

		public NewsArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


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

		public MetadataString Subject
		{
			get{return subject;}
			set
			{
				if (this.subject != value)
				{
					this.subject = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
