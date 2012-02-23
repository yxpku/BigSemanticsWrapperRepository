//
// CiteseerxRecord.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.bibManaging;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.bibManaging 
{
	/// <summary>
	/// CiteSeerX record for an article.
	/// </summary>
	[SimplInherit]
	public class CiteseerxRecord : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("citation_info")]
		private CitationInfo citationInfo;

		public CiteseerxRecord()
		{ }

		public CiteseerxRecord(MetaMetadataCompositeField mmd) : base(mmd) { }


		public CitationInfo CitationInfo
		{
			get{return citationInfo;}
			set
			{
				if (this.citationInfo != value)
				{
					this.citationInfo = value;
					this.RaisePropertyChanged( () => this.CitationInfo );
				}
			}
		}
	}
}
