//
// GettyObject.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS 
{
	[SimplInherit]
	public class GettyObject : Artwork
	{
		[SimplCollection("getty_artist")]
		[MmName("artist")]
		private List<GettyArtist> artist;

		[SimplComposite]
		[MmName("work_info")]
		private GettyWorkInfo workInfo;

		public GettyObject()
		{ }

		public GettyObject(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<GettyArtist> Artist
		{
			get{return artist;}
			set
			{
				if (this.artist != value)
				{
					this.artist = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GettyWorkInfo WorkInfo
		{
			get{return workInfo;}
			set
			{
				if (this.workInfo != value)
				{
					this.workInfo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}