//
// Body.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.opml;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.opml 
{
	[SimplInherit]
	public class Body : Metadata
	{
		[SimplCollection("outline")]
		[SimplNoWrap]
		[MmName("outline")]
		private List<Outline> outline;

		public Body()
		{ }

		public Body(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Outline> Outline
		{
			get{return outline;}
			set
			{
				if (this.outline != value)
				{
					this.outline = value;
					this.RaisePropertyChanged( () => this.Outline );
				}
			}
		}
	}
}
