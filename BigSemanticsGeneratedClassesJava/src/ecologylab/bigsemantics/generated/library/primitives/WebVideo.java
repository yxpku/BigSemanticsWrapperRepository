package ecologylab.bigsemantics.generated.library.primitives;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.primitives.MediaProvider;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.Video;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class WebVideo extends Video
{
	@simpl_composite
	@mm_name("provider")
	private MediaProvider provider;

	public WebVideo()
	{ super(); }

	public WebVideo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MediaProvider getProvider()
	{
		return provider;
	}

	public void setProvider(MediaProvider provider)
	{
		this.provider = provider;
	}
}
