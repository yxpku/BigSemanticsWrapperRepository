//
// Rss.cs
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
	/// <summary>
	/// A news feed.
	/// </summary>
	[SimplInherit]
	public class Rss : Document
	{
		[SimplComposite]
		[MmName("channel")]
		private Channel channel;

		public Rss()
		{ }

		public Rss(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Channel Channel
		{
			get{return channel;}
			set
			{
				if (this.channel != value)
				{
					this.channel = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
