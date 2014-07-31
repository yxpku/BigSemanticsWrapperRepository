//
// AskNatureGroup.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.AskNatureNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.AskNatureNS 
{
	[SimplInherit]
	public class AskNatureGroup : CompoundDocument
	{
		[SimplCollection("ask_nature_subgroup")]
		[MmName("subgroups")]
		private List<AskNatureSubgroup> subgroups;

		public AskNatureGroup()
		{ }

		public AskNatureGroup(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<AskNatureSubgroup> Subgroups
		{
			get{return subgroups;}
			set
			{
				if (this.subgroups != value)
				{
					this.subgroups = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
