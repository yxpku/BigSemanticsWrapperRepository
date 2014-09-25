//
// Outline.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class Outline : Metadata
	{
		[SimplCollection("outline")]
		[SimplNoWrap]
		[MmName("outlines")]
		private List<Outline> outlines;

		[SimplScalar]
		[SimplTag("htmlUrl")]
		private MetadataParsedURL htmlUrl;

		[SimplScalar]
		private MetadataString text;

		[SimplScalar]
		private MetadataString title;

		[SimplScalar]
		private MetadataString type;

		[SimplScalar]
		[SimplTag("xmlUrl")]
		private MetadataParsedURL xmlUrl;

		public Outline()
		{ }

		public Outline(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Outline> Outlines
		{
			get{return outlines;}
			set
			{
				if (this.outlines != value)
				{
					this.outlines = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL HtmlUrl
		{
			get{return htmlUrl;}
			set
			{
				if (this.htmlUrl != value)
				{
					this.htmlUrl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Text
		{
			get{return text;}
			set
			{
				if (this.text != value)
				{
					this.text = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Title
		{
			get{return title;}
			set
			{
				if (this.title != value)
				{
					this.title = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Type
		{
			get{return type;}
			set
			{
				if (this.type != value)
				{
					this.type = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL XmlUrl
		{
			get{return xmlUrl;}
			set
			{
				if (this.xmlUrl != value)
				{
					this.xmlUrl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
