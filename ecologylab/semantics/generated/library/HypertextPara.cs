//
//  HypertextPara.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 02/09/11.
//  Copyright 2011 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using Simpl.Serialization.Attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;

namespace ecologylab.semantics.generated.library 
{
	/// <summary>
	/// Representing a paragraph that consists of sequences of plain text and anchors
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[SimplInherit]
	[SimplDescriptorClasses(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	public class HypertextPara : Metadata
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[SimplCollection]
        [SimplScope("generated_metadata_translations")]
        [MmName("hypertext")]
		private List<Run> runs;

		public HypertextPara()
		{ }

		public List<Run> Runs
		{
			get{return runs;}
			set{runs = value;}
		}
	}
}
