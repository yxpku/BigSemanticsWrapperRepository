package ecologylab.bigsemantics.generated.library.creativeWork.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.artwork.Artwork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.List;
import java.util.Map;

/** 
 *ACM Multimedia Interactive Artwork class
 */ 
@simpl_inherit
public class MmArtwork extends Artwork
{
	/** 
	 *Website of the work or group responsible.
	 */ 
	@simpl_scalar
	private MetadataParsedURL website;

	/** 
	 *Link the ACM Portal page.
	 */ 
	@simpl_scalar
	private MetadataParsedURL extendedAbstract;

	public MmArtwork()
	{ super(); }

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

	public MetadataParsedURL getWebsiteMetadata()
	{
		return website;
	}

	public void setWebsite(ParsedURL website)
	{
		if (website != null)
			this.website().setValue(website);
	}

	public void setWebsiteMetadata(MetadataParsedURL website)
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

	public MetadataParsedURL getExtendedAbstractMetadata()
	{
		return extendedAbstract;
	}

	public void setExtendedAbstract(ParsedURL extendedAbstract)
	{
		if (extendedAbstract != null)
			this.extendedAbstract().setValue(extendedAbstract);
	}

	public void setExtendedAbstractMetadata(MetadataParsedURL extendedAbstract)
	{
		this.extendedAbstract = extendedAbstract;
	}
}
