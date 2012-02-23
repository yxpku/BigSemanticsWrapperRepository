//
// SearchResult.cs
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

namespace ecologylab.semantics.generated.library.search 
{
	/// <summary>
	/// A result from a search.
	/// </summary>
	[SimplInherit]
	public class SearchResult : Document
	{
		/// <summary>
		/// The search engine used for this result.
		/// </summary>
		[SimplScalar]
		private MetadataString engine;

		public SearchResult()
		{ }

		public SearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Engine
		{
			get{return engine;}
			set
			{
				if (this.engine != value)
				{
					this.engine = value;
					this.RaisePropertyChanged( () => this.Engine );
				}
			}
		}
	}
}
