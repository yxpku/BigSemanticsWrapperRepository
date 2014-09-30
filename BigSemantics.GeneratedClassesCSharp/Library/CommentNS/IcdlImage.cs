//
// IcdlImage.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
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
	/// Image from The Interantional Children's digital library.
	/// </summary>
	[SimplInherit]
	public class IcdlImage : Image
	{
		/// <summary>
		/// The language of the library
		/// </summary>
		[SimplScalar]
		private MetadataString languages;

		public IcdlImage()
		{ }

		public IcdlImage(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Languages
		{
			get{return languages;}
			set
			{
				if (this.languages != value)
				{
					this.languages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}