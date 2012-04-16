package ecologylab.semantics.generated.library.imdb;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.imdb.BirthDetail;
import ecologylab.semantics.generated.library.imdb.ImdbTitle;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *IMDB metadata
 */ 
@simpl_inherit
public class PersonDetails extends CompoundDocument
{
	@simpl_scalar
	private MetadataString gist;

	@simpl_scalar
	private MetadataParsedURL personImg;

	@simpl_composite
	@mm_name("birth_detail")
	private BirthDetail birthDetail;

	@simpl_scalar
	private MetadataString miniBiography;

	@simpl_scalar
	private MetadataParsedURL biographyLink;

	@simpl_collection("imdb_title")
	@mm_name("titles_as_actor")
	private List<ImdbTitle> titlesAsActor;

	@simpl_collection("imdb_title")
	@mm_name("titles_as_actress")
	private List<ImdbTitle> titlesAsActress;

	@simpl_collection("imdb_title")
	@mm_name("titles_as_director")
	private List<ImdbTitle> titlesAsDirector;

	@simpl_collection("imdb_title")
	@mm_name("titles_for_soundtrack")
	private List<ImdbTitle> titlesForSoundtrack;

	@simpl_collection("imdb_title")
	@mm_name("titles_as_producer")
	private List<ImdbTitle> titlesAsProducer;

	@simpl_collection("imdb_title")
	@mm_name("titles_thanked_in")
	private List<ImdbTitle> titlesThankedIn;

	@simpl_collection("imdb_title")
	@mm_name("titles_as_self")
	private List<ImdbTitle> titlesAsSelf;

	public PersonDetails()
	{ super(); }

	public PersonDetails(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	gist()
	{
		MetadataString	result = this.gist;
		if (result == null)
		{
			result = new MetadataString();
			this.gist = result;
		}
		return result;
	}

	public String getGist()
	{
		return this.gist == null ? null : gist().getValue();
	}

	public MetadataString getGistMetadata()
	{
		return gist;
	}

	public void setGist(String gist)
	{
		if (gist != null)
			this.gist().setValue(gist);
	}

	public void setGistMetadata(MetadataString gist)
	{
		this.gist = gist;
	}

	public MetadataParsedURL	personImg()
	{
		MetadataParsedURL	result = this.personImg;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.personImg = result;
		}
		return result;
	}

	public ParsedURL getPersonImg()
	{
		return this.personImg == null ? null : personImg().getValue();
	}

	public MetadataParsedURL getPersonImgMetadata()
	{
		return personImg;
	}

	public void setPersonImg(ParsedURL personImg)
	{
		if (personImg != null)
			this.personImg().setValue(personImg);
	}

	public void setPersonImgMetadata(MetadataParsedURL personImg)
	{
		this.personImg = personImg;
	}

	public BirthDetail getBirthDetail()
	{
		return birthDetail;
	}

	public void setBirthDetail(BirthDetail birthDetail)
	{
		this.birthDetail = birthDetail;
	}

	public MetadataString	miniBiography()
	{
		MetadataString	result = this.miniBiography;
		if (result == null)
		{
			result = new MetadataString();
			this.miniBiography = result;
		}
		return result;
	}

	public String getMiniBiography()
	{
		return this.miniBiography == null ? null : miniBiography().getValue();
	}

	public MetadataString getMiniBiographyMetadata()
	{
		return miniBiography;
	}

	public void setMiniBiography(String miniBiography)
	{
		if (miniBiography != null)
			this.miniBiography().setValue(miniBiography);
	}

	public void setMiniBiographyMetadata(MetadataString miniBiography)
	{
		this.miniBiography = miniBiography;
	}

