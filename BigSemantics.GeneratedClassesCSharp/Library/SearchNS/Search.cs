//
// Search.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// A search.
	/// </summary>
	[SimplInherit]
	public class Search<SR> : CompoundDocument where SR : CompoundDocument
	{
		[SimplCollection]
		[SimplNoWrap]
		[SimplScope("repository_documents")]
		[MmName("search_results")]
		private List<CompoundDocument> searchResults;

		[SimplCollection("search")]
		[MmName("related_searches")]
		private List<Search<CompoundDocument>> relatedSearches;

		[SimplComposite]
		[MmName("next_page")]
		private Search<CompoundDocument> nextPage;

		public Search()
		{ }

		public Search(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<CompoundDocument> SearchResults
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

		public List<Search<CompoundDocument>> RelatedSearches
		{
			get{return relatedSearches;}
			set
			{
				if (this.relatedSearches != value)
				{
					this.relatedSearches = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Search<CompoundDocument> NextPage
		{
			get{return nextPage;}
			set
			{
				if (this.nextPage != value)
				{
					this.nextPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
