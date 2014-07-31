//
// RecordMetaMetadata.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DleseNS 
{
	[SimplInherit]
	public class RecordMetaMetadata : Metadata
	{
		[SimplComposite]
		[MmName("date_info")]
		private DateInfo dateInfo;

		[SimplCollection("catalog")]
		[MmName("catalogs")]
		private List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> catalogs;

		public RecordMetaMetadata()
		{ }

		public RecordMetaMetadata(MetaMetadataCompositeField mmd) : base(mmd) { }


		public DateInfo DateInfo
		{
			get{return dateInfo;}
			set
			{
				if (this.dateInfo != value)
				{
					this.dateInfo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> Catalogs
		{
			get{return catalogs;}
			set
			{
				if (this.catalogs != value)
				{
					this.catalogs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
