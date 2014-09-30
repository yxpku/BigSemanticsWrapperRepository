//
// YoutubeVideoList.cs
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
	[SimplInherit]
	public class YoutubeVideoList : RichDocument
	{
		[SimplCollection("youtube_video")]
		[MmName("videos")]
		private List<YoutubeVideo> videos;

		public YoutubeVideoList()
		{ }

		public YoutubeVideoList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<YoutubeVideo> Videos
		{
			get{return videos;}
			set
			{
				if (this.videos != value)
				{
					this.videos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}