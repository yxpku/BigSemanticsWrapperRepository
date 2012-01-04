//
// IcdlBook.cs
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
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.icdl 
{
	[SimplInherit]
	public class IcdlBook : Document
	{
		[SimplScalar]
		private MetadataString id;

		[SimplScalar]
		private MetadataString languages;

		[SimplScalar]
		private MetadataParsedURL cover;

		[SimplScalar]
		private MetadataInteger height;

		[SimplScalar]
		private MetadataInteger width;

		[SimplScalar]
		private MetadataString booktitle;

		[SimplScalar]
		private MetadataParsedURL bookurl;

		public IcdlBook()
		{ }

		public IcdlBook(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Id
		{
			get{return id;}
			set
			{
				if (this.id != value)
				{
					this.id = value;
					this.RaisePropertyChanged( () => this.Id );
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

		public MetadataParsedURL Cover
		{
			get{return cover;}
			set
			{
				if (this.cover != value)
				{
					this.cover = value;
					this.RaisePropertyChanged( () => this.Cover );
				}
			}
		}

		public MetadataInteger Height
		{
			get{return height;}
			set
			{
				if (this.height != value)
				{
					this.height = value;
					this.RaisePropertyChanged( () => this.Height );
				}
			}
		}

		public MetadataInteger Width
		{
			get{return width;}
			set
			{
				if (this.width != value)
				{
					this.width = value;
					this.RaisePropertyChanged( () => this.Width );
				}
			}
		}

		public MetadataString Booktitle
		{
			get{return booktitle;}
			set
			{
				if (this.booktitle != value)
				{
					this.booktitle = value;
					this.RaisePropertyChanged( () => this.Booktitle );
				}
			}
		}

		public MetadataParsedURL Bookurl
		{
			get{return bookurl;}
			set
			{
				if (this.bookurl != value)
				{
					this.bookurl = value;
					this.RaisePropertyChanged( () => this.Bookurl );
				}
			}
		}
	}
}
