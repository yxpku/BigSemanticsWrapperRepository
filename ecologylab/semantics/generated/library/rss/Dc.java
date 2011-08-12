package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import java.util.Date;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Dc.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
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
	@simpl_scalar	@xml_tag("dc:creator")	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataString dcCreator;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:subject")	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataString dcSubject;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:description")	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataString dcDescription;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:title")	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataString dcTitle;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("dc:date")	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataDate dcDate;

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
		return this.dcCreator == null ? null : dcCreator().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDcCreatorMetadata()
	{
		return dcCreator;
	}

	public void setDcCreator(String dcCreator)
	{
		if (dcCreator != null)
			this.dcCreator().setValue(dcCreator);
	}

	public void setDcCreatorMetadata(ecologylab.semantics.metadata.scalar.MetadataString dcCreator)
	{
		this.dcCreator = dcCreator;
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
		return this.dcSubject == null ? null : dcSubject().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDcSubjectMetadata()
	{
		return dcSubject;
	}

	public void setDcSubject(String dcSubject)
	{
		if (dcSubject != null)
			this.dcSubject().setValue(dcSubject);
	}

	public void setDcSubjectMetadata(ecologylab.semantics.metadata.scalar.MetadataString dcSubject)
	{
		this.dcSubject = dcSubject;
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
		return this.dcDescription == null ? null : dcDescription().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDcDescriptionMetadata()
	{
		return dcDescription;
	}

	public void setDcDescription(String dcDescription)
	{
		if (dcDescription != null)
			this.dcDescription().setValue(dcDescription);
	}

	public void setDcDescriptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString dcDescription)
	{
		this.dcDescription = dcDescription;
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
		return this.dcTitle == null ? null : dcTitle().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDcTitleMetadata()
	{
		return dcTitle;
	}

	public void setDcTitle(String dcTitle)
	{
		if (dcTitle != null)
			this.dcTitle().setValue(dcTitle);
	}

	public void setDcTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString dcTitle)
	{
		this.dcTitle = dcTitle;
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
		return this.dcDate == null ? null : dcDate().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDate getDcDateMetadata()
	{
		return dcDate;
	}

	public void setDcDate(Date dcDate)
	{
		if (dcDate != null)
			this.dcDate().setValue(dcDate);
	}

	public void setDcDateMetadata(ecologylab.semantics.metadata.scalar.MetadataDate dcDate)
	{
		this.dcDate = dcDate;
	}
}
