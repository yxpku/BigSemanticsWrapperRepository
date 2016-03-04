package ecologylab.bigsemantics.generated.library.creativeWork.collaborative;

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
public class Commit extends RichDocument
{
	@simpl_scalar
	private MetadataString time;

	@simpl_scalar
	private MetadataString message;

	@simpl_scalar
	private MetadataString shortHashKey;

	@simpl_scalar
	private MetadataString contributor;

	public Commit()
	{ super(); }

	public Commit(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	time()
	{
		MetadataString	result = this.time;
		if (result == null)
		{
			result = new MetadataString();
			this.time = result;
		}
		return result;
	}

	public String getTime()
	{
		return this.time == null ? null : time().getValue();
	}

	public MetadataString getTimeMetadata()
	{
		return time;
	}

	public void setTime(String time)
	{
		if (time != null)
			this.time().setValue(time);
	}

	public void setTimeMetadata(MetadataString time)
	{
		this.time = time;
	}

	public MetadataString	message()
	{
		MetadataString	result = this.message;
		if (result == null)
		{
			result = new MetadataString();
			this.message = result;
		}
		return result;
	}

	public String getMessage()
	{
		return this.message == null ? null : message().getValue();
	}

	public MetadataString getMessageMetadata()
	{
		return message;
	}

	public void setMessage(String message)
	{
		if (message != null)
			this.message().setValue(message);
	}

	public void setMessageMetadata(MetadataString message)
	{
		this.message = message;
	}

	public MetadataString	shortHashKey()
	{
		MetadataString	result = this.shortHashKey;
		if (result == null)
		{
			result = new MetadataString();
			this.shortHashKey = result;
		}
		return result;
	}

	public String getShortHashKey()
	{
		return this.shortHashKey == null ? null : shortHashKey().getValue();
	}

	public MetadataString getShortHashKeyMetadata()
	{
		return shortHashKey;
	}

	public void setShortHashKey(String shortHashKey)
	{
		if (shortHashKey != null)
			this.shortHashKey().setValue(shortHashKey);
	}

	public void setShortHashKeyMetadata(MetadataString shortHashKey)
	{
		this.shortHashKey = shortHashKey;
	}

	public MetadataString	contributor()
	{
		MetadataString	result = this.contributor;
		if (result == null)
		{
			result = new MetadataString();
			this.contributor = result;
		}
		return result;
	}

	public String getContributor()
	{
		return this.contributor == null ? null : contributor().getValue();
	}

	public MetadataString getContributorMetadata()
	{
		return contributor;
	}

	public void setContributor(String contributor)
	{
		if (contributor != null)
			this.contributor().setValue(contributor);
	}

	public void setContributorMetadata(MetadataString contributor)
	{
		this.contributor = contributor;
	}
}
