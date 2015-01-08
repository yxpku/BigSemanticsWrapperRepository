//
// Tvtrope.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
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
	public class Tvtrope : RichDocument
	{
		[SimplScalar]
		private MetadataString quote;

		[SimplScalar]
		private MetadataString quoteSource;

		[SimplCollection("tvtrope")]
		[MmName("sub_tropes")]
		private List<Tvtrope> subTropes;

		[SimplCollection("tvtrope")]
		[MmName("direct_descendants")]
		private List<Tvtrope> directDescendants;

		[SimplCollection("tvtrope_folder")]
		[MmName("examples_by_category")]
		private List<TvtropeFolder> examplesByCategory;

		[SimplCollection("tvtrope")]
		[MmName("all_linked_tropes")]
		private List<Tvtrope> allLinkedTropes;

		public Tvtrope()
		{ }

		public Tvtrope(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Quote
		{
			get{return quote;}
			set
			{
				if (this.quote != value)
				{
					this.quote = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString QuoteSource
		{
			get{return quoteSource;}
			set
			{
				if (this.quoteSource != value)
				{
					this.quoteSource = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Tvtrope> SubTropes
		{
			get{return subTropes;}
			set
			{
				if (this.subTropes != value)
				{
					this.subTropes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Tvtrope> DirectDescendants
		{
			get{return directDescendants;}
			set
			{
				if (this.directDescendants != value)
				{
					this.directDescendants = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<TvtropeFolder> ExamplesByCategory
		{
			get{return examplesByCategory;}
			set
			{
				if (this.examplesByCategory != value)
				{
					this.examplesByCategory = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Tvtrope> AllLinkedTropes
		{
			get{return allLinkedTropes;}
			set
			{
				if (this.allLinkedTropes != value)
				{
					this.allLinkedTropes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
