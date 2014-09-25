package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.AdditionalMetadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GetRecordAdditionalMetadata extends AdditionalMetadata
{
	@simpl_scalar
	private MetadataString accessionStatus;

	@simpl_scalar
	private MetadataString realm;

	@simpl_scalar
	private MetadataString partOfDrc;

	public GetRecordAdditionalMetadata()
	{ super(); }

	public GetRecordAdditionalMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	accessionStatus()
	{
		MetadataString	result = this.accessionStatus;
		if (result == null)
		{
			result = new MetadataString();
			this.accessionStatus = result;
		}
		return result;
	}

	public String getAccessionStatus()
	{
		return this.accessionStatus == null ? null : accessionStatus().getValue();
	}

	public MetadataString getAccessionStatusMetadata()
	{
		return accessionStatus;
	}

	public void setAccessionStatus(String accessionStatus)
	{
		if (accessionStatus != null)
			this.accessionStatus().setValue(accessionStatus);
	}

	public void setAccessionStatusMetadata(MetadataString accessionStatus)
	{
		this.accessionStatus = accessionStatus;
	}

	public MetadataString	realm()
	{
		MetadataString	result = this.realm;
		if (result == null)
		{
			result = new MetadataString();
			this.realm = result;
		}
		return result;
	}

	public String getRealm()
	{
		return this.realm == null ? null : realm().getValue();
	}

	public MetadataString getRealmMetadata()
	{
		return realm;
	}

	public void setRealm(String realm)
	{
		if (realm != null)
			this.realm().setValue(realm);
	}

	public void setRealmMetadata(MetadataString realm)
	{
		this.realm = realm;
	}

	public MetadataString	partOfDrc()
	{
		MetadataString	result = this.partOfDrc;
		if (result == null)
		{
			result = new MetadataString();
			this.partOfDrc = result;
		}
		return result;
	}

	public String getPartOfDrc()
	{
		return this.partOfDrc == null ? null : partOfDrc().getValue();
	}

	public MetadataString getPartOfDrcMetadata()
	{
		return partOfDrc;
	}

	public void setPartOfDrc(String partOfDrc)
	{
		if (partOfDrc != null)
			this.partOfDrc().setValue(partOfDrc);
	}

	public void setPartOfDrcMetadata(MetadataString partOfDrc)
	{
		this.partOfDrc = partOfDrc;
	}
}
