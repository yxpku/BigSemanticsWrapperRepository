//
// TvtropeExample.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class TvtropeExample : RichDocument
	{
		[SimplComposite]
		[MmName("trope")]
		private Tvtrope trope;

		[SimplCollection("tvtrope")]
		[MmName("example_tropes")]
		private List<Tvtrope> exampleTropes;

		[SimplCollection("rich_document")]
		[MmName("comments")]
		private List<RichDocument> comments;

		public TvtropeExample()
		{ }

		public TvtropeExample(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Tvtrope Trope
		{
			get{return trope;}
			set
			{
				if (this.trope != value)
				{
					this.trope = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Tvtrope> ExampleTropes
		{
			get{return exampleTropes;}
			set
			{
				if (this.exampleTropes != value)
				{
					this.exampleTropes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> Comments
		{
			get{return comments;}
			set
			{
				if (this.comments != value)
				{
					this.comments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
