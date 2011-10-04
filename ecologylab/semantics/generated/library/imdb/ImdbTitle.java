package ecologylab.semantics.generated.library.imdb;

import ecologylab.semantics.metadata.scalar.MetadataString;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.imdb.PersonDetails;
import ecologylab.semantics.generated.library.imdb.CastMember;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.imdb.Genre;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  ImdbTitle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
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
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString yearReleased;

	/** 
	 */ 
	@simpl_collection("person_details")	@mm_name("directors")
	private List<PersonDetails> directors;

	/** 
	 */ 
	@simpl_collection("person_details")	@mm_name("writers")
	private List<PersonDetails> writers;

	/** 
	 */ 
	@simpl_collection("cast_member")	@mm_name("cast")
	private List<CastMember> cast;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString rating;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString releaseDate;

	/** 
	 */ 
	@simpl_collection("genre")	@mm_name("genres")
	private List<Genre> genres;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString plot;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString tagline;

	/** 
	 */ 
	@simpl_collection("image")	@mm_name("title_photos")
	private List<Image> titlePhotos;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL posterImg;

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
		return this.yearReleased == null ? null : yearReleased().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getYearReleasedMetadata()
	{
		return yearReleased;
	}

	public void setYearReleased(String yearReleased)
	{
		if (yearReleased != null)
			this.yearReleased().setValue(yearReleased);
	}

	public void setYearReleasedMetadata(ecologylab.semantics.metadata.scalar.MetadataString yearReleased)
	{
		this.yearReleased = yearReleased;
	}

	public List<PersonDetails> getDirectors()
	{
		return directors;
	}

	public void setDirectors(List<PersonDetails> directors)
	{
		this.directors = directors;
	}

	public List<PersonDetails> getWriters()
	{
		return writers;
	}

	public void setWriters(List<PersonDetails> writers)
	{
		this.writers = writers;
	}

	public List<CastMember> getCast()
	{
		return cast;
	}

	public void setCast(List<CastMember> cast)
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
		return this.rating == null ? null : rating().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getRatingMetadata()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		if (rating != null)
			this.rating().setValue(rating);
	}

	public void setRatingMetadata(ecologylab.semantics.metadata.scalar.MetadataString rating)
	{
		this.rating = rating;
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
		return this.releaseDate == null ? null : releaseDate().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getReleaseDateMetadata()
	{
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate)
	{
		if (releaseDate != null)
			this.releaseDate().setValue(releaseDate);
	}

	public void setReleaseDateMetadata(ecologylab.semantics.metadata.scalar.MetadataString releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public List<Genre> getGenres()
	{
		return genres;
	}

	public void setGenres(List<Genre> genres)
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
		return this.plot == null ? null : plot().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPlotMetadata()
	{
		return plot;
	}

	public void setPlot(String plot)
	{
		if (plot != null)
			this.plot().setValue(plot);
	}

	public void setPlotMetadata(ecologylab.semantics.metadata.scalar.MetadataString plot)
	{
		this.plot = plot;
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
		return this.tagline == null ? null : tagline().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTaglineMetadata()
	{
		return tagline;
	}

	public void setTagline(String tagline)
	{
		if (tagline != null)
			this.tagline().setValue(tagline);
	}

	public void setTaglineMetadata(ecologylab.semantics.metadata.scalar.MetadataString tagline)
	{
		this.tagline = tagline;
	}

	public List<Image> getTitlePhotos()
	{
		return titlePhotos;
	}

	public void setTitlePhotos(List<Image> titlePhotos)
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
		return this.posterImg == null ? null : posterImg().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPosterImgMetadata()
	{
		return posterImg;
	}

	public void setPosterImg(ParsedURL posterImg)
	{
		if (posterImg != null)
			this.posterImg().setValue(posterImg);
	}

	public void setPosterImgMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL posterImg)
	{
		this.posterImg = posterImg;
	}
}
