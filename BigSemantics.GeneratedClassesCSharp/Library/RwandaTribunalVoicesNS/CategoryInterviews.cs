//
// CategoryInterviews.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.RwandaPersonnelInterviewNS;
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

namespace Ecologylab.Semantics.Generated.Library.RwandaTribunalVoicesNS 
{
	/// <summary>
	/// categorized interviews
	/// </summary>
	[SimplInherit]
	public class CategoryInterviews : Metadata
	{
		/// <summary>
		/// category
		/// </summary>
		[SimplScalar]
		private MetadataString category;

		/// <summary>
		/// personnel interview
		/// </summary>
		[SimplCollection("personnel_interview")]
		[MmName("people")]
		private List<PersonnelInterview> people;

		public CategoryInterviews()
		{ }

		public CategoryInterviews(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Category
		{
			get{return category;}
			set
			{
				if (this.category != value)
				{
					this.category = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<PersonnelInterview> People
		{
			get{return people;}
			set
			{
				if (this.people != value)
				{
					this.people = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
