//
// UserSearchAdditionalMetadata.cs
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
using ecologylab.semantics.generated.library.dlese;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.dlese 
{
	[SimplInherit]
	public class UserSearchAdditionalMetadata : AdditionalMetadata
	{
		[SimplComposite]
		[SimplTag("adn")]
		[MmName("search_additional_metadata_adn")]
		private SearchAdditionalMetadataAdn searchAdditionalMetadataAdn;

		public UserSearchAdditionalMetadata()
		{ }

		public UserSearchAdditionalMetadata(MetaMetadataCompositeField mmd) : base(mmd) { }


		public SearchAdditionalMetadataAdn SearchAdditionalMetadataAdn
		{
			get{return searchAdditionalMetadataAdn;}
			set
			{
				if (this.searchAdditionalMetadataAdn != value)
				{
					this.searchAdditionalMetadataAdn = value;
					this.RaisePropertyChanged( () => this.SearchAdditionalMetadataAdn );
				}
			}
		}
	}
}
