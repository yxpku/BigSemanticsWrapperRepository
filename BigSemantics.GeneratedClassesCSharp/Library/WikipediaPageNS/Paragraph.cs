//
// Paragraph.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.WikipediaPageNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.WikipediaPageNS 
{
	[SimplInherit]
	public class Paragraph : Metadata
	{
		[SimplScalar]
		private MetadataString text;

		[SimplCollection("wikipedia_page")]
		[MmName("anchors")]
		private List<WikipediaPage> anchors;

		public Paragraph()
		{ }

		public Paragraph(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Text
		{
			get{return text;}
			set
			{
				if (this.text != value)
				{
					this.text = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<WikipediaPage> Anchors
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
	}
}
