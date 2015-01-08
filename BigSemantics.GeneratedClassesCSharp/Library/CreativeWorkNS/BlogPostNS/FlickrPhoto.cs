//
// FlickrPhoto.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS 
{
	/// <summary>
	/// A Flickr image post page
	/// </summary>
	[SimplInherit]
	public class FlickrPhoto : Post
	{
		[SimplScalar]
		private MetadataParsedURL imageLocation;

		[SimplScalar]
		private MetadataString views;

		[SimplComposite]
		[MmName("place")]
		private RichDocument place;

		[SimplComposite]
		[MmName("geo_location")]
		private GisLocation geoLocation;

		public FlickrPhoto()
		{ }

		public FlickrPhoto(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL ImageLocation
		{
			get{return imageLocation;}
			set
			{
				if (this.imageLocation != value)
				{
					this.imageLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Views
		{
			get{return views;}
			set
			{
				if (this.views != value)
				{
					this.views = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Place
		{
			get{return place;}
			set
			{
				if (this.place != value)
				{
					this.place = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GisLocation GeoLocation
		{
			get{return geoLocation;}
			set
			{
				if (this.geoLocation != value)
				{
					this.geoLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
