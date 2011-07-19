package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.Date;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Dc.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Dublin core fields.
 */ 
@simpl_inherit
public class Dc extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:creator")	@simpl_hints(Hint.XML_LEAF)	private MetadataString dcCreator;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:subject")	@simpl_hints(Hint.XML_LEAF)	private MetadataString dcSubject;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:description")	@simpl_hints(Hint.XML_LEAF)	private MetadataString dcDescription;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:title")	@simpl_hints(Hint.XML_LEAF)	private MetadataString dcTitle;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:date")	@simpl_hints(Hint.XML_LEAF)	private MetadataDate dcDate;

	public Dc()
	{ }

	public Dc(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	dcCreator()
	{
		MetadataString	result = this.dcCreator;
		if (result == null)
		{
			result = new MetadataString();
			this.dcCreator = result;
		}
		return result;
	}

	public String getDcCreator()
	{
		return this.dcCreator().getValue();
	}

	public void setDcCreator(String dcCreator)
	{
		this.dcCreator().setValue(dcCreator);
	}

	public MetadataString	dcSubject()
	{
		MetadataString	result = this.dcSubject;
		if (result == null)
		{
			result = new MetadataString();
			this.dcSubject = result;
		}
		return result;
	}

	public String getDcSubject()
	{
		return this.dcSubject().getValue();
	}

	public void setDcSubject(String dcSubject)
	{
		this.dcSubject().setValue(dcSubject);
	}

	public MetadataString	dcDescription()
	{
		MetadataString	result = this.dcDescription;
		if (result == null)
		{
			result = new MetadataString();
			this.dcDescription = result;
		}
		return result;
	}

	public String getDcDescription()
	{
		return this.dcDescription().getValue();
	}

	public void setDcDescription(String dcDescription)
	{
		this.dcDescription().setValue(dcDescription);
	}

	public MetadataString	dcTitle()
	{
		MetadataString	result = this.dcTitle;
		if (result == null)
		{
			result = new MetadataString();
			this.dcTitle = result;
		}
		return result;
	}

	public String getDcTitle()
	{
		return this.dcTitle().getValue();
	}

	public void setDcTitle(String dcTitle)
	{
		this.dcTitle().setValue(dcTitle);
	}

	public MetadataDate	dcDate()
	{
		MetadataDate	result = this.dcDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.dcDate = result;
		}
		return result;
	}

	public Date getDcDate()
	{
		return this.dcDate().getValue();
	}

	public void setDcDate(Date dcDate)
	{
		this.dcDate().setValue(dcDate);
	}

}
