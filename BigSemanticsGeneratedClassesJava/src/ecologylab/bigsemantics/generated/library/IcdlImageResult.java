package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.IcdlBook;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Thumbnail Image
 */ 
@simpl_inherit
public class IcdlImageResult extends RichDocument
{
	@simpl_collection("icdl_book")
	@simpl_nowrap
	@mm_name("books")
	private List<IcdlBook> books;

	public IcdlImageResult()
	{ super(); }

	public IcdlImageResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<IcdlBook> getBooks()
	{
		return books;
	}

  // lazy evaluation:
  public List<IcdlBook> books()
  {
    if (books == null)
      books = new ArrayList<IcdlBook>();
    return books;
  }

  // addTo:
  public void addToBooks(IcdlBook element)
  {
    books().add(element);
  }

  // size:
  public int booksSize()
  {
    return books == null ? 0 : books.size();
  }

	public void setBooks(List<IcdlBook> books)
	{
		this.books = books;
	}
}
