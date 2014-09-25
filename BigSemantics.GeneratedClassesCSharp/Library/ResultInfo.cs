//
// ResultInfo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class ResultInfo : Metadata
	{
		[SimplScalar]
		private MetadataInteger offset;

		[SimplScalar]
		private MetadataInteger totalRecords;

		[SimplScalar]
		private MetadataInteger returned;

		[SimplScalar]
		private MetadataInteger totalResults;

		public ResultInfo()
		{ }

		public ResultInfo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataInteger Offset
		{
			get{return offset;}
			set
			{
				if (this.offset != value)
				{
					this.offset = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger TotalRecords
		{
			get{return totalRecords;}
			set
			{
				if (this.totalRecords != value)
				{
					this.totalRecords = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Returned
		{
			get{return returned;}
			set
			{
				if (this.returned != value)
				{
					this.returned = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger TotalResults
		{
			get{return totalResults;}
			set
			{
				if (this.totalResults != value)
				{
					this.totalResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
