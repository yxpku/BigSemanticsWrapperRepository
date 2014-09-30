//
// Movie.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	/// <summary>
	/// The movie class.
	/// </summary>
	[SimplInherit]
	public class Movie : CreativeWork
	{
		[SimplScalar]
		private MetadataString storyline;

		[SimplScalar]
		private MetadataString tagline;

		/// <summary>
		/// Movie Poster or other image
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL pic;

		[SimplCollection("image")]
		[MmName("photos")]
		private List<Image> photos;

		/// <summary>
		/// MPAA rating
		/// </summary>
		[SimplScalar]
		private MetadataString mpaaRating;

		/// <summary>
		/// How long the movie runs
		/// </summary>
		[SimplScalar]
		private MetadataString runtime;

		/// <summary>
		/// When the movie was released in theaters
		/// </summary>
		[SimplScalar]
		private MetadataString theaterRelease;

		/// <summary>
		/// Who directed the movie.
		/// </summary>
		[SimplCollection("movie_person")]
		[MmName("directors")]
		private List<MoviePerson> directors;

		/// <summary>
		/// Who wrote the movie.
		/// </summary>
		[SimplCollection("movie_person")]
		[MmName("writers")]
		private List<MoviePerson> writers;

		[SimplCollection("movie_person")]
		[MmName("cast")]
		private List<MoviePerson> cast;

		/// <summary>
		/// Movie genres
		/// </summary>
		[SimplCollection("rich_document")]
		[MmName("genres")]
		private List<RichDocument> genres;

		public Movie()
		{ }

		public Movie(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Storyline
		{
			get{return storyline;}
			set
			{
				if (this.storyline != value)
				{
					this.storyline = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Tagline
		{
			get{return tagline;}
			set
			{
				if (this.tagline != value)
				{
					this.tagline = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Pic
		{
			get{return pic;}
			set
			{
				if (this.pic != value)
				{
					this.pic = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Image> Photos
		{
			get{return photos;}
			set
			{
				if (this.photos != value)
				{
					this.photos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString MpaaRating
		{
			get{return mpaaRating;}
			set
			{
				if (this.mpaaRating != value)
				{
					this.mpaaRating = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Runtime
		{
			get{return runtime;}
			set
			{
				if (this.runtime != value)
				{
					this.runtime = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString TheaterRelease
		{
			get{return theaterRelease;}
			set
			{
				if (this.theaterRelease != value)
				{
					this.theaterRelease = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MoviePerson> Directors
		{
			get{return directors;}
			set
			{
				if (this.directors != value)
				{
					this.directors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MoviePerson> Writers
		{
			get{return writers;}
			set
			{
				if (this.writers != value)
				{
					this.writers = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MoviePerson> Cast
		{
			get{return cast;}
			set
			{
				if (this.cast != value)
				{
					this.cast = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> Genres
		{
			get{return genres;}
			set
			{
				if (this.genres != value)
				{
					this.genres = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}