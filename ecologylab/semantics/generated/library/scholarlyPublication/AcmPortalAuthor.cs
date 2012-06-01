//
// AcmPortalAuthor.cs
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
using ecologylab.semantics.generated.library.creative_work;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.scholarlyPublication 
{
	[SimplInherit]
	public class AcmPortalAuthor : Author
	{
		[SimplComposite]
		[MmName("publication_detail")]
		private PublicationDetail publicationDetail;

		[SimplComposite]
		[MmName("collaborators")]
		private AcmPortalAuthorCollaborators collaborators;

		[SimplCollection("acm_portal_institution_profile")]
		[MmName("affiliations")]
		private List<AcmPortalInstitutionProfile> affiliations;

		public AcmPortalAuthor()
		{ }

		public AcmPortalAuthor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public PublicationDetail PublicationDetail
		{
			get{return publicationDetail;}
			set
			{
				if (this.publicationDetail != value)
				{
					this.publicationDetail = value;
					this.RaisePropertyChanged( () => this.PublicationDetail );
				}
			}
		}

		public AcmPortalAuthorCollaborators Collaborators
		{
			get{return collaborators;}
			set
			{
				if (this.collaborators != value)
				{
					this.collaborators = value;
					this.RaisePropertyChanged( () => this.Collaborators );
				}
			}
		}

		public List<AcmPortalInstitutionProfile> Affiliations
		{
			get{return affiliations;}
			set
			{
				if (this.affiliations != value)
				{
					this.affiliations = value;
					this.RaisePropertyChanged( () => this.Affiliations );
				}
			}
		}
	}
}