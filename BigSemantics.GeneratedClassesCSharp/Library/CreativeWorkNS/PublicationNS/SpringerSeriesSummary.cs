//
// SpringerSeriesSummary.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	/// <summary>
	/// An article or any other text heavy component in Springer Link.
	/// </summary>
	[SimplInherit]
	public class SpringerSeriesSummary : SpringerBook
	{
		public SpringerSeriesSummary()
		{ }

		public SpringerSeriesSummary(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}