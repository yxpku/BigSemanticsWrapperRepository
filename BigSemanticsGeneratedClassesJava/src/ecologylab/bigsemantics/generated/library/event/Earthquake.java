package ecologylab.bigsemantics.generated.library.event;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.event.Disaster;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataFloat;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Float;
import java.util.List;
import java.util.Map;

/** 
 *Generalized Earthquake Object
 */ 
@simpl_inherit
public class Earthquake extends Disaster
{
	@simpl_scalar
	private MetadataFloat depth;

	public Earthquake()
	{ super(); }

	public Earthquake(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataFloat	depth()
	{
		MetadataFloat	result = this.depth;
		if (result == null)
		{
			result = new MetadataFloat();
			this.depth = result;
		}
		return result;
	}

	public Float getDepth()
	{
		return this.depth == null ? 0 : depth().getValue();
	}

	public MetadataFloat getDepthMetadata()
	{
		return depth;
	}

	public void setDepth(Float depth)
	{
		if (depth != 0)
			this.depth().setValue(depth);
	}

	public void setDepthMetadata(MetadataFloat depth)
	{
		this.depth = depth;
	}
}
