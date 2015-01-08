//
// Publication.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	/// <summary>
	/// A publication.
	/// </summary>
	[SimplInherit]
	public class Publication : BasicPublication
	{
		[SimplScalar]
		private MetadataString pages;

		[SimplCollection("subject")]
		[MmName("subjects")]
		private List<Subject> subjects;

		[SimplScalar]
		private MetadataString aboutTheAuthors;

		[SimplCollection("term_type")]
		[MmName("common_terms")]
		private List<TermType> commonTerms;

		public Publication()
		{ }

		public Publication(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Pages
		{
			get{return pages;}
			set
			{
				if (this.pages != value)
				{
					this.pages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Subject> Subjects
		{
			get{return subjects;}
			set
			{
				if (this.subjects != value)
				{
					this.subjects = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AboutTheAuthors
		{
			get{return aboutTheAuthors;}
			set
			{
				if (this.aboutTheAuthors != value)
				{
					this.aboutTheAuthors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<TermType> CommonTerms
		{
			get{return commonTerms;}
			set
			{
				if (this.commonTerms != value)
				{
					this.commonTerms = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
