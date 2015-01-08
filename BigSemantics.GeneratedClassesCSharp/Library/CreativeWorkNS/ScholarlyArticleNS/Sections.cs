//
// Sections.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


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
	public class Sections : RichDocument
	{
		[SimplCollection("paragraph")]
		[MmName("paragraphs")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> paragraphs;

		public Sections()
		{ }

		public Sections(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> Paragraphs
		{
			get{return paragraphs;}
			set
			{
				if (this.paragraphs != value)
				{
					this.paragraphs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
