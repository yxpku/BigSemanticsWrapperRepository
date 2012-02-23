//
// Patent.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
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

namespace ecologylab.semantics.generated.library.patents 
{
	/// <summary>
	/// Patents Class
	/// </summary>
	[SimplInherit]
	public class Patent : CreativeWork
	{
		[SimplCollection("claim")]
		[MmName("claims")]
		private List<ecologylab.semantics.metadata.scalar.MetadataString> claims;

		[SimplScalar]
		private MetadataString inventor;

		[SimplScalar]
		private MetadataDate filingDate;

		[SimplCollection("document")]
		[MmName("classifications")]
		private List<Document> classifications;

		public Patent()
		{ }

		public Patent(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<ecologylab.semantics.metadata.scalar.MetadataString> Claims
		{
			get{return claims;}
			set
			{
				if (this.claims != value)
				{
					this.claims = value;
					this.RaisePropertyChanged( () => this.Claims );
				}
			}
		}

		public MetadataString Inventor
		{
			get{return inventor;}
			set
			{
				if (this.inventor != value)
				{
					this.inventor = value;
					this.RaisePropertyChanged( () => this.Inventor );
				}
			}
		}

		public MetadataDate FilingDate
		{
			get{return filingDate;}
			set
			{
				if (this.filingDate != value)
				{
					this.filingDate = value;
					this.RaisePropertyChanged( () => this.FilingDate );
				}
			}
		}

		public List<Document> Classifications
		{
			get{return classifications;}
			set
			{
				if (this.classifications != value)
				{
					this.classifications = value;
					this.RaisePropertyChanged( () => this.Classifications );
				}
			}
		}
	}
}
