package ecologylab.semantics.generated.library.creativeWork;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.generated.library.creativeWork.BasicPublication;
import ecologylab.serialization.simpl_inherit;

/**
*  Periodical.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Metadata related to where an article is published.
 */ 
@simpl_inherit
public class Periodical extends BasicPublication
{
	/** 
	 * Same as title, but used for composite scalar
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private ecologylab.semantics.metadata.scalar.MetadataString archiveName;

	public Periodical()
	{ }

	public Periodical(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	archiveName()
	{
		MetadataString	result = this.archiveName;
		if (result == null)
		{
			result = new MetadataString();
			this.archiveName = result;
		}
		return result;
	}

	public String getArchiveName()
	{
		return this.archiveName == null ? null : archiveName().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getArchiveNameMetadata()
	{
		return archiveName;
	}

	public void setArchiveName(String archiveName)
	{
		if (archiveName != null)
			this.archiveName().setValue(archiveName);
	}

	public void setArchiveNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString archiveName)
	{
		this.archiveName = archiveName;
	}
}