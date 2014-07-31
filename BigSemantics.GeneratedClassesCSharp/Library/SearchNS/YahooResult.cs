//
// YahooResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SearchNS 
{
	[SimplInherit]
	public class YahooResult : Document
	{
		[SimplScalar]
		private MetadataString summary;

		[SimplScalar]
		private MetadataString modificationDate;

		[SimplComposite]
		[MmName("thumbnail")]
		private YahooThumbnail thumbnail;

		[SimplScalar]
		private MetadataString mimeType;

		[SimplScalar]
		private MetadataParsedURL refererUrl;

		public YahooResult()
		{ }

		public YahooResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Summary
		{
			get{return summary;}
			set
			{
				if (this.summary != value)
				{
					this.summary = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ModificationDate
		{
			get{return modificationDate;}
			set
			{
				if (this.modificationDate != value)
				{
					this.modificationDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public YahooThumbnail Thumbnail
		{
			get{return thumbnail;}
			set
			{
				if (this.thumbnail != value)
				{
					this.thumbnail = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString MimeType
		{
			get{return mimeType;}
			set
			{
				if (this.mimeType != value)
				{
					this.mimeType = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL RefererUrl
		{
			get{return refererUrl;}
			set
			{
				if (this.refererUrl != value)
				{
					this.refererUrl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
