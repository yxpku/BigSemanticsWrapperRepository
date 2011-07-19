package ecologylab.semantics.generated.library.imdb;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.imdb.MmdInlineGenreInGenresInImdbTitle;
import ecologylab.semantics.generated.library.imdb.PersonDetails;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.imdb.MmdInlineCastMemberInCastInImdbTitle;
import ecologylab.semantics.metadata.builtins.Image;

/**
*  ImdbTitle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * IMDB metadata
 */ 
@simpl_inherit
public class ImdbTitle extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString yearReleased;

	/** 
	 */ 
	@simpl_collection("person_details") @mm_name("directors")	private ArrayList<PersonDetails> directors;

	/** 
	 */ 
	@simpl_collection("person_details") @mm_name("writers")	private ArrayList<PersonDetails> writers;

	/** 
	 */ 
	@simpl_collection("cast_member") @mm_name("cast")	private ArrayList<MmdInlineCastMemberInCastInImdbTitle> cast;

	/** 
	 */ 
	@simpl_scalar	private MetadataString rating;

	/** 
	 */ 
	@simpl_scalar	private MetadataString releaseDate;

	/** 
	 */ 
	@simpl_collection("genre") @mm_name("genres")	private ArrayList<MmdInlineGenreInGenresInImdbTitle> genres;

	/** 
	 */ 
	@simpl_scalar	private MetadataString plot;

	/** 
	 */ 
	@simpl_scalar	private MetadataString tagline;

	/** 
	 */ 
	@simpl_collection("image") @mm_name("title_photos")	private ArrayList<Image> titlePhotos;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL posterImg;

	public ImdbTitle()
	{ }

	public ImdbTitle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	yearReleased()
	{
		MetadataString	result = this.yearReleased;
		if (result == null)
		{
			result = new MetadataString();
			this.yearReleased = result;
		}
		return result;
	}

	public String getYearReleased()
	{
		return this.yearReleased().getValue();
	}

	public void setYearReleased(String yearReleased)
	{
		this.yearReleased().setValue(yearReleased);
	}


	public ArrayList<PersonDetails> getDirectors()
	{
		return directors;
	}

	public void setDirectors(ArrayList<PersonDetails> directors)
	{
		this.directors = directors;
	}

	public ArrayList<PersonDetails> getWriters()
	{
		return writers;
	}

	public void setWriters(ArrayList<PersonDetails> writers)
	{
		this.writers = writers;
	}

	public ArrayList<MmdInlineCastMemberInCastInImdbTitle> getCast()
	{
		return cast;
	}

	public void setCast(ArrayList<MmdInlineCastMemberInCastInImdbTitle> cast)
	{
		this.cast = cast;
	}
	public MetadataString	rating()
	{
		MetadataString	result = this.rating;
		if (result == null)
		{
			result = new MetadataString();
			this.rating = result;
		}
		return result;
	}

	public String getRating()
	{
		return this.rating().getValue();
	}

	public void setRating(String rating)
	{
		this.rating().setValue(rating);
	}

	public MetadataString	releaseDate()
	{
		MetadataString	result = this.releaseDate;
		if (result == null)
		{
			result = new MetadataString();
			this.releaseDate = result;
		}
		return result;
	}

	public String getReleaseDate()
	{
		return this.releaseDate().getValue();
	}

	public void setReleaseDate(String releaseDate)
	{
		this.releaseDate().setValue(releaseDate);
	}


	public ArrayList<MmdInlineGenreInGenresInImdbTitle> getGenres()
	{
		return genres;
	}

	public void setGenres(ArrayList<MmdInlineGenreInGenresInImdbTitle> genres)
	{
		this.genres = genres;
	}
	public MetadataString	plot()
	{
		MetadataString	result = this.plot;
		if (result == null)
		{
			result = new MetadataString();
			this.plot = result;
		}
		return result;
	}

	public String getPlot()
	{
		return this.plot().getValue();
	}

	public void setPlot(String plot)
	{
		this.plot().setValue(plot);
	}

	public MetadataString	tagline()
	{
		MetadataString	result = this.tagline;
		if (result == null)
		{
			result = new MetadataString();
			this.tagline = result;
		}
		return result;
	}

	public String getTagline()
	{
		return this.tagline().getValue();
	}

	public void setTagline(String tagline)
	{
		this.tagline().setValue(tagline);
	}


	public ArrayList<Image> getTitlePhotos()
	{
		return titlePhotos;
	}

	public void setTitlePhotos(ArrayList<Image> titlePhotos)
	{
		this.titlePhotos = titlePhotos;
	}
	public MetadataParsedURL	posterImg()
	{
		MetadataParsedURL	result = this.posterImg;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.posterImg = result;
		}
		return result;
	}

	public ParsedURL getPosterImg()
	{
		return this.posterImg().getValue();
	}

	public void setPosterImg(ParsedURL posterImg)
	{
		this.posterImg().setValue(posterImg);
	}

}
