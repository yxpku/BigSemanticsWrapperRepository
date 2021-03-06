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
public class IssueComment extends RichDocument
{
	@simpl_scalar
	private MetadataString message;

	@simpl_scalar
	private MetadataString date;

	@simpl_scalar
	private MetadataString contributor;

	public IssueComment()
	{ super(); }

	public IssueComment(MetaMetadataCompositeField mmd) {
		super(mmd);
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

	public MetadataString	date()
	{
		MetadataString	result = this.date;
		if (result == null)
		{
			result = new MetadataString();
			this.date = result;
		}
		return result;
	}

	public String getDate()
	{
		return this.date == null ? null : date().getValue();
	}

	public MetadataString getDateMetadata()
	{
		return date;
	}

	public void setDate(String date)
	{
		if (date != null)
			this.date().setValue(date);
	}

	public void setDateMetadata(MetadataString date)
	{
		this.date = date;
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
