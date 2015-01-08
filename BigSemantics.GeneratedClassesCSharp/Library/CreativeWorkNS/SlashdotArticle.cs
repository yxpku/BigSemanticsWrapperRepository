//
// SlashdotArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	[SimplInherit]
	public class SlashdotArticle : Post
	{
		[SimplCollection("rich_document")]
		[MmName("anchors")]
		private List<RichDocument> anchors;

		[SimplCollection("slashdot_article")]
		[MmName("related_stories")]
		private List<SlashdotArticle> relatedStories;

		public SlashdotArticle()
		{ }

		public SlashdotArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<RichDocument> Anchors
		{
			get{return anchors;}
			set
			{
				if (this.anchors != value)
				{
					this.anchors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SlashdotArticle> RelatedStories
		{
			get{return relatedStories;}
			set
			{
				if (this.relatedStories != value)
				{
					this.relatedStories = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
