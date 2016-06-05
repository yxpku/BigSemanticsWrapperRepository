package ecologylab.bigsemantics.generated.library.creativeWork.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GettyWorkInfo extends RichDocument
{
	@simpl_scalar
	private MetadataString authorName;

	@simpl_scalar
	private MetadataString dateAndLocation;

	@simpl_scalar
	private MetadataString medium;

	@simpl_scalar
	private MetadataString dimensions;

	@simpl_scalar
	private MetadataString museumCode;

	public GettyWorkInfo()
	{ super(); }

	public GettyWorkInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	authorName()
	{
		MetadataString	result = this.authorName;
		if (result == null)
		{
			result = new MetadataString();
			this.authorName = result;
		}
		return result;
	}

	public String getAuthorName()
	{
		return this.authorName == null ? null : authorName().getValue();
	}

	public MetadataString getAuthorNameMetadata()
	{
		return authorName;
	}

	public void setAuthorName(String authorName)
	{
		if (authorName != null)
			this.authorName().setValue(authorName);
	}

	public void setAuthorNameMetadata(MetadataString authorName)
	{
		this.authorName = authorName;
	}

	public MetadataString	dateAndLocation()
	{
		MetadataString	result = this.dateAndLocation;
		if (result == null)
		{
			result = new MetadataString();
			this.dateAndLocation = result;
		}
		return result;
	}

	public String getDateAndLocation()
	{
		return this.dateAndLocation == null ? null : dateAndLocation().getValue();
	}

	public MetadataString getDateAndLocationMetadata()
	{
		return dateAndLocation;
	}

	public void setDateAndLocation(String dateAndLocation)
	{
		if (dateAndLocation != null)
			this.dateAndLocation().setValue(dateAndLocation);
	}

	public void setDateAndLocationMetadata(MetadataString dateAndLocation)
	{
		this.dateAndLocation = dateAndLocation;
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

	public MetadataString getMediumMetadata()
	{
		return medium;
	}

	public void setMedium(String medium)
	{
		if (medium != null)
			this.medium().setValue(medium);
	}

	public void setMediumMetadata(MetadataString medium)
	{
		this.medium = medium;
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

	public MetadataString getDimensionsMetadata()
	{
		return dimensions;
	}

	public void setDimensions(String dimensions)
	{
		if (dimensions != null)
			this.dimensions().setValue(dimensions);
	}

	public void setDimensionsMetadata(MetadataString dimensions)
	{
		this.dimensions = dimensions;
	}

	public MetadataString	museumCode()
	{
		MetadataString	result = this.museumCode;
		if (result == null)
		{
			result = new MetadataString();
			this.museumCode = result;
		}
		return result;
	}

	public String getMuseumCode()
	{
		return this.museumCode == null ? null : museumCode().getValue();
	}

	public MetadataString getMuseumCodeMetadata()
	{
		return museumCode;
	}

	public void setMuseumCode(String museumCode)
	{
		if (museumCode != null)
			this.museumCode().setValue(museumCode);
	}

	public void setMuseumCodeMetadata(MetadataString museumCode)
	{
		this.museumCode = museumCode;
	}
}
