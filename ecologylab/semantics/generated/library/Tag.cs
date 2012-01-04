//
// Tag.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 01/04/12.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library 
{
	[SimplInherit]
	public class Tag : Metadata
	{
		[SimplScalar]
		private MetadataString tagName;

		[SimplScalar]
		private MetadataParsedURL link;

		public Tag()
		{ }

		public Tag(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString TagName
		{
			get{return tagName;}
			set
			{
				if (this.tagName != value)
				{
					this.tagName = value;
					this.RaisePropertyChanged( () => this.TagName );
				}
			}
		}

		public MetadataParsedURL Link
		{
			get{return link;}
			set
			{
				if (this.link != value)
				{
					this.link = value;
					this.RaisePropertyChanged( () => this.Link );
				}
			}
		}
	}
}
