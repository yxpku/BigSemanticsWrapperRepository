//
// MetArtwork.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ArtworkNS 
{
	[SimplInherit]
	public class MetArtwork : Artwork
	{
		/// <summary>
		/// Location of the work.
		/// </summary>
		[SimplScalar]
		private MetadataString geography;

		/// <summary>
		/// Bit of info about author
		/// </summary>
		[SimplScalar]
		private MetadataString authorInfo;

		[SimplCollection("met_artwork")]
		[SimplOtherTags(new String[] {"creative_works"})]
		[MmName("works_of_interest")]
		private List<MetArtwork> worksOfInterest;

		[SimplCollection("met_filter")]
		[MmName("tags")]
		private List<MetFilter> tags;

		public MetArtwork()
		{ }

		public MetArtwork(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Geography
		{
			get{return geography;}
			set
			{
				if (this.geography != value)
				{
					this.geography = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AuthorInfo
		{
			get{return authorInfo;}
			set
			{
				if (this.authorInfo != value)
				{
					this.authorInfo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MetArtwork> WorksOfInterest
		{
			get{return worksOfInterest;}
			set
			{
				if (this.worksOfInterest != value)
				{
					this.worksOfInterest = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MetFilter> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
