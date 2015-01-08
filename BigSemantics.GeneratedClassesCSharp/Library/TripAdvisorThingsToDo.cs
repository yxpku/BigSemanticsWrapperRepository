//
// TripAdvisorThingsToDo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ServiceNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	/// <summary>
	/// Trip advisor travel suggestions
	/// </summary>
	[SimplInherit]
	public class TripAdvisorThingsToDo : Attraction
	{
		[SimplCollection("hotel")]
		[MmName("popular_hotels")]
		private List<Hotel> popularHotels;

		public TripAdvisorThingsToDo()
		{ }

		public TripAdvisorThingsToDo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Hotel> PopularHotels
		{
			get{return popularHotels;}
			set
			{
				if (this.popularHotels != value)
				{
					this.popularHotels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
