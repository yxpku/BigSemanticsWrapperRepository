//
// WikipediaSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.Generated.Library.WikipediaPageNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// Wikipedia Web Search Class
	/// </summary>
	[SimplInherit]
	public class WikipediaSearch : Search<WikipediaPage>
	{
		public WikipediaSearch()
		{ }

		public WikipediaSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}