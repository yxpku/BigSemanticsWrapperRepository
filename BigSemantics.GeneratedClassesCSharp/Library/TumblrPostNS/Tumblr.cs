//
// Tumblr.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.BlogPostNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.TumblrPostNS 
{
	[SimplInherit]
	public class Tumblr : Post
	{
		[SimplScalar]
		private MetadataString post;

		public Tumblr()
		{ }

		public Tumblr(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Post
		{
			get{return post;}
			set
			{
				if (this.post != value)
				{
					this.post = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
