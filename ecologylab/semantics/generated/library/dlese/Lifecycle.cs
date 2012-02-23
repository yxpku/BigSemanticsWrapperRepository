//
// Lifecycle.cs
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
using ecologylab.semantics.generated.library.dlese;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.dlese 
{
	[SimplInherit]
	public class Lifecycle : Metadata
	{
		[SimplCollection("contributor")]
		[MmName("contributors")]
		private List<Contributor> contributors;

		public Lifecycle()
		{ }

		public Lifecycle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Contributor> Contributors
		{
			get{return contributors;}
			set
			{
				if (this.contributors != value)
				{
					this.contributors = value;
					this.RaisePropertyChanged( () => this.Contributors );
				}
			}
		}
	}
}
