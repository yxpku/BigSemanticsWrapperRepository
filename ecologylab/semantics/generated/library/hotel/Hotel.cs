//
// Hotel.cs
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
using ecologylab.semantics.generated.library.gps;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.hotel 
{
	[SimplInherit]
	public class Hotel : Document
	{
		[SimplComposite]
		[MmName("place")]
		private ContactPoint place;

		[SimplScalar]
		private MetadataString price;

		[SimplScalar]
		private MetadataString spaceSize;

		[SimplScalar]
		private MetadataString checkIn;

		[SimplScalar]
		private MetadataString checkOut;

		[SimplScalar]
		private MetadataString temp;

		public Hotel()
		{ }

		public Hotel(MetaMetadataCompositeField mmd) : base(mmd) { }


		public ContactPoint Place
		{
			get{return place;}
			set
			{
				if (this.place != value)
				{
					this.place = value;
					this.RaisePropertyChanged( () => this.Place );
				}
			}
		}

		public MetadataString Price
		{
			get{return price;}
			set
			{
				if (this.price != value)
				{
					this.price = value;
					this.RaisePropertyChanged( () => this.Price );
				}
			}
		}

		public MetadataString SpaceSize
		{
			get{return spaceSize;}
			set
			{
				if (this.spaceSize != value)
				{
					this.spaceSize = value;
					this.RaisePropertyChanged( () => this.SpaceSize );
				}
			}
		}

		public MetadataString CheckIn
		{
			get{return checkIn;}
			set
			{
				if (this.checkIn != value)
				{
					this.checkIn = value;
					this.RaisePropertyChanged( () => this.CheckIn );
				}
			}
		}

		public MetadataString CheckOut
		{
			get{return checkOut;}
			set
			{
				if (this.checkOut != value)
				{
					this.checkOut = value;
					this.RaisePropertyChanged( () => this.CheckOut );
				}
			}
		}

		public MetadataString Temp
		{
			get{return temp;}
			set
			{
				if (this.temp != value)
				{
					this.temp = value;
					this.RaisePropertyChanged( () => this.Temp );
				}
			}
		}
	}
}
