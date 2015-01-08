//
// ResearchGateInstitutionContactInfo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
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
	public class ResearchGateInstitutionContactInfo : ContactPoint
	{
		[SimplScalar]
		private MetadataString websiteAddress;

		public ResearchGateInstitutionContactInfo()
		{ }

		public ResearchGateInstitutionContactInfo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString WebsiteAddress
		{
			get{return websiteAddress;}
			set
			{
				if (this.websiteAddress != value)
				{
					this.websiteAddress = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
