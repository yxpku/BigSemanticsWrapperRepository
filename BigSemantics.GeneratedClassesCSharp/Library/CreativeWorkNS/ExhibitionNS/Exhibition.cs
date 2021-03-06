//
// Exhibition.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
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
		[SimplScalar]
		private MetadataString subtitle;

		/// <summary>
		/// link to work's website
		/// </summary>
		[SimplComposite]
		[MmName("website")]
		private RichDocument website;

		/// <summary>
		/// exhibition video
		/// </summary>
		[SimplComposite]
		[MmName("video")]
		private SocialVideo video;

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


		public MetadataString Subtitle
		{
			get{return subtitle;}
			set
			{
				if (this.subtitle != value)
				{
					this.subtitle = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Website
		{
			get{return website;}
			set
			{
				if (this.website != value)
				{
					this.website = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public SocialVideo Video
		{
			get{return video;}
			set
			{
				if (this.video != value)
				{
					this.video = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

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
