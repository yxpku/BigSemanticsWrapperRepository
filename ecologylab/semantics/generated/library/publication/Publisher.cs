//
// Publisher.cs
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
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.publication 
{
	/// <summary>
	/// A publishing company.
	/// </summary>
	[SimplInherit]
	public class Publisher : Document
	{
		[SimplScalar]
		private MetadataString city;

		public Publisher()
		{ }

		public Publisher(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString City
		{
			get{return city;}
			set
			{
				if (this.city != value)
				{
					this.city = value;
					this.RaisePropertyChanged( () => this.City );
				}
			}
		}
	}
}
