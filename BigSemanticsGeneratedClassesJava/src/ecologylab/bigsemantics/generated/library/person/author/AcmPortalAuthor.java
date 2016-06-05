package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.AcmPortalInstitutionProfile;
import ecologylab.bigsemantics.generated.library.person.author.AcmPortalAuthorCollaborators;
import ecologylab.bigsemantics.generated.library.person.author.AcmPortalAuthorPublicationDetail;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AcmPortalAuthor extends Author
{
	@simpl_composite
	@mm_name("publication_detail")
	private AcmPortalAuthorPublicationDetail publicationDetail;

	@simpl_composite
	@mm_name("collaborators")
	private AcmPortalAuthorCollaborators collaborators;

	@simpl_collection("acm_portal_institution_profile")
	@mm_name("affiliations")
	private List<AcmPortalInstitutionProfile> affiliations;

	public AcmPortalAuthor()
	{ super(); }

	public AcmPortalAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public AcmPortalAuthorPublicationDetail getPublicationDetail()
	{
		return publicationDetail;
	}

	public void setPublicationDetail(AcmPortalAuthorPublicationDetail publicationDetail)
	{
		this.publicationDetail = publicationDetail;
	}

	public AcmPortalAuthorCollaborators getCollaborators()
	{
		return collaborators;
	}

	public void setCollaborators(AcmPortalAuthorCollaborators collaborators)
	{
		this.collaborators = collaborators;
	}

	public List<AcmPortalInstitutionProfile> getAffiliations()
	{
		return affiliations;
	}

  // lazy evaluation:
  public List<AcmPortalInstitutionProfile> affiliations()
  {
    if (affiliations == null)
      affiliations = new ArrayList<AcmPortalInstitutionProfile>();
    return affiliations;
  }

  // addTo:
  public void addToAffiliations(AcmPortalInstitutionProfile element)
  {
    affiliations().add(element);
  }

  // size:
  public int affiliationsSize()
  {
    return affiliations == null ? 0 : affiliations.size();
  }

	public void setAffiliations(List<AcmPortalInstitutionProfile> affiliations)
	{
		this.affiliations = affiliations;
	}
}
