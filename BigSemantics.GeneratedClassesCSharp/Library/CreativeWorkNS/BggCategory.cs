//
// BggCategory.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	/// <summary>
	/// boardgamegeek.com
	/// </summary>
	[SimplInherit]
	public class BggCategory : RichDocument
	{
		[SimplCollection("bgg_game")]
		[MmName("search_results")]
		private List<BggGame> searchResults;

		public BggCategory()
		{ }

		public BggCategory(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<BggGame> SearchResults
		{
			get{return searchResults;}
			set
			{
				if (this.searchResults != value)
				{
					this.searchResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
