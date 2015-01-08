//
// NsfDivisionStaffList.cs
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
	[SimplInherit]
	public class NsfDivisionStaffList : RichDocument
	{
		[SimplCollection("nsf_program_staff_list")]
		[MmName("programs")]
		private List<NsfProgramStaffList> programs;

		public NsfDivisionStaffList()
		{ }

		public NsfDivisionStaffList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<NsfProgramStaffList> Programs
		{
			get{return programs;}
			set
			{
				if (this.programs != value)
				{
					this.programs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
