package ecologylab.bigsemantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.dlese.Educational;
import ecologylab.bigsemantics.generated.library.dlese.General;
import ecologylab.bigsemantics.generated.library.dlese.Lifecycle;
import ecologylab.bigsemantics.generated.library.dlese.RecordMetaMetadata;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ItemRecord extends Metadata
{
	@simpl_composite
	@mm_name("record_meta_metadata")
	private RecordMetaMetadata recordMetaMetadata;

	@simpl_scalar
	@simpl_other_tags({"xsi:schemaLocation"})
	private MetadataParsedURL location;

	@simpl_composite
	@mm_name("lifecycle")
	private Lifecycle lifecycle;

	@simpl_composite
	@mm_name("educational")
	private Educational educational;

	@simpl_composite
	@mm_name("general")
	private General general;

	public ItemRecord()
	{ super(); }

	public ItemRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public RecordMetaMetadata getRecordMetaMetadata()
	{
		return recordMetaMetadata;
	}

	public void setRecordMetaMetadata(RecordMetaMetadata recordMetaMetadata)
	{
		this.recordMetaMetadata = recordMetaMetadata;
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

	public Lifecycle getLifecycle()
	{
		return lifecycle;
	}

	public void setLifecycle(Lifecycle lifecycle)
	{
		this.lifecycle = lifecycle;
	}

	public Educational getEducational()
	{
		return educational;
	}

	public void setEducational(Educational educational)
	{
		this.educational = educational;
	}

	public General getGeneral()
	{
		return general;
	}

	public void setGeneral(General general)
	{
		this.general = general;
	}
}
