package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.artwork.Artist;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Artwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Artwork class
 */ 
@simpl_inherit
public class Artwork extends CompoundDocument
{
	/** 
	 * Set of artists.
	 */ 
	@simpl_collection("artist") @mm_name("artists")	private List<Artist> artists;

	/** 
	 * Medium on which the work is done.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString medium;

	/** 
	 * Abstract of the work.
	 */ 
	@simpl_scalar	@xml_tag("abstract")	private ecologylab.semantics.metadata.scalar.MetadataString abstractField;

	/** 
	 * Year the work was created.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString year;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString dimensions;

	public Artwork()
	{ }

	public Artwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Artist> getArtists()
	{
		return artists;
	}

	public void setArtists(List<Artist> artists)
	{
		this.artists = artists;
	}

	public MetadataString	medium()
	{
		MetadataString	result = this.medium;
		if (result == null)
		{
			result = new MetadataString();
			this.medium = result;
		}
		return result;
	}

	public String getMedium()
	{
		return this.medium == null ? null : medium().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getMediumMetadata()
	{
		return medium;
	}

	public void setMedium(String medium)
	{
		if (medium != null)
			this.medium().setValue(medium);
	}

	public void setMediumMetadata(ecologylab.semantics.metadata.scalar.MetadataString medium)
	{
		this.medium = medium;
	}

	public MetadataString	abstractField()
	{
		MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public String getAbstractField()
	{
		return this.abstractField == null ? null : abstractField().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		if (abstractField != null)
			this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(ecologylab.semantics.metadata.scalar.MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public MetadataString	year()
	{
		MetadataString	result = this.year;
		if (result == null)
		{
			result = new MetadataString();
			this.year = result;
		}
		return result;
	}

	public String getYear()
	{
		return this.year == null ? null : year().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getYearMetadata()
	{
		return year;
	}

	public void setYear(String year)
	{
		if (year != null)
			this.year().setValue(year);
	}

	public void setYearMetadata(ecologylab.semantics.metadata.scalar.MetadataString year)
	{
		this.year = year;
	}

	public MetadataString	dimensions()
	{
		MetadataString	result = this.dimensions;
		if (result == null)
		{
			result = new MetadataString();
			this.dimensions = result;
		}
		return result;
	}

	public String getDimensions()
	{
		return this.dimensions == null ? null : dimensions().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDimensionsMetadata()
	{
		return dimensions;
	}

	public void setDimensions(String dimensions)
	{
		if (dimensions != null)
			this.dimensions().setValue(dimensions);
	}

	public void setDimensionsMetadata(ecologylab.semantics.metadata.scalar.MetadataString dimensions)
	{
		this.dimensions = dimensions;
	}
}
