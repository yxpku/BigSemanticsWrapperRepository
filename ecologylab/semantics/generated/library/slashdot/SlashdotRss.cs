//
// SlashdotRss.cs
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
using ecologylab.semantics.generated.library.slashdot;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.slashdot 
{
	[SimplInherit]
	[SimplTag("rdf:RDF")]
	public class SlashdotRss : CompoundDocument
	{
		[SimplCollection("item")]
		[SimplNoWrap]
		[MmName("items")]
		private List<SlashdotItem> items;

		public SlashdotRss()
		{ }

		public SlashdotRss(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<SlashdotItem> Items
		{
			get{return items;}
			set
			{
				if (this.items != value)
				{
					this.items = value;
					this.RaisePropertyChanged( () => this.Items );
				}
			}
		}
	}
}
