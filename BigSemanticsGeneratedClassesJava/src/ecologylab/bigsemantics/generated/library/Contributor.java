package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.Organization;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Contributor extends Metadata
{
	@simpl_scalar
	private MetadataInteger date;

	@simpl_scalar
	private MetadataString role;

	@simpl_composite
	@mm_name("organization")
	private Organization organization;

	public Contributor()
	{ super(); }

	public Contributor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	date()
	{
		MetadataInteger	result = this.date;
		if (result == null)
		{
			result = new MetadataInteger();
			this.date = result;
		}
		return result;
	}

	public Integer getDate()
	{
		return this.date == null ? 0 : date().getValue();
	}

	public MetadataInteger getDateMetadata()
	{
		return date;
	}

	public void setDate(Integer date)
	{
		if (date != 0)
			this.date().setValue(date);
	}

	public void setDateMetadata(MetadataInteger date)
	{
		this.date = date;
	}

	public MetadataString	role()
	{
		MetadataString	result = this.role;
		if (result == null)
		{
			result = new MetadataString();
			this.role = result;
		}
		return result;
	}

	public String getRole()
	{
		return this.role == null ? null : role().getValue();
	}

	public MetadataString getRoleMetadata()
	{
		return role;
	}

	public void setRole(String role)
	{
		if (role != null)
			this.role().setValue(role);
	}

	public void setRoleMetadata(MetadataString role)
	{
		this.role = role;
	}

	public Organization getOrganization()
	{
		return organization;
	}

	public void setOrganization(Organization organization)
	{
		this.organization = organization;
	}
}
