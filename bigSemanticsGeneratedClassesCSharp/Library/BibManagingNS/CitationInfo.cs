//
// CitationInfo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
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

namespace Ecologylab.Semantics.Generated.Library.BibManagingNS 
{
	/// <summary>
	/// Citation numbers.
	/// </summary>
	[SimplInherit]
	public class CitationInfo : Metadata
	{
		[SimplScalar]
		private MetadataInteger totalCitation;

		[SimplScalar]
		private MetadataInteger selfCitation;

		public CitationInfo()
		{ }

		public CitationInfo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataInteger TotalCitation
		{
			get{return totalCitation;}
			set
			{
				if (this.totalCitation != value)
				{
					this.totalCitation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger SelfCitation
		{
			get{return selfCitation;}
			set
			{
				if (this.selfCitation != value)
				{
					this.selfCitation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}