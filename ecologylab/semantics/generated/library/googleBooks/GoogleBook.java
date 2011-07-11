package ecologylab.semantics.generated.library.googleBooks;

import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.publication.Book;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  GoogleBook.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class GoogleBook extends Book
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString category;

	/** 
	 */ 
	@simpl_collection("google_book") @mm_name("references_from_books")	private ArrayList<GoogleBook> referencesFromBooks;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL placesMentionedKml;

	/** 
	 */ 
	@simpl_collection("page") @mm_name("selected_pages")	private ArrayList<MmdInlinePageInSelectedPagesInGoogleBook> selectedPages;

	public GoogleBook()
	{ }

	public GoogleBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	category()
	{
		MetadataString	result = this.category;
		if (result == null)
		{
			result = new MetadataString();
			this.category = result;
		}
		return result;
	}

	public String getCategory()
	{
		return this.category().getValue();
	}

	public void setCategory(String category)
	{
		this.category().setValue(category);
	}


	public ArrayList<GoogleBook> getReferencesFromBooks()
	{
		return referencesFromBooks;
	}

	public void setReferencesFromBooks(ArrayList<GoogleBook> referencesFromBooks)
	{
		this.referencesFromBooks = referencesFromBooks;
	}
	public MetadataParsedURL	placesMentionedKml()
	{
		MetadataParsedURL	result = this.placesMentionedKml;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placesMentionedKml = result;
		}
		return result;
	}

	public ParsedURL getPlacesMentionedKml()
	{
		return this.placesMentionedKml().getValue();
	}

	public void setPlacesMentionedKml(ParsedURL placesMentionedKml)
	{
		this.placesMentionedKml().setValue(placesMentionedKml);
	}


	public ArrayList<MmdInlinePageInSelectedPagesInGoogleBook> getSelectedPages()
	{
		return selectedPages;
	}

	public void setSelectedPages(ArrayList<MmdInlinePageInSelectedPagesInGoogleBook> selectedPages)
	{
		this.selectedPages = selectedPages;
	}
}
