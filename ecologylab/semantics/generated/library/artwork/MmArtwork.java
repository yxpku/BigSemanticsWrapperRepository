package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.artwork.Artwork;

/**
*  MmArtwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * ACM Multimedia Interactive Artwork class
 */ 
@simpl_inherit
public class MmArtwork extends Artwork
{
	/** 
	 * Website of the work or group responsible.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL website;

	/** 
	 * Link the ACM Portal page.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL extendedAbstract;

	public MmArtwork()
	{ }

	public MmArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	website()
	{
		MetadataParsedURL	result = this.website;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.website = result;
		}
		return result;
	}

	public ParsedURL getWebsite()
	{
		return this.website == null ? null : website().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getWebsiteMetadata()
	{
		return website;
	}

	public void setWebsite(ParsedURL website)
	{
		if (website != null)
			this.website().setValue(website);
	}

	public void setWebsiteMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL website)
	{
		this.website = website;
	}

	public MetadataParsedURL	extendedAbstract()
	{
		MetadataParsedURL	result = this.extendedAbstract;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.extendedAbstract = result;
		}
		return result;
	}

	public ParsedURL getExtendedAbstract()
	{
		return this.extendedAbstract == null ? null : extendedAbstract().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getExtendedAbstractMetadata()
	{
		return extendedAbstract;
	}

	public void setExtendedAbstract(ParsedURL extendedAbstract)
	{
		if (extendedAbstract != null)
			this.extendedAbstract().setValue(extendedAbstract);
	}

	public void setExtendedAbstractMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL extendedAbstract)
	{
		this.extendedAbstract = extendedAbstract;
	}
}
