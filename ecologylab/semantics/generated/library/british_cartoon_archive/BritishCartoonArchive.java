package ecologylab.semantics.generated.library.british_cartoon_archive;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.Date;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  BritishCartoonArchive.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/04/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * This MMD was initially generated by the browser authoring tool
 */ 
@simpl_inherit
public class BritishCartoonArchive extends Document
{
	/** 
	 * Name of the artist, and period he lived
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString artist;

	/** 
	 * Name of the publication in which the cartoon appeared
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString publishedIn;

	/** 
	 * Date of the publication
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataDate publicationDate;

	/** 
	 * Format of the publication
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString publicationFormat;

	/** 
	 * Cartoon Caption
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString caption;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString referenceNumber;

	/** 
	 * url of the image
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString imgLocation;

	public BritishCartoonArchive()
	{ }

	public BritishCartoonArchive(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	artist()
	{
		MetadataString	result = this.artist;
		if (result == null)
		{
			result = new MetadataString();
			this.artist = result;
		}
		return result;
	}

	public String getArtist()
	{
		return this.artist == null ? null : artist().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getArtistMetadata()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		if (artist != null)
			this.artist().setValue(artist);
	}

	public void setArtistMetadata(ecologylab.semantics.metadata.scalar.MetadataString artist)
	{
		this.artist = artist;
	}

	public MetadataString	publishedIn()
	{
		MetadataString	result = this.publishedIn;
		if (result == null)
		{
			result = new MetadataString();
			this.publishedIn = result;
		}
		return result;
	}

	public String getPublishedIn()
	{
		return this.publishedIn == null ? null : publishedIn().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPublishedInMetadata()
	{
		return publishedIn;
	}

	public void setPublishedIn(String publishedIn)
	{
		if (publishedIn != null)
			this.publishedIn().setValue(publishedIn);
	}

	public void setPublishedInMetadata(ecologylab.semantics.metadata.scalar.MetadataString publishedIn)
	{
		this.publishedIn = publishedIn;
	}

	public MetadataDate	publicationDate()
	{
		MetadataDate	result = this.publicationDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.publicationDate = result;
		}
		return result;
	}

	public Date getPublicationDate()
	{
		return this.publicationDate == null ? null : publicationDate().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDate getPublicationDateMetadata()
	{
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate)
	{
		if (publicationDate != null)
			this.publicationDate().setValue(publicationDate);
	}

	public void setPublicationDateMetadata(ecologylab.semantics.metadata.scalar.MetadataDate publicationDate)
	{
		this.publicationDate = publicationDate;
	}

	public MetadataString	publicationFormat()
	{
		MetadataString	result = this.publicationFormat;
		if (result == null)
		{
			result = new MetadataString();
			this.publicationFormat = result;
		}
		return result;
	}

	public String getPublicationFormat()
	{
		return this.publicationFormat == null ? null : publicationFormat().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPublicationFormatMetadata()
	{
		return publicationFormat;
	}

	public void setPublicationFormat(String publicationFormat)
	{
		if (publicationFormat != null)
			this.publicationFormat().setValue(publicationFormat);
	}

	public void setPublicationFormatMetadata(ecologylab.semantics.metadata.scalar.MetadataString publicationFormat)
	{
		this.publicationFormat = publicationFormat;
	}

	public MetadataString	caption()
	{
		MetadataString	result = this.caption;
		if (result == null)
		{
			result = new MetadataString();
			this.caption = result;
		}
		return result;
	}

	public String getCaption()
	{
		return this.caption == null ? null : caption().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCaptionMetadata()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		if (caption != null)
			this.caption().setValue(caption);
	}

	public void setCaptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString caption)
	{
		this.caption = caption;
	}

	public MetadataString	referenceNumber()
	{
		MetadataString	result = this.referenceNumber;
		if (result == null)
		{
			result = new MetadataString();
			this.referenceNumber = result;
		}
		return result;
	}

	public String getReferenceNumber()
	{
		return this.referenceNumber == null ? null : referenceNumber().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getReferenceNumberMetadata()
	{
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber)
	{
		if (referenceNumber != null)
			this.referenceNumber().setValue(referenceNumber);
	}

	public void setReferenceNumberMetadata(ecologylab.semantics.metadata.scalar.MetadataString referenceNumber)
	{
		this.referenceNumber = referenceNumber;
	}

	public MetadataString	imgLocation()
	{
		MetadataString	result = this.imgLocation;
		if (result == null)
		{
			result = new MetadataString();
			this.imgLocation = result;
		}
		return result;
	}

	public String getImgLocation()
	{
		return this.imgLocation == null ? null : imgLocation().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getImgLocationMetadata()
	{
		return imgLocation;
	}

	public void setImgLocation(String imgLocation)
	{
		if (imgLocation != null)
			this.imgLocation().setValue(imgLocation);
	}

	public void setImgLocationMetadata(ecologylab.semantics.metadata.scalar.MetadataString imgLocation)
	{
		this.imgLocation = imgLocation;
	}
}
