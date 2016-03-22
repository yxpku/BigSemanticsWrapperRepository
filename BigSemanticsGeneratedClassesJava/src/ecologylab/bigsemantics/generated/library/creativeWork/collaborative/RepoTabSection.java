package ecologylab.bigsemantics.generated.library.creativeWork.collaborative;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class RepoTabSection extends Document
{
	@simpl_scalar
	private MetadataString numberOfChildren;

	public RepoTabSection()
	{ super(); }

	public RepoTabSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	numberOfChildren()
	{
		MetadataString	result = this.numberOfChildren;
		if (result == null)
		{
			result = new MetadataString();
			this.numberOfChildren = result;
		}
		return result;
	}

	public String getNumberOfChildren()
	{
		return this.numberOfChildren == null ? null : numberOfChildren().getValue();
	}

	public MetadataString getNumberOfChildrenMetadata()
	{
		return numberOfChildren;
	}

	public void setNumberOfChildren(String numberOfChildren)
	{
		if (numberOfChildren != null)
			this.numberOfChildren().setValue(numberOfChildren);
	}

	public void setNumberOfChildrenMetadata(MetadataString numberOfChildren)
	{
		this.numberOfChildren = numberOfChildren;
	}
}
