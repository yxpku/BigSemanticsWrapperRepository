package ecologylab.semantics.generated.library.gps;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;

/**
*  ContactPoint.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Resembles a schema.org ContactPoint but is a mixin, not extending document.
 */ 
@simpl_inherit
public class ContactPoint extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString telephone;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString faxNumber;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString email;

	public ContactPoint()
	{ }

	public ContactPoint(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	telephone()
	{
		MetadataString	result = this.telephone;
		if (result == null)
		{
			result = new MetadataString();
			this.telephone = result;
		}
		return result;
	}

	public String getTelephone()
	{
		return this.telephone == null ? null : telephone().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTelephoneMetadata()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		if (telephone != null)
			this.telephone().setValue(telephone);
	}

	public void setTelephoneMetadata(ecologylab.semantics.metadata.scalar.MetadataString telephone)
	{
		this.telephone = telephone;
	}

	public MetadataString	faxNumber()
	{
		MetadataString	result = this.faxNumber;
		if (result == null)
		{
			result = new MetadataString();
			this.faxNumber = result;
		}
		return result;
	}

	public String getFaxNumber()
	{
		return this.faxNumber == null ? null : faxNumber().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getFaxNumberMetadata()
	{
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber)
	{
		if (faxNumber != null)
			this.faxNumber().setValue(faxNumber);
	}

	public void setFaxNumberMetadata(ecologylab.semantics.metadata.scalar.MetadataString faxNumber)
	{
		this.faxNumber = faxNumber;
	}

	public MetadataString	email()
	{
		MetadataString	result = this.email;
		if (result == null)
		{
			result = new MetadataString();
			this.email = result;
		}
		return result;
	}

	public String getEmail()
	{
		return this.email == null ? null : email().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getEmailMetadata()
	{
		return email;
	}

	public void setEmail(String email)
	{
		if (email != null)
			this.email().setValue(email);
	}

	public void setEmailMetadata(ecologylab.semantics.metadata.scalar.MetadataString email)
	{
		this.email = email;
	}
}
