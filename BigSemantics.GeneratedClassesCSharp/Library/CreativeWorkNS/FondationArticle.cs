//
// FondationArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
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
	public class FondationArticle : CreativeWork
	{
		[SimplScalar]
		private MetadataString collectionName;

		[SimplScalar]
		private MetadataString articleType;

		[SimplCollection("rich_document")]
		[MmName("external_links")]
		private List<RichDocument> externalLinks;

		[SimplCollection("rich_document")]
		[MmName("external_link")]
		private List<RichDocument> externalLink;

		[SimplCollection("fondation_article")]
		[MmName("related_page")]
		private List<FondationArticle> relatedPage;

		[SimplCollection("fondation_article")]
		[MmName("related_pages")]
		private List<FondationArticle> relatedPages;

		[SimplCollection("fondation_tag")]
		[MmName("tags")]
		private List<FondationTag> tags;

		[SimplCollection("fondation_article")]
		[MmName("index")]
		private List<FondationArticle> index;

		[SimplCollection("rich_document")]
		[MmName("footnotes")]
		private List<RichDocument> footnotes;

		public FondationArticle()
		{ }

		public FondationArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString CollectionName
		{
			get{return collectionName;}
			set
			{
				if (this.collectionName != value)
				{
					this.collectionName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ArticleType
		{
			get{return articleType;}
			set
			{
				if (this.articleType != value)
				{
					this.articleType = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> ExternalLinks
		{
			get{return externalLinks;}
			set
			{
				if (this.externalLinks != value)
				{
					this.externalLinks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> ExternalLink
		{
			get{return externalLink;}
			set
			{
				if (this.externalLink != value)
				{
					this.externalLink = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FondationArticle> RelatedPage
		{
			get{return relatedPage;}
			set
			{
				if (this.relatedPage != value)
				{
					this.relatedPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FondationArticle> RelatedPages
		{
			get{return relatedPages;}
			set
			{
				if (this.relatedPages != value)
				{
					this.relatedPages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FondationTag> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FondationArticle> Index
		{
			get{return index;}
			set
			{
				if (this.index != value)
				{
					this.index = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> Footnotes
		{
			get{return footnotes;}
			set
			{
				if (this.footnotes != value)
				{
					this.footnotes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
