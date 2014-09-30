//
// NsfInvestigator.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS 
{
	[SimplInherit]
	public class NsfInvestigator : Investigator<NsfAward>
	{
		[SimplScalar]
		private MetadataString firstName;

		[SimplScalar]
		private MetadataString lastName;

		[SimplScalar]
		private MetadataString givenName;

		[SimplScalar]
		private MetadataString familyName;

		public NsfInvestigator()
		{ }

		public NsfInvestigator(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString FirstName
		{
			get{return firstName;}
			set
			{
				if (this.firstName != value)
				{
					this.firstName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString LastName
		{
			get{return lastName;}
			set
			{
				if (this.lastName != value)
				{
					this.lastName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString GivenName
		{
			get{return givenName;}
			set
			{
				if (this.givenName != value)
				{
					this.givenName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString FamilyName
		{
			get{return familyName;}
			set
			{
				if (this.familyName != value)
				{
					this.familyName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}