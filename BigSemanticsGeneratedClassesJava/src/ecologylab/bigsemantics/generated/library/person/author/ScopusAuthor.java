package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.ScopusSearch;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
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
public class ScopusAuthor extends Author
{
	@simpl_scalar
	private MetadataString scopusAuthorId;

	@simpl_composite
	@mm_name("articles_by_author_page")
	private ScopusSearch articlesByAuthorPage;

	public ScopusAuthor()
	{ super(); }

	public ScopusAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	scopusAuthorId()
	{
		MetadataString	result = this.scopusAuthorId;
		if (result == null)
		{
			result = new MetadataString();
			this.scopusAuthorId = result;
		}
		return result;
	}

	public String getScopusAuthorId()
	{
		return this.scopusAuthorId == null ? null : scopusAuthorId().getValue();
	}

	public MetadataString getScopusAuthorIdMetadata()
	{
		return scopusAuthorId;
	}

	public void setScopusAuthorId(String scopusAuthorId)
	{
		if (scopusAuthorId != null)
			this.scopusAuthorId().setValue(scopusAuthorId);
	}

	public void setScopusAuthorIdMetadata(MetadataString scopusAuthorId)
	{
		this.scopusAuthorId = scopusAuthorId;
	}

	public ScopusSearch getArticlesByAuthorPage()
	{
		return articlesByAuthorPage;
	}

	public void setArticlesByAuthorPage(ScopusSearch articlesByAuthorPage)
	{
		this.articlesByAuthorPage = articlesByAuthorPage;
	}
}
