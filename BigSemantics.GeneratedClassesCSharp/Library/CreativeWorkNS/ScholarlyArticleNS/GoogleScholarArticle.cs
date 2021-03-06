//
// GoogleScholarArticle.cs
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
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS 
{
	[SimplInherit]
	public class GoogleScholarArticle : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("article_link")]
		private RichDocument articleLink;

		[SimplScalar]
		private MetadataString journal;

		[SimplScalar]
		private MetadataString date;

		[SimplScalar]
		private MetadataString citationCount;

		[SimplComposite]
		[MmName("citations_page")]
		private GoogleScholarSearch citationsPage;

		[SimplScalar]
		private MetadataString volume;

		[SimplScalar]
		private MetadataString issue;

		[SimplScalar]
		private MetadataString publisher;

		[SimplComposite]
		[MmName("citation_graph")]
		private Image citationGraph;

		[SimplComposite]
		[MmName("google_citations")]
		private RichDocument googleCitations;

		public GoogleScholarArticle()
		{ }

		public GoogleScholarArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public RichDocument ArticleLink
		{
			get{return articleLink;}
			set
			{
				if (this.articleLink != value)
				{
					this.articleLink = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Journal
		{
			get{return journal;}
			set
			{
				if (this.journal != value)
				{
					this.journal = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Date
		{
			get{return date;}
			set
			{
				if (this.date != value)
				{
					this.date = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CitationCount
		{
			get{return citationCount;}
			set
			{
				if (this.citationCount != value)
				{
					this.citationCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GoogleScholarSearch CitationsPage
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

		public MetadataString Volume
		{
			get{return volume;}
			set
			{
				if (this.volume != value)
				{
					this.volume = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Issue
		{
			get{return issue;}
			set
			{
				if (this.issue != value)
				{
					this.issue = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Publisher
		{
			get{return publisher;}
			set
			{
				if (this.publisher != value)
				{
					this.publisher = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Image CitationGraph
		{
			get{return citationGraph;}
			set
			{
				if (this.citationGraph != value)
				{
					this.citationGraph = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument GoogleCitations
		{
			get{return googleCitations;}
			set
			{
				if (this.googleCitations != value)
				{
					this.googleCitations = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
