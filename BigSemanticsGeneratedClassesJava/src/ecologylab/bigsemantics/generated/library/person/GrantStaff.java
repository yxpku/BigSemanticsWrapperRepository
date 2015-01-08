package ecologylab.bigsemantics.generated.library.person;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.GrantProgram;
import ecologylab.bigsemantics.generated.library.creativeWork.Grant;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.Person;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GrantStaff extends Person
{
	@simpl_scalar
	private MetadataString occupationTitle;

	@simpl_scalar
	private MetadataString affiliation;

	@simpl_collection("grant_program")
	@mm_name("programs")
	private List<GrantProgram> programs;

	@simpl_collection("grant")
	@mm_name("grants")
	private List<Grant> grants;

	public GrantStaff()
	{ super(); }

	public GrantStaff(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	occupationTitle()
	{
		MetadataString	result = this.occupationTitle;
		if (result == null)
		{
			result = new MetadataString();
			this.occupationTitle = result;
		}
		return result;
	}

	public String getOccupationTitle()
	{
		return this.occupationTitle == null ? null : occupationTitle().getValue();
	}

	public MetadataString getOccupationTitleMetadata()
	{
		return occupationTitle;
	}

	public void setOccupationTitle(String occupationTitle)
	{
		if (occupationTitle != null)
			this.occupationTitle().setValue(occupationTitle);
	}

	public void setOccupationTitleMetadata(MetadataString occupationTitle)
	{
		this.occupationTitle = occupationTitle;
	}

	public MetadataString	affiliation()
	{
		MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public String getAffiliation()
	{
		return this.affiliation == null ? null : affiliation().getValue();
	}

	public MetadataString getAffiliationMetadata()
	{
		return affiliation;
	}

	public void setAffiliation(String affiliation)
	{
		if (affiliation != null)
			this.affiliation().setValue(affiliation);
	}

	public void setAffiliationMetadata(MetadataString affiliation)
	{
		this.affiliation = affiliation;
	}

	public List<GrantProgram> getPrograms()
	{
		return programs;
	}

  // lazy evaluation:
  public List<GrantProgram> programs()
  {
    if (programs == null)
      programs = new ArrayList<GrantProgram>();
    return programs;
  }

  // addTo:
  public void addToPrograms(GrantProgram element)
  {
    programs().add(element);
  }

  // size:
  public int programsSize()
  {
    return programs == null ? 0 : programs.size();
  }

	public void setPrograms(List<GrantProgram> programs)
	{
		this.programs = programs;
	}

	public List<Grant> getGrants()
	{
		return grants;
	}

  // lazy evaluation:
  public List<Grant> grants()
  {
    if (grants == null)
      grants = new ArrayList<Grant>();
    return grants;
  }

  // addTo:
  public void addToGrants(Grant element)
  {
    grants().add(element);
  }

  // size:
  public int grantsSize()
  {
    return grants == null ? 0 : grants.size();
  }

	public void setGrants(List<Grant> grants)
	{
		this.grants = grants;
	}
}
