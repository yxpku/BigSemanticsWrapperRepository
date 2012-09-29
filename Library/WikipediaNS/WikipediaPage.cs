//
// WikipediaPage.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.WikipediaNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.WikipediaNS 
{
	/// <summary>
	/// An article on wikipedia
	/// </summary>
	[SimplInherit]
	public class WikipediaPage : WikipediaPageType
	{
		public WikipediaPage()
		{ }

		public WikipediaPage(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
