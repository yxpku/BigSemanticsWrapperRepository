package ecologylab.bigsemantics.generated.library.creativeWork.collaborative;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SourceItem extends Document
{
	@simpl_scalar
	private MetadataString fileName;

	@simpl_scalar
	private MetadataString lastCommitMessage;

	@simpl_scalar
	private MetadataString lastUpdated;

	public SourceItem()
	{ super(); }

	public SourceItem(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	fileName()
	{
		MetadataString	result = this.fileName;
		if (result == null)
		{
			result = new MetadataString();
			this.fileName = result;
		}
		return result;
	}

	public String getFileName()
	{
		return this.fileName == null ? null : fileName().getValue();
	}

	public MetadataString getFileNameMetadata()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		if (fileName != null)
			this.fileName().setValue(fileName);
	}

	public void setFileNameMetadata(MetadataString fileName)
	{
		this.fileName = fileName;
	}

	public MetadataString	lastCommitMessage()
	{
		MetadataString	result = this.lastCommitMessage;
		if (result == null)
		{
			result = new MetadataString();
			this.lastCommitMessage = result;
		}
		return result;
	}

	public String getLastCommitMessage()
	{
		return this.lastCommitMessage == null ? null : lastCommitMessage().getValue();
	}

	public MetadataString getLastCommitMessageMetadata()
	{
		return lastCommitMessage;
	}

	public void setLastCommitMessage(String lastCommitMessage)
	{
		if (lastCommitMessage != null)
			this.lastCommitMessage().setValue(lastCommitMessage);
	}

	public void setLastCommitMessageMetadata(MetadataString lastCommitMessage)
	{
		this.lastCommitMessage = lastCommitMessage;
	}

	public MetadataString	lastUpdated()
	{
		MetadataString	result = this.lastUpdated;
		if (result == null)
		{
			result = new MetadataString();
			this.lastUpdated = result;
		}
		return result;
	}

	public String getLastUpdated()
	{
		return this.lastUpdated == null ? null : lastUpdated().getValue();
	}

	public MetadataString getLastUpdatedMetadata()
	{
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated)
	{
		if (lastUpdated != null)
			this.lastUpdated().setValue(lastUpdated);
	}

	public void setLastUpdatedMetadata(MetadataString lastUpdated)
	{
		this.lastUpdated = lastUpdated;
	}
}
