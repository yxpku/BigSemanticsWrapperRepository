//
// PinterestPin.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	[SimplInherit]
	public class PinterestPin : CreativeWork
	{
		[SimplComposite]
		[MmName("pinboard")]
		private RichDocument pinboard;

		[SimplComposite]
		[MmName("pinner")]
		private RichDocument pinner;

		[SimplComposite]
		[MmName("repins")]
		private RichDocument repins;

		[SimplComposite]
		[MmName("likes")]
		private RichDocument likes;

		[SimplComposite]
		[MmName("repinned_from_pinner")]
		private RichDocument repinnedFromPinner;

		[SimplComposite]
		[MmName("repinned_from_pinboard")]
		private RichDocument repinnedFromPinboard;

		[SimplComposite]
		[MmName("original_pinner")]
		private RichDocument originalPinner;

		[SimplComposite]
		[MmName("original_pinboard")]
		private RichDocument originalPinboard;

		[SimplComposite]
		[MmName("originally_from")]
		private RichDocument originallyFrom;

		public PinterestPin()
		{ }

		public PinterestPin(MetaMetadataCompositeField mmd) : base(mmd) { }


		public RichDocument Pinboard
		{
			get{return pinboard;}
			set
			{
				if (this.pinboard != value)
				{
					this.pinboard = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Pinner
		{
			get{return pinner;}
			set
			{
				if (this.pinner != value)
				{
					this.pinner = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Repins
		{
			get{return repins;}
			set
			{
				if (this.repins != value)
				{
					this.repins = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Likes
		{
			get{return likes;}
			set
			{
				if (this.likes != value)
				{
					this.likes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument RepinnedFromPinner
		{
			get{return repinnedFromPinner;}
			set
			{
				if (this.repinnedFromPinner != value)
				{
					this.repinnedFromPinner = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument RepinnedFromPinboard
		{
			get{return repinnedFromPinboard;}
			set
			{
				if (this.repinnedFromPinboard != value)
				{
					this.repinnedFromPinboard = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument OriginalPinner
		{
			get{return originalPinner;}
			set
			{
				if (this.originalPinner != value)
				{
					this.originalPinner = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument OriginalPinboard
		{
			get{return originalPinboard;}
			set
			{
				if (this.originalPinboard != value)
				{
					this.originalPinboard = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument OriginallyFrom
		{
			get{return originallyFrom;}
			set
			{
				if (this.originallyFrom != value)
				{
					this.originallyFrom = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
