//
// GooglePatent.cs
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
using ecologylab.semantics.generated.library.patents;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.patents 
{
	/// <summary>
	/// Google Patents Class
	/// </summary>
	[SimplInherit]
	public class GooglePatent : Patent
	{
		[SimplScalar]
		private MetadataParsedURL picLink;

		[SimplCollection("search_result")]
		[MmName("referenced_bys")]
		private List<SearchResult> referencedBys;

		[SimplCollection("search_result")]
		[MmName("citations")]
		private List<SearchResult> citations;

		[SimplCollection("search_result")]
		[MmName("pic_links")]
		private List<SearchResult> picLinks;

		public GooglePatent()
		{ }

		public GooglePatent(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL PicLink
		{
			get{return picLink;}
			set
			{
				if (this.picLink != value)
				{
					this.picLink = value;
					this.RaisePropertyChanged( () => this.PicLink );
				}
			}
		}

		public List<SearchResult> ReferencedBys
		{
			get{return referencedBys;}
			set
			{
				if (this.referencedBys != value)
				{
					this.referencedBys = value;
					this.RaisePropertyChanged( () => this.ReferencedBys );
				}
			}
		}

		public List<SearchResult> Citations
		{
			get{return citations;}
			set
			{
				if (this.citations != value)
				{
					this.citations = value;
					this.RaisePropertyChanged( () => this.Citations );
				}
			}
		}

		public List<SearchResult> PicLinks
		{
			get{return picLinks;}
			set
			{
				if (this.picLinks != value)
				{
					this.picLinks = value;
					this.RaisePropertyChanged( () => this.PicLinks );
				}
			}
		}
	}
}
