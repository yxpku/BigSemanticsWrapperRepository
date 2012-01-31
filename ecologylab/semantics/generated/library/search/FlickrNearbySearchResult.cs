//
// FlickrNearbySearchResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
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
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.search 
{
	[SimplInherit]
	public class FlickrNearbySearchResult : SearchResult
	{
		[SimplScalar]
		private MetadataParsedURL linkOther;

		public FlickrNearbySearchResult()
		{ }

		public FlickrNearbySearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL LinkOther
		{
			get{return linkOther;}
			set
			{
				if (this.linkOther != value)
				{
					this.linkOther = value;
					this.RaisePropertyChanged( () => this.LinkOther );
				}
			}
		}
	}
}
