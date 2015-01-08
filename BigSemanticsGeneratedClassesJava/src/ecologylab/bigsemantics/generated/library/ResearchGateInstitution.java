package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.ResearchGateInstitution;
import ecologylab.bigsemantics.generated.library.ResearchGateInstitutionContactInfo;
import ecologylab.bigsemantics.generated.library.ResearchGateInstitutionDepartment;
import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.ResearchGateArticle;
import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.ResearchGateStats;
import ecologylab.bigsemantics.generated.library.person.author.ResearchGateAuthor;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ResearchGateInstitution extends RichDocument
{
	@simpl_scalar
	private MetadataString institutionHead;

	@simpl_collection("research_gate_article")
	@mm_name("top_publications")
	private List<ResearchGateArticle> topPublications;

	@simpl_collection("research_gate_institution_department")
	@mm_name("top_departments")
	private List<ResearchGateInstitutionDepartment> topDepartments;

	@simpl_collection("research_gate_institution")
	@mm_name("top_collaborators")
	private List<ResearchGateInstitution> topCollaborators;

	@simpl_collection("research_gate_author")
	@mm_name("top_members")
	private List<ResearchGateAuthor> topMembers;

	@simpl_composite
	@mm_name("contact_info")
	private ResearchGateInstitutionContactInfo contactInfo;

	@simpl_composite
	@mm_name("website")
	private RichDocument website;

	@simpl_composite
	@mm_name("stats")
	private ResearchGateStats stats;

	public ResearchGateInstitution()
	{ super(); }

	public ResearchGateInstitution(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	institutionHead()
	{
		MetadataString	result = this.institutionHead;
		if (result == null)
		{
			result = new MetadataString();
			this.institutionHead = result;
		}
		return result;
	}

	public String getInstitutionHead()
	{
		return this.institutionHead == null ? null : institutionHead().getValue();
	}

	public MetadataString getInstitutionHeadMetadata()
	{
		return institutionHead;
	}

	public void setInstitutionHead(String institutionHead)
	{
		if (institutionHead != null)
			this.institutionHead().setValue(institutionHead);
	}

	public void setInstitutionHeadMetadata(MetadataString institutionHead)
	{
		this.institutionHead = institutionHead;
	}

	public List<ResearchGateArticle> getTopPublications()
	{
		return topPublications;
	}

  // lazy evaluation:
  public List<ResearchGateArticle> topPublications()
  {
    if (topPublications == null)
      topPublications = new ArrayList<ResearchGateArticle>();
    return topPublications;
  }

  // addTo:
  public void addToTopPublications(ResearchGateArticle element)
  {
    topPublications().add(element);
  }

  // size:
  public int topPublicationsSize()
  {
    return topPublications == null ? 0 : topPublications.size();
  }

	public void setTopPublications(List<ResearchGateArticle> topPublications)
	{
		this.topPublications = topPublications;
	}

	public List<ResearchGateInstitutionDepartment> getTopDepartments()
	{
		return topDepartments;
	}

  // lazy evaluation:
  public List<ResearchGateInstitutionDepartment> topDepartments()
  {
    if (topDepartments == null)
      topDepartments = new ArrayList<ResearchGateInstitutionDepartment>();
    return topDepartments;
  }

  // addTo:
  public void addToTopDepartments(ResearchGateInstitutionDepartment element)
  {
    topDepartments().add(element);
  }

  // size:
  public int topDepartmentsSize()
  {
    return topDepartments == null ? 0 : topDepartments.size();
  }

	public void setTopDepartments(List<ResearchGateInstitutionDepartment> topDepartments)
	{
		this.topDepartments = topDepartments;
	}

	public List<ResearchGateInstitution> getTopCollaborators()
	{
		return topCollaborators;
	}

  // lazy evaluation:
  public List<ResearchGateInstitution> topCollaborators()
  {
    if (topCollaborators == null)
      topCollaborators = new ArrayList<ResearchGateInstitution>();
    return topCollaborators;
  }

  // addTo:
  public void addToTopCollaborators(ResearchGateInstitution element)
  {
    topCollaborators().add(element);
  }

  // size:
  public int topCollaboratorsSize()
  {
    return topCollaborators == null ? 0 : topCollaborators.size();
  }

	public void setTopCollaborators(List<ResearchGateInstitution> topCollaborators)
	{
		this.topCollaborators = topCollaborators;
	}

	public List<ResearchGateAuthor> getTopMembers()
	{
		return topMembers;
	}

  // lazy evaluation:
  public List<ResearchGateAuthor> topMembers()
  {
    if (topMembers == null)
      topMembers = new ArrayList<ResearchGateAuthor>();
    return topMembers;
  }

  // addTo:
  public void addToTopMembers(ResearchGateAuthor element)
  {
    topMembers().add(element);
  }

  // size:
  public int topMembersSize()
  {
    return topMembers == null ? 0 : topMembers.size();
  }

	public void setTopMembers(List<ResearchGateAuthor> topMembers)
	{
		this.topMembers = topMembers;
	}

	public ResearchGateInstitutionContactInfo getContactInfo()
	{
		return contactInfo;
	}

	public void setContactInfo(ResearchGateInstitutionContactInfo contactInfo)
	{
		this.contactInfo = contactInfo;
	}

	public RichDocument getWebsite()
	{
		return website;
	}

	public void setWebsite(RichDocument website)
	{
		this.website = website;
	}

	public ResearchGateStats getStats()
	{
		return stats;
	}

	public void setStats(ResearchGateStats stats)
	{
		this.stats = stats;
	}
}
