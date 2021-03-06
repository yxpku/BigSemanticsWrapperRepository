//
// SearchResults.cs
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
	public class SearchResults : Metadata
	{
		[SimplCollection("nsdl_document")]
		[MmName("results")]
		private List<NsdlDocument> results;

		public SearchResults()
		{ }

		public SearchResults(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<NsdlDocument> Results
		{
			get{return results;}
			set
			{
				if (this.results != value)
				{
					this.results = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
