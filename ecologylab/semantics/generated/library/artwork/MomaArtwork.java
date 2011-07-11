package ecologylab.semantics.generated.library.artwork;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MomaArtwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MomaArtwork extends Artwork
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString status;

	/** 
	 */ 
	@simpl_composite @mm_name("moma_deparment")	private CompoundDocument momaDeparment;

	/** 
	 */ 
	@simpl_composite @mm_name("moma_classification")	private CompoundDocument momaClassification;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL permalink;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL databaseLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataString momaId;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL imageUrl;

	/** 
	 */ 
	@simpl_composite @mm_name("temp_field_value_holder")	private MmdInlineTempFieldValueHolderInMomaArtwork tempFieldValueHolder;

	public MomaArtwork()
	{ }

	public MomaArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	status()
	{
		MetadataString	result = this.status;
		if (result == null)
		{
			result = new MetadataString();
			this.status = result;
		}
		return result;
	}

	public String getStatus()
	{
		return this.status().getValue();
	}

	public void setStatus(String status)
	{
		this.status().setValue(status);
	}


	public CompoundDocument getMomaDeparment()
	{
		return momaDeparment;
	}

	public void setMomaDeparment(CompoundDocument momaDeparment)
	{
		this.momaDeparment = momaDeparment;
	}

	public CompoundDocument getMomaClassification()
	{
		return momaClassification;
	}

	public void setMomaClassification(CompoundDocument momaClassification)
	{
		this.momaClassification = momaClassification;
	}
	public MetadataParsedURL	permalink()
	{
		MetadataParsedURL	result = this.permalink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.permalink = result;
		}
		return result;
	}

	public ParsedURL getPermalink()
	{
		return this.permalink().getValue();
	}

	public void setPermalink(ParsedURL permalink)
	{
		this.permalink().setValue(permalink);
	}

	public MetadataParsedURL	databaseLink()
	{
		MetadataParsedURL	result = this.databaseLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.databaseLink = result;
		}
		return result;
	}

	public ParsedURL getDatabaseLink()
	{
		return this.databaseLink().getValue();
	}

	public void setDatabaseLink(ParsedURL databaseLink)
	{
		this.databaseLink().setValue(databaseLink);
	}

	public MetadataString	momaId()
	{
		MetadataString	result = this.momaId;
		if (result == null)
		{
			result = new MetadataString();
			this.momaId = result;
		}
		return result;
	}

	public String getMomaId()
	{
		return this.momaId().getValue();
	}

	public void setMomaId(String momaId)
	{
		this.momaId().setValue(momaId);
	}

	public MetadataParsedURL	imageUrl()
	{
		MetadataParsedURL	result = this.imageUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageUrl = result;
		}
		return result;
	}

	public ParsedURL getImageUrl()
	{
		return this.imageUrl().getValue();
	}

	public void setImageUrl(ParsedURL imageUrl)
	{
		this.imageUrl().setValue(imageUrl);
	}


	public MmdInlineTempFieldValueHolderInMomaArtwork getTempFieldValueHolder()
	{
		return tempFieldValueHolder;
	}

	public void setTempFieldValueHolder(MmdInlineTempFieldValueHolderInMomaArtwork tempFieldValueHolder)
	{
		this.tempFieldValueHolder = tempFieldValueHolder;
	}
}
