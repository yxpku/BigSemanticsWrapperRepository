//
// Exhibition.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ExhibitionNS 
{
	/// <summary>
	/// Artwork exhibition class
	/// </summary>
	[SimplInherit]
	public class Exhibition : CreativeWork
	{
		/// <summary>
		/// Set of contributors.
		/// </summary>
		[SimplCollection("artist")]
		[MmName("contributors")]
		private List<Artist> contributors;

		[SimplCollection("artwork")]
		[MmName("creative_works")]
		private List<Artwork> creativeWorks;

		public Exhibition()
		{ }

		public Exhibition(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Artist> Contributors
		{
			get{return contributors;}
			set
			{
				if (this.contributors != value)
				{
					this.contributors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Artwork> CreativeWorks
		{
			get{return creativeWorks;}
			set
			{
				if (this.creativeWorks != value)
				{
					this.creativeWorks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
