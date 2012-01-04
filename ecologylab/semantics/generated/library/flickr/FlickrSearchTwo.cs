//
// FlickrSearchTwo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 01/04/12.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.flickr;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.flickr 
{
	/// <summary>
	/// The flickr search class
	/// </summary>
	[SimplInherit]
	public class FlickrSearchTwo : CompoundDocument
	{
		[SimplCollection("flickr_image_detail")]
		[MmName("flickr_results")]
		private List<FlickrImageDetail> flickrResults;

		public FlickrSearchTwo()
		{ }

		public FlickrSearchTwo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<FlickrImageDetail> FlickrResults
		{
			get{return flickrResults;}
			set
			{
				if (this.flickrResults != value)
				{
					this.flickrResults = value;
					this.RaisePropertyChanged( () => this.FlickrResults );
				}
			}
		}
	}
}
