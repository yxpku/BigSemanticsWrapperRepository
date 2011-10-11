//
// TempFieldValueHolder.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/11/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.artwork 
{
	[SimplInherit]
	public class TempFieldValueHolder : Metadata
	{
		[SimplScalar]
		private MetadataString tempDimensions;

		[SimplScalar]
		private MetadataString tempYear;

		[SimplScalar]
		private MetadataString tempMedium;

		public TempFieldValueHolder()
		{ }

		public MetadataString TempDimensions
		{
			get{return tempDimensions;}
			set{tempDimensions = value;}
		}

		public MetadataString TempYear
		{
			get{return tempYear;}
			set{tempYear = value;}
		}

		public MetadataString TempMedium
		{
			get{return tempMedium;}
			set{tempMedium = value;}
		}
	}
}