	public MetadataParsedURL	biographyLink()
	{
		MetadataParsedURL	result = this.biographyLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.biographyLink = result;
		}
		return result;
	}

	public ParsedURL getBiographyLink()
	{
		return this.biographyLink == null ? null : biographyLink().getValue();
	}

	public MetadataParsedURL getBiographyLinkMetadata()
	{
		return biographyLink;
	}

	public void setBiographyLink(ParsedURL biographyLink)
	{
		if (biographyLink != null)
			this.biographyLink().setValue(biographyLink);
	}

	public void setBiographyLinkMetadata(MetadataParsedURL biographyLink)
	{
		this.biographyLink = biographyLink;
	}

	public List<ImdbTitle> getTitlesAsActor()
	{
		return titlesAsActor;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesAsActor()
  {
    if (titlesAsActor == null)
      titlesAsActor = new ArrayList<ImdbTitle>();
    return titlesAsActor;
  }

  // addTo:
  public void addToTitlesAsActor(ImdbTitle element)
  {
    titlesAsActor().add(element);
  }

  // size:
  public int titlesAsActorSize()
  {
    return titlesAsActor == null ? 0 : titlesAsActor.size();
  }

	public void setTitlesAsActor(List<ImdbTitle> titlesAsActor)
	{
		this.titlesAsActor = titlesAsActor;
	}

	public List<ImdbTitle> getTitlesAsActress()
	{
		return titlesAsActress;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesAsActress()
  {
    if (titlesAsActress == null)
      titlesAsActress = new ArrayList<ImdbTitle>();
    return titlesAsActress;
  }

  // addTo:
  public void addToTitlesAsActress(ImdbTitle element)
  {
    titlesAsActress().add(element);
  }

  // size:
  public int titlesAsActressSize()
  {
    return titlesAsActress == null ? 0 : titlesAsActress.size();
  }

	public void setTitlesAsActress(List<ImdbTitle> titlesAsActress)
	{
		this.titlesAsActress = titlesAsActress;
	}

	public List<ImdbTitle> getTitlesAsDirector()
	{
		return titlesAsDirector;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesAsDirector()
  {
    if (titlesAsDirector == null)
      titlesAsDirector = new ArrayList<ImdbTitle>();
    return titlesAsDirector;
  }

  // addTo:
  public void addToTitlesAsDirector(ImdbTitle element)
  {
    titlesAsDirector().add(element);
  }

  // size:
  public int titlesAsDirectorSize()
  {
    return titlesAsDirector == null ? 0 : titlesAsDirector.size();
  }

	public void setTitlesAsDirector(List<ImdbTitle> titlesAsDirector)
	{
		this.titlesAsDirector = titlesAsDirector;
	}

	public List<ImdbTitle> getTitlesForSoundtrack()
	{
		return titlesForSoundtrack;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesForSoundtrack()
  {
    if (titlesForSoundtrack == null)
      titlesForSoundtrack = new ArrayList<ImdbTitle>();
    return titlesForSoundtrack;
  }

  // addTo:
  public void addToTitlesForSoundtrack(ImdbTitle element)
  {
    titlesForSoundtrack().add(element);
  }

  // size:
  public int titlesForSoundtrackSize()
  {
    return titlesForSoundtrack == null ? 0 : titlesForSoundtrack.size();
  }

	public void setTitlesForSoundtrack(List<ImdbTitle> titlesForSoundtrack)
	{
		this.titlesForSoundtrack = titlesForSoundtrack;
	}

	public List<ImdbTitle> getTitlesAsProducer()
	{
		return titlesAsProducer;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesAsProducer()
  {
    if (titlesAsProducer == null)
      titlesAsProducer = new ArrayList<ImdbTitle>();
    return titlesAsProducer;
  }

  // addTo:
  public void addToTitlesAsProducer(ImdbTitle element)
  {
    titlesAsProducer().add(element);
  }

  // size:
  public int titlesAsProducerSize()
  {
    return titlesAsProducer == null ? 0 : titlesAsProducer.size();
  }

	public void setTitlesAsProducer(List<ImdbTitle> titlesAsProducer)
	{
		this.titlesAsProducer = titlesAsProducer;
	}

	public List<ImdbTitle> getTitlesThankedIn()
	{
		return titlesThankedIn;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesThankedIn()
  {
    if (titlesThankedIn == null)
      titlesThankedIn = new ArrayList<ImdbTitle>();
    return titlesThankedIn;
  }

  // addTo:
  public void addToTitlesThankedIn(ImdbTitle element)
  {
    titlesThankedIn().add(element);
  }

  // size:
  public int titlesThankedInSize()
  {
    return titlesThankedIn == null ? 0 : titlesThankedIn.size();
  }

	public void setTitlesThankedIn(List<ImdbTitle> titlesThankedIn)
	{
		this.titlesThankedIn = titlesThankedIn;
	}

	public List<ImdbTitle> getTitlesAsSelf()
	{
		return titlesAsSelf;
	}

  // lazy evaluation:
  public List<ImdbTitle> titlesAsSelf()
  {
    if (titlesAsSelf == null)
      titlesAsSelf = new ArrayList<ImdbTitle>();
    return titlesAsSelf;
  }

  // addTo:
  public void addToTitlesAsSelf(ImdbTitle element)
  {
    titlesAsSelf().add(element);
  }

  // size:
  public int titlesAsSelfSize()
  {
    return titlesAsSelf == null ? 0 : titlesAsSelf.size();
  }

	public void setTitlesAsSelf(List<ImdbTitle> titlesAsSelf)
	{
		this.titlesAsSelf = titlesAsSelf;
	}
}