package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  PdfMixin.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * For metadata fields extracted by the PDF parser
 */ 
@simpl_inherit
public class PdfMixin extends Metadata
{
	/** 
	 * The author of the pdf document
	 */ 
	@simpl_scalar	private MetadataString author;

	/** 
	 * Summary of the pdf document
	 */ 
	@simpl_scalar	private MetadataString summary;

	/** 
	 * Key Words of the document
	 */ 
	@simpl_scalar	private MetadataString pdfKeywordsString;

	/** 
	 * Subject of the document
	 */ 
	@simpl_scalar	private MetadataString subject;

	/** 
	 */ 
	@simpl_scalar	private MetadataString trapped;

	/** 
	 */ 
	@simpl_scalar	private MetadataString modified;

	/** 
	 * Contents of the document
	 */ 
	@simpl_scalar	private MetadataString contents;

	/** 
	 * Creation date of the document
	 */ 
	@simpl_scalar	private MetadataString creationdate;

	public PdfMixin()
	{ }

	public PdfMixin(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	author()
	{
		MetadataString	result = this.author;
		if (result == null)
		{
			result = new MetadataString();
			this.author = result;
		}
		return result;
	}

	public String getAuthor()
	{
		return this.author().getValue();
	}

	public void setAuthor(String author)
	{
		this.author().setValue(author);
	}

	public MetadataString	summary()
	{
		MetadataString	result = this.summary;
		if (result == null)
		{
			result = new MetadataString();
			this.summary = result;
		}
		return result;
	}

	public String getSummary()
	{
		return this.summary().getValue();
	}

	public void setSummary(String summary)
	{
		this.summary().setValue(summary);
	}

	public MetadataString	pdfKeywordsString()
	{
		MetadataString	result = this.pdfKeywordsString;
		if (result == null)
		{
			result = new MetadataString();
			this.pdfKeywordsString = result;
		}
		return result;
	}

	public String getPdfKeywordsString()
	{
		return this.pdfKeywordsString().getValue();
	}

	public void setPdfKeywordsString(String pdfKeywordsString)
	{
		this.pdfKeywordsString().setValue(pdfKeywordsString);
	}

	public MetadataString	subject()
	{
		MetadataString	result = this.subject;
		if (result == null)
		{
			result = new MetadataString();
			this.subject = result;
		}
		return result;
	}

	public String getSubject()
	{
		return this.subject().getValue();
	}

	public void setSubject(String subject)
	{
		this.subject().setValue(subject);
	}

	public MetadataString	trapped()
	{
		MetadataString	result = this.trapped;
		if (result == null)
		{
			result = new MetadataString();
			this.trapped = result;
		}
		return result;
	}

	public String getTrapped()
	{
		return this.trapped().getValue();
	}

	public void setTrapped(String trapped)
	{
		this.trapped().setValue(trapped);
	}

	public MetadataString	modified()
	{
		MetadataString	result = this.modified;
		if (result == null)
		{
			result = new MetadataString();
			this.modified = result;
		}
		return result;
	}

	public String getModified()
	{
		return this.modified().getValue();
	}

	public void setModified(String modified)
	{
		this.modified().setValue(modified);
	}

	public MetadataString	contents()
	{
		MetadataString	result = this.contents;
		if (result == null)
		{
			result = new MetadataString();
			this.contents = result;
		}
		return result;
	}

	public String getContents()
	{
		return this.contents().getValue();
	}

	public void setContents(String contents)
	{
		this.contents().setValue(contents);
	}

	public MetadataString	creationdate()
	{
		MetadataString	result = this.creationdate;
		if (result == null)
		{
			result = new MetadataString();
			this.creationdate = result;
		}
		return result;
	}

	public String getCreationdate()
	{
		return this.creationdate().getValue();
	}

	public void setCreationdate(String creationdate)
	{
		this.creationdate().setValue(creationdate);
	}

}
