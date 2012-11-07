//
// IcdlImageResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.IcdlNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.IcdlNS 
{
	/// <summary>
	/// Thumbnail Image
	/// </summary>
	[SimplInherit]
	[SimplTag("response")]
	public class IcdlImageResult : Document
	{
		[SimplCollection("book")]
		[SimplNoWrap]
		[MmName("books")]
		private List<IcdlBook> books;

		public IcdlImageResult()
		{ }

		public IcdlImageResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IcdlBook> Books
		{
			get{return books;}
			set
			{
				if (this.books != value)
				{
					this.books = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}