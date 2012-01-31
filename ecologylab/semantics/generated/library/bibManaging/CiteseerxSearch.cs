//
// CiteseerxSearch.cs
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
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.bibManaging 
{
	/// <summary>
	/// CiteSeerX search using keywords.
	/// </summary>
	[SimplInherit]
	public class CiteseerxSearch : Search
	{
		public CiteseerxSearch()
		{ }

		public CiteseerxSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
