//
// TribunalVoices.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	/// <summary>
	/// Video Interviews with personnel from Rwanda Tribunal
	/// </summary>
	[SimplInherit]
	public class TribunalVoices : RichDocument
	{
		[SimplCollection("category_interviews")]
		[MmName("categorized_interviews")]
		private List<CategoryInterviews> categorizedInterviews;

		public TribunalVoices()
		{ }

		public TribunalVoices(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<CategoryInterviews> CategorizedInterviews
		{
			get{return categorizedInterviews;}
			set
			{
				if (this.categorizedInterviews != value)
				{
					this.categorizedInterviews = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
