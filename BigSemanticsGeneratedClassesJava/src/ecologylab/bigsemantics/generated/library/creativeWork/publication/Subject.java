package ecologylab.bigsemantics.generated.library.creativeWork.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Subject extends Metadata
{
	@simpl_scalar
	@simpl_composite_as_scalar
	private MetadataString subject;

	@simpl_scalar
	private MetadataParsedURL location;

	public Subject()
	{ super(); }

	public Subject(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	subject()
	{
		MetadataString	result = this.subject;
		if (result == null)
		{
			result = new MetadataString();
			this.subject = result;
		}
		return result;
	}

	public String getSubject()
	{
		return this.subject == null ? null : subject().getValue();
	}

	public MetadataString getSubjectMetadata()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		if (subject != null)
			this.subject().setValue(subject);
	}

	public void setSubjectMetadata(MetadataString subject)
	{
		this.subject = subject;
	}

	public MetadataParsedURL	location()
	{
		MetadataParsedURL	result = this.location;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.location = result;
		}
		return result;
	}

	public ParsedURL getLocation()
	{
		return this.location == null ? null : location().getValue();
	}

	public MetadataParsedURL getLocationMetadata()
	{
		return location;
	}

	public void setLocation(ParsedURL location)
	{
		if (location != null)
			this.location().setValue(location);
	}

	public void setLocationMetadata(MetadataParsedURL location)
	{
		this.location = location;
	}
}
