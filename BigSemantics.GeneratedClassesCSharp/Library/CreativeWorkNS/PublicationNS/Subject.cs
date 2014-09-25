//
// Subject.cs
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
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	[SimplInherit]
	public class Subject : Metadata
	{
		[SimplScalar]
		[SimplCompositeAsScalar]
		private MetadataString subject;

		[SimplScalar]
		private MetadataParsedURL location;

		public Subject()
		{ }

		public Subject(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString SubjectProp
		{
			get{return subject;}
			set
			{
				if (this.subject != value)
				{
					this.subject = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Location
		{
			get{return location;}
			set
			{
				if (this.location != value)
				{
					this.location = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
