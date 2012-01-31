//
// NsfAward.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.generated.library.nsf;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.nsf 
{
	/// <summary>
	/// NSF Award details.
	/// </summary>
	[SimplInherit]
	public class NsfAward : CompoundDocument
	{
		[SimplComposite]
		[MmName("nsf_org")]
		private Document nsfOrg;

		[SimplScalar]
		private MetadataDate initialAmendmentDate;

		[SimplScalar]
		private MetadataDate latestAmendmentDate;

		[SimplScalar]
		private MetadataString awardNumber;

		[SimplScalar]
		private MetadataString awardInstrument;

		[SimplComposite]
		[MmName("program_manager")]
		private Author programManager;

		[SimplScalar]
		private MetadataDate startDate;

		[SimplScalar]
		private MetadataDate expireDate;

		[SimplScalar]
		private MetadataInteger awardedAmountToDate;

		[SimplCollection("investigator")]
		[MmName("investigators")]
		private List<Investigator> investigators;

		[SimplScalar]
		private MetadataString sponsor;

		[SimplScalar]
		private MetadataString nsfPrograms;

		[SimplScalar]
		private MetadataString fieldApplications;

		[SimplScalar]
		private MetadataString programReferenceCodes;

		[SimplScalar]
		private MetadataString programElementCodes;

		[SimplScalar]
		private MetadataString abstractField;

		[SimplCollection("relevant_location")]
		[MmName("relevant_locations")]
		private List<ecologylab.semantics.metadata.scalar.MetadataParsedURL> relevantLocations;

		[SimplCollection("publication")]
		[MmName("publications")]
		private List<ecologylab.semantics.metadata.scalar.MetadataString> publications;

		[SimplCollection("proceeding")]
		[MmName("proceedings")]
		private List<ecologylab.semantics.metadata.scalar.MetadataString> proceedings;

		public NsfAward()
		{ }

		public NsfAward(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Document NsfOrg
		{
			get{return nsfOrg;}
			set
			{
				if (this.nsfOrg != value)
				{
					this.nsfOrg = value;
					this.RaisePropertyChanged( () => this.NsfOrg );
				}
			}
		}

		public MetadataDate InitialAmendmentDate
		{
			get{return initialAmendmentDate;}
			set
			{
				if (this.initialAmendmentDate != value)
				{
					this.initialAmendmentDate = value;
					this.RaisePropertyChanged( () => this.InitialAmendmentDate );
				}
			}
		}

		public MetadataDate LatestAmendmentDate
		{
			get{return latestAmendmentDate;}
			set
			{
				if (this.latestAmendmentDate != value)
				{
					this.latestAmendmentDate = value;
					this.RaisePropertyChanged( () => this.LatestAmendmentDate );
				}
			}
		}

		public MetadataString AwardNumber
		{
			get{return awardNumber;}
			set
			{
				if (this.awardNumber != value)
				{
					this.awardNumber = value;
					this.RaisePropertyChanged( () => this.AwardNumber );
				}
			}
		}

		public MetadataString AwardInstrument
		{
			get{return awardInstrument;}
			set
			{
				if (this.awardInstrument != value)
				{
					this.awardInstrument = value;
					this.RaisePropertyChanged( () => this.AwardInstrument );
				}
			}
		}

		public Author ProgramManager
		{
			get{return programManager;}
			set
			{
				if (this.programManager != value)
				{
					this.programManager = value;
					this.RaisePropertyChanged( () => this.ProgramManager );
				}
			}
		}

		public MetadataDate StartDate
		{
			get{return startDate;}
			set
			{
				if (this.startDate != value)
				{
					this.startDate = value;
					this.RaisePropertyChanged( () => this.StartDate );
				}
			}
		}

		public MetadataDate ExpireDate
		{
			get{return expireDate;}
			set
			{
				if (this.expireDate != value)
				{
					this.expireDate = value;
					this.RaisePropertyChanged( () => this.ExpireDate );
				}
			}
		}

		public MetadataInteger AwardedAmountToDate
		{
			get{return awardedAmountToDate;}
			set
			{
				if (this.awardedAmountToDate != value)
				{
					this.awardedAmountToDate = value;
					this.RaisePropertyChanged( () => this.AwardedAmountToDate );
				}
			}
		}

		public List<Investigator> Investigators
		{
			get{return investigators;}
			set
			{
				if (this.investigators != value)
				{
					this.investigators = value;
					this.RaisePropertyChanged( () => this.Investigators );
				}
			}
		}

		public MetadataString Sponsor
		{
			get{return sponsor;}
			set
			{
				if (this.sponsor != value)
				{
					this.sponsor = value;
					this.RaisePropertyChanged( () => this.Sponsor );
				}
			}
		}

		public MetadataString NsfPrograms
		{
			get{return nsfPrograms;}
			set
			{
				if (this.nsfPrograms != value)
				{
					this.nsfPrograms = value;
					this.RaisePropertyChanged( () => this.NsfPrograms );
				}
			}
		}

		public MetadataString FieldApplications
		{
			get{return fieldApplications;}
			set
			{
				if (this.fieldApplications != value)
				{
					this.fieldApplications = value;
					this.RaisePropertyChanged( () => this.FieldApplications );
				}
			}
		}

		public MetadataString ProgramReferenceCodes
		{
			get{return programReferenceCodes;}
			set
			{
				if (this.programReferenceCodes != value)
				{
					this.programReferenceCodes = value;
					this.RaisePropertyChanged( () => this.ProgramReferenceCodes );
				}
			}
		}

		public MetadataString ProgramElementCodes
		{
			get{return programElementCodes;}
			set
			{
				if (this.programElementCodes != value)
				{
					this.programElementCodes = value;
					this.RaisePropertyChanged( () => this.ProgramElementCodes );
				}
			}
		}

		public MetadataString AbstractField
		{
			get{return abstractField;}
			set
			{
				if (this.abstractField != value)
				{
					this.abstractField = value;
					this.RaisePropertyChanged( () => this.AbstractField );
				}
			}
		}

		public List<ecologylab.semantics.metadata.scalar.MetadataParsedURL> RelevantLocations
		{
			get{return relevantLocations;}
			set
			{
				if (this.relevantLocations != value)
				{
					this.relevantLocations = value;
					this.RaisePropertyChanged( () => this.RelevantLocations );
				}
			}
		}

		public List<ecologylab.semantics.metadata.scalar.MetadataString> Publications
		{
			get{return publications;}
			set
			{
				if (this.publications != value)
				{
					this.publications = value;
					this.RaisePropertyChanged( () => this.Publications );
				}
			}
		}

		public List<ecologylab.semantics.metadata.scalar.MetadataString> Proceedings
		{
			get{return proceedings;}
			set
			{
				if (this.proceedings != value)
				{
					this.proceedings = value;
					this.RaisePropertyChanged( () => this.Proceedings );
				}
			}
		}
	}
}
