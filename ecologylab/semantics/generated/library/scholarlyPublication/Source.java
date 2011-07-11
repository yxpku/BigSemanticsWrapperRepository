package ecologylab.semantics.generated.library.scholarlyPublication;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Source.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Metadata related to where an article is published.
 */ 
@simpl_inherit
public class Source extends Document
{
	/** 
	 * Same as title, but used for composite scalar
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private MetadataString archiveName;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger yearOfPublication;

	/** 
	 */ 
	@simpl_scalar	private MetadataString isbn;

	/** 
	 */ 
	@simpl_scalar	private MetadataString pages;

	public Source()
	{ }

	public Source(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	archiveName()
	{
		MetadataString	result = this.archiveName;
		if (result == null)
		{
			result = new MetadataString();
			this.archiveName = result;
		}
		return result;
	}

	public String getArchiveName()
	{
		return this.archiveName().getValue();
	}

	public void setArchiveName(String archiveName)
	{
		this.archiveName().setValue(archiveName);
	}

	public MetadataInteger	yearOfPublication()
	{
		MetadataInteger	result = this.yearOfPublication;
		if (result == null)
		{
			result = new MetadataInteger();
			this.yearOfPublication = result;
		}
		return result;
	}

	public int getYearOfPublication()
	{
		return this.yearOfPublication().getValue();
	}

	public void setYearOfPublication(int yearOfPublication)
	{
		this.yearOfPublication().setValue(yearOfPublication);
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
		return this.isbn().getValue();
	}

	public void setIsbn(String isbn)
	{
		this.isbn().setValue(isbn);
	}

	public MetadataString	pages()
	{
		MetadataString	result = this.pages;
		if (result == null)
		{
			result = new MetadataString();
			this.pages = result;
		}
		return result;
	}

	public String getPages()
	{
		return this.pages().getValue();
	}

	public void setPages(String pages)
	{
		this.pages().setValue(pages);
	}

}
