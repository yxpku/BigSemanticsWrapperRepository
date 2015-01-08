//
// Dlms.cs
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

namespace Ecologylab.BigSemantics.Generated.Library.CommentNS 
{
	/// <summary>
	/// The DLMS Class
	/// </summary>
	[SimplInherit]
	public class Dlms : RichDocument
	{
		[SimplScalar]
		private MetadataString subject;

		public Dlms()
		{ }

		public Dlms(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Subject
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
	}
}
