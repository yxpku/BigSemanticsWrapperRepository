package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.AskNatureStrategy;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AskNatureImage extends RichDocument
{
	@simpl_scalar
	private MetadataString photographerOrArtist;

	@simpl_composite
	@mm_name("image_source")
	private RichDocument imageSource;

	@simpl_composite
	@mm_name("link_to_strategy")
	private AskNatureStrategy linkToStrategy;

	public AskNatureImage()
	{ super(); }

	public AskNatureImage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	photographerOrArtist()
	{
		MetadataString	result = this.photographerOrArtist;
		if (result == null)
		{
			result = new MetadataString();
			this.photographerOrArtist = result;
		}
		return result;
	}

	public String getPhotographerOrArtist()
	{
		return this.photographerOrArtist == null ? null : photographerOrArtist().getValue();
	}

	public MetadataString getPhotographerOrArtistMetadata()
	{
		return photographerOrArtist;
	}

	public void setPhotographerOrArtist(String photographerOrArtist)
	{
		if (photographerOrArtist != null)
			this.photographerOrArtist().setValue(photographerOrArtist);
	}

	public void setPhotographerOrArtistMetadata(MetadataString photographerOrArtist)
	{
		this.photographerOrArtist = photographerOrArtist;
	}

	public RichDocument getImageSource()
	{
		return imageSource;
	}

	public void setImageSource(RichDocument imageSource)
	{
		this.imageSource = imageSource;
	}

	public AskNatureStrategy getLinkToStrategy()
	{
		return linkToStrategy;
	}

	public void setLinkToStrategy(AskNatureStrategy linkToStrategy)
	{
		this.linkToStrategy = linkToStrategy;
	}
}
