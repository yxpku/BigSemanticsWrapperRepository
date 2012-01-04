//
// IcdlBookPreview.cs
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
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.icdl 
{
	/// <summary>
	/// ICDL About This Book Page
	/// </summary>
	[SimplInherit]
	public class IcdlBookPreview : Metadata
	{
		[SimplComposite]
		[MmName("author")]
		private Author author;

		[SimplComposite]
		[MmName("illustrator")]
		private Author illustrator;

		[SimplScalar]
		private MetadataString summary;

		[SimplScalar]
		private MetadataString year;

		[SimplScalar]
		private MetadataString languages;

		[SimplScalar]
		private MetadataString publisher;

		[SimplScalar]
		private MetadataString isbn;

		[SimplScalar]
		private MetadataString awards;

		public IcdlBookPreview()
		{ }

		public IcdlBookPreview(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Author Author
		{
			get{return author;}
			set
			{
				if (this.author != value)
				{
					this.author = value;
					this.RaisePropertyChanged( () => this.Author );
				}
			}
		}

		public Author Illustrator
		{
			get{return illustrator;}
			set
			{
				if (this.illustrator != value)
				{
					this.illustrator = value;
					this.RaisePropertyChanged( () => this.Illustrator );
				}
			}
		}

		public MetadataString Summary
		{
			get{return summary;}
			set
			{
				if (this.summary != value)
				{
					this.summary = value;
					this.RaisePropertyChanged( () => this.Summary );
				}
			}
		}

		public MetadataString Year
		{
			get{return year;}
			set
			{
				if (this.year != value)
				{
					this.year = value;
					this.RaisePropertyChanged( () => this.Year );
				}
			}
		}

		public MetadataString Languages
		{
			get{return languages;}
			set
			{
				if (this.languages != value)
				{
					this.languages = value;
					this.RaisePropertyChanged( () => this.Languages );
				}
			}
		}

		public MetadataString Publisher
		{
			get{return publisher;}
			set
			{
				if (this.publisher != value)
				{
					this.publisher = value;
					this.RaisePropertyChanged( () => this.Publisher );
				}
			}
		}

		public MetadataString Isbn
		{
			get{return isbn;}
			set
			{
				if (this.isbn != value)
				{
					this.isbn = value;
					this.RaisePropertyChanged( () => this.Isbn );
				}
			}
		}

		public MetadataString Awards
		{
			get{return awards;}
			set
			{
				if (this.awards != value)
				{
					this.awards = value;
					this.RaisePropertyChanged( () => this.Awards );
				}
			}
		}
	}
}
