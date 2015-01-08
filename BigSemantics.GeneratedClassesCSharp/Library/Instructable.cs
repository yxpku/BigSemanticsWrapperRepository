//
// Instructable.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class Instructable : RichDocument
	{
		[SimplComposite]
		[MmName("instructor")]
		private InstructableAuthor instructor;

		[SimplScalar]
		private MetadataString numberOfSteps;

		[SimplScalar]
		private MetadataString views;

		[SimplScalar]
		private MetadataString favorites;

		[SimplCollection("instructable")]
		[MmName("others_by_author")]
		private List<Instructable> othersByAuthor;

		[SimplCollection("instructable")]
		[MmName("related")]
		private List<Instructable> related;

		[SimplCollection("instructable_tag")]
		[MmName("tags")]
		private List<InstructableTag> tags;

		[SimplCollection("instructable_comment")]
		[MmName("comments")]
		private List<InstructableComment> comments;

		public Instructable()
		{ }

		public Instructable(MetaMetadataCompositeField mmd) : base(mmd) { }


		public InstructableAuthor Instructor
		{
			get{return instructor;}
			set
			{
				if (this.instructor != value)
				{
					this.instructor = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString NumberOfSteps
		{
			get{return numberOfSteps;}
			set
			{
				if (this.numberOfSteps != value)
				{
					this.numberOfSteps = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Views
		{
			get{return views;}
			set
			{
				if (this.views != value)
				{
					this.views = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Favorites
		{
			get{return favorites;}
			set
			{
				if (this.favorites != value)
				{
					this.favorites = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Instructable> OthersByAuthor
		{
			get{return othersByAuthor;}
			set
			{
				if (this.othersByAuthor != value)
				{
					this.othersByAuthor = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Instructable> Related
		{
			get{return related;}
			set
			{
				if (this.related != value)
				{
					this.related = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InstructableTag> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InstructableComment> Comments
		{
			get{return comments;}
			set
			{
				if (this.comments != value)
				{
					this.comments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
