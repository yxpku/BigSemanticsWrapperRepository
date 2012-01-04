//
// GaurdianComic.cs
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
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.gaurdian_comic 
{
	/// <summary>
	/// This MMD was initially generated by the browser authoring tool
	/// </summary>
	[SimplInherit]
	public class GaurdianComic : Document
	{
		/// <summary>
		/// Explanation of the comic
		/// </summary>
		[SimplScalar]
		private MetadataString comicSubtext;

		/// <summary>
		/// Contributor of the comic
		/// </summary>
		[SimplScalar]
		private MetadataString artist;

		/// <summary>
		/// MyComment
		/// </summary>
		[SimplScalar]
		private MetadataString datePublished;

		public GaurdianComic()
		{ }

		public GaurdianComic(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString ComicSubtext
		{
			get{return comicSubtext;}
			set
			{
				if (this.comicSubtext != value)
				{
					this.comicSubtext = value;
					this.RaisePropertyChanged( () => this.ComicSubtext );
				}
			}
		}

		public MetadataString Artist
		{
			get{return artist;}
			set
			{
				if (this.artist != value)
				{
					this.artist = value;
					this.RaisePropertyChanged( () => this.Artist );
				}
			}
		}

		public MetadataString DatePublished
		{
			get{return datePublished;}
			set
			{
				if (this.datePublished != value)
				{
					this.datePublished = value;
					this.RaisePropertyChanged( () => this.DatePublished );
				}
			}
		}
	}
}
