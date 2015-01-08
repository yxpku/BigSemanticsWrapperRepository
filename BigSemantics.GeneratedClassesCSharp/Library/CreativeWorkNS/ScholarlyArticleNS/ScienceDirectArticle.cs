//
// ScienceDirectArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS 
{
	/// <summary>
	/// Information about the article
	/// </summary>
	[SimplInherit]
	public class ScienceDirectArticle : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("citations_page")]
		private ScopusSearch citationsPage;

		/// <summary>
		/// The digital object identifier of the article
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL doi;

		public ScienceDirectArticle()
		{ }

		public ScienceDirectArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public ScopusSearch CitationsPage
		{
			get{return citationsPage;}
			set
			{
				if (this.citationsPage != value)
				{
					this.citationsPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Doi
		{
			get{return doi;}
			set
			{
				if (this.doi != value)
				{
					this.doi = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
