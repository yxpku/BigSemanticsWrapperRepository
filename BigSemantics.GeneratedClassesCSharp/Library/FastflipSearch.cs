//
// FastflipSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
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
	/// <summary>
	/// Fast Flip Search
	/// </summary>
	[SimplInherit]
	public class FastflipSearch : RichDocument
	{
		[SimplCollection("thumbnail")]
		[MmName("thumbnails")]
		private List<Thumbnail> thumbnails;

		public FastflipSearch()
		{ }

		public FastflipSearch(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Thumbnail> Thumbnails
		{
			get{return thumbnails;}
			set
			{
				if (this.thumbnails != value)
				{
					this.thumbnails = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}