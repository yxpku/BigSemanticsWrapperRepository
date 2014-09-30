package ecologylab.bigsemantics.generated.library.creativeWork.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.Publisher;
import ecologylab.bigsemantics.generated.library.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
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

/** 
 *A publication.
 */ 
@simpl_inherit
public class BasicPublication extends CreativeWork
{
	@simpl_scalar
	private MetadataString isbn;

	@simpl_composite
	@mm_name("publisher")
	private Publisher publisher;

	public BasicPublication()
	{ super(); }

	public BasicPublication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	isbn()
	{
		MetadataString	result = this.isbn;
		if (result == null)
		{
			result = new MetadataString();
			this.isbn = result;
		}
		return result;
	}

	public String getIsbn()
	{
		return this.isbn == null ? null : isbn().getValue();
	}

	public MetadataString getIsbnMetadata()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		if (isbn != null)
			this.isbn().setValue(isbn);
	}

	public void setIsbnMetadata(MetadataString isbn)
	{
		this.isbn = isbn;
	}

	public Publisher getPublisher()
	{
		return publisher;
	}

	public void setPublisher(Publisher publisher)
	{
		this.publisher = publisher;
	}
}