package ecologylab.bigsemantics.generated.library.creativeWork.article;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Article extends CreativeWork
{
	@simpl_scalar
	@simpl_tag("articleBody")
	private MetadataString articleBody;

	@simpl_scalar
	@simpl_tag("wordCount")
	private MetadataString wordCount;

	public Article()
	{ super(); }

	public Article(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	articleBody()
	{
		MetadataString	result = this.articleBody;
		if (result == null)
		{
			result = new MetadataString();
			this.articleBody = result;
		}
		return result;
	}

	public String getArticleBody()
	{
		return this.articleBody == null ? null : articleBody().getValue();
	}

	public MetadataString getArticleBodyMetadata()
	{
		return articleBody;
	}

	public void setArticleBody(String articleBody)
	{
		if (articleBody != null)
			this.articleBody().setValue(articleBody);
	}

	public void setArticleBodyMetadata(MetadataString articleBody)
	{
		this.articleBody = articleBody;
	}

	public MetadataString	wordCount()
	{
		MetadataString	result = this.wordCount;
		if (result == null)
		{
			result = new MetadataString();
			this.wordCount = result;
		}
		return result;
	}

	public String getWordCount()
	{
		return this.wordCount == null ? null : wordCount().getValue();
	}

	public MetadataString getWordCountMetadata()
	{
		return wordCount;
	}

	public void setWordCount(String wordCount)
	{
		if (wordCount != null)
			this.wordCount().setValue(wordCount);
	}

	public void setWordCountMetadata(MetadataString wordCount)
	{
		this.wordCount = wordCount;
	}
}
