//
// Contributor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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
	public class Contributor : Metadata
	{
		[SimplScalar]
		private MetadataInteger date;

		[SimplScalar]
		private MetadataString role;

		[SimplComposite]
		[MmName("organization")]
		private Organization organization;

		public Contributor()
		{ }

		public Contributor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataInteger Date
		{
			get{return date;}
			set
			{
				if (this.date != value)
				{
					this.date = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Role
		{
			get{return role;}
			set
			{
				if (this.role != value)
				{
					this.role = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Organization Organization
		{
			get{return organization;}
			set
			{
				if (this.organization != value)
				{
					this.organization = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
