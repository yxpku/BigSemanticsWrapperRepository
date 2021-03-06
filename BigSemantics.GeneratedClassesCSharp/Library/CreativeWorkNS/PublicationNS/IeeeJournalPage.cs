//
// IeeeJournalPage.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	[SimplInherit]
	public class IeeeJournalPage : Publication
	{
		[SimplCollection("ieee_xplore_article")]
		[MmName("top_articles")]
		private List<IeeeXploreArticle> topArticles;

		public IeeeJournalPage()
		{ }

		public IeeeJournalPage(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IeeeXploreArticle> TopArticles
		{
			get{return topArticles;}
			set
			{
				if (this.topArticles != value)
				{
					this.topArticles = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
