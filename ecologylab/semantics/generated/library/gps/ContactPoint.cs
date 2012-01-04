//
// ContactPoint.cs
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
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.gps 
{
	/// <summary>
	/// Resembles a schema.org ContactPoint but is a mixin, not extending document.
	/// </summary>
	[SimplInherit]
	public class ContactPoint : Metadata
	{
		[SimplScalar]
		private MetadataString telephone;

		[SimplScalar]
		private MetadataString faxNumber;

		[SimplScalar]
		private MetadataString email;

		[SimplScalar]
		private MetadataString streetAddress;

		public ContactPoint()
		{ }

		public ContactPoint(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Telephone
		{
			get{return telephone;}
			set
			{
				if (this.telephone != value)
				{
					this.telephone = value;
					this.RaisePropertyChanged( () => this.Telephone );
				}
			}
		}

		public MetadataString FaxNumber
		{
			get{return faxNumber;}
			set
			{
				if (this.faxNumber != value)
				{
					this.faxNumber = value;
					this.RaisePropertyChanged( () => this.FaxNumber );
				}
			}
		}

		public MetadataString Email
		{
			get{return email;}
			set
			{
				if (this.email != value)
				{
					this.email = value;
					this.RaisePropertyChanged( () => this.Email );
				}
			}
		}

		public MetadataString StreetAddress
		{
			get{return streetAddress;}
			set
			{
				if (this.streetAddress != value)
				{
					this.streetAddress = value;
					this.RaisePropertyChanged( () => this.StreetAddress );
				}
			}
		}
	}
}
