package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Audience.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Audience extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("gradeRange")	private ecologylab.semantics.metadata.scalar.MetadataString gradeRange;

	public Audience()
	{ }

	public Audience(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	gradeRange()
	{
		MetadataString	result = this.gradeRange;
		if (result == null)
		{
			result = new MetadataString();
			this.gradeRange = result;
		}
		return result;
	}

	public String getGradeRange()
	{
		return this.gradeRange == null ? null : gradeRange().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getGradeRangeMetadata()
	{
		return gradeRange;
	}

	public void setGradeRange(String gradeRange)
	{
		if (gradeRange != null)
			this.gradeRange().setValue(gradeRange);
	}

	public void setGradeRangeMetadata(ecologylab.semantics.metadata.scalar.MetadataString gradeRange)
	{
		this.gradeRange = gradeRange;
	}
}
