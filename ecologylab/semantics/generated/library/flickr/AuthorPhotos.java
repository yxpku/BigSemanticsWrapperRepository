package ecologylab.semantics.generated.library.flickr;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  AuthorPhotos.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class AuthorPhotos extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL authorPhotostreamLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataString authorPhotostream;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL photosThatDayLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL photosThatMonthLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL photosThatYearLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataString photosThatDay;

	/** 
	 */ 
	@simpl_scalar	private MetadataString photosThatMonth;

	/** 
	 */ 
	@simpl_scalar	private MetadataString photosThatYear;

	public AuthorPhotos()
	{ }

	public AuthorPhotos(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	authorPhotostreamLink()
	{
		MetadataParsedURL	result = this.authorPhotostreamLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.authorPhotostreamLink = result;
		}
		return result;
	}

	public ParsedURL getAuthorPhotostreamLink()
	{
		return this.authorPhotostreamLink().getValue();
	}

	public void setAuthorPhotostreamLink(ParsedURL authorPhotostreamLink)
	{
		this.authorPhotostreamLink().setValue(authorPhotostreamLink);
	}

	public MetadataString	authorPhotostream()
	{
		MetadataString	result = this.authorPhotostream;
		if (result == null)
		{
			result = new MetadataString();
			this.authorPhotostream = result;
		}
		return result;
	}

	public String getAuthorPhotostream()
	{
		return this.authorPhotostream().getValue();
	}

	public void setAuthorPhotostream(String authorPhotostream)
	{
		this.authorPhotostream().setValue(authorPhotostream);
	}

	public MetadataParsedURL	photosThatDayLink()
	{
		MetadataParsedURL	result = this.photosThatDayLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.photosThatDayLink = result;
		}
		return result;
	}

	public ParsedURL getPhotosThatDayLink()
	{
		return this.photosThatDayLink().getValue();
	}

	public void setPhotosThatDayLink(ParsedURL photosThatDayLink)
	{
		this.photosThatDayLink().setValue(photosThatDayLink);
	}

	public MetadataParsedURL	photosThatMonthLink()
	{
		MetadataParsedURL	result = this.photosThatMonthLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.photosThatMonthLink = result;
		}
		return result;
	}

	public ParsedURL getPhotosThatMonthLink()
	{
		return this.photosThatMonthLink().getValue();
	}

	public void setPhotosThatMonthLink(ParsedURL photosThatMonthLink)
	{
		this.photosThatMonthLink().setValue(photosThatMonthLink);
	}

	public MetadataParsedURL	photosThatYearLink()
	{
		MetadataParsedURL	result = this.photosThatYearLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.photosThatYearLink = result;
		}
		return result;
	}

	public ParsedURL getPhotosThatYearLink()
	{
		return this.photosThatYearLink().getValue();
	}

	public void setPhotosThatYearLink(ParsedURL photosThatYearLink)
	{
		this.photosThatYearLink().setValue(photosThatYearLink);
	}

	public MetadataString	photosThatDay()
	{
		MetadataString	result = this.photosThatDay;
		if (result == null)
		{
			result = new MetadataString();
			this.photosThatDay = result;
		}
		return result;
	}

	public String getPhotosThatDay()
	{
		return this.photosThatDay().getValue();
	}

	public void setPhotosThatDay(String photosThatDay)
	{
		this.photosThatDay().setValue(photosThatDay);
	}

	public MetadataString	photosThatMonth()
	{
		MetadataString	result = this.photosThatMonth;
		if (result == null)
		{
			result = new MetadataString();
			this.photosThatMonth = result;
		}
		return result;
	}

	public String getPhotosThatMonth()
	{
		return this.photosThatMonth().getValue();
	}

	public void setPhotosThatMonth(String photosThatMonth)
	{
		this.photosThatMonth().setValue(photosThatMonth);
	}

	public MetadataString	photosThatYear()
	{
		MetadataString	result = this.photosThatYear;
		if (result == null)
		{
			result = new MetadataString();
			this.photosThatYear = result;
		}
		return result;
	}

	public String getPhotosThatYear()
	{
		return this.photosThatYear().getValue();
	}

	public void setPhotosThatYear(String photosThatYear)
	{
		this.photosThatYear().setValue(photosThatYear);
	}

}
