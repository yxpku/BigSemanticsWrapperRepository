package ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.ScholarlyArticle;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ScopusArticle extends ScholarlyArticle
{
	@simpl_composite
	@mm_name("source_article")
	private ScholarlyArticle sourceArticle;

	public ScopusArticle()
	{ super(); }

	public ScopusArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ScholarlyArticle getSourceArticle()
	{
		return sourceArticle;
	}

	public void setSourceArticle(ScholarlyArticle sourceArticle)
	{
		this.sourceArticle = sourceArticle;
	}
}
