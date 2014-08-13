package ecologylab.bigsemantics.generated.library.openDNS;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *openDNS tags for a domain
 */ 
@simpl_inherit
@simpl_tag("openDNSDomain")
public class OpenDNSDomain extends CompoundDocument
{
	@simpl_scalar
	private MetadataString domain;

	public OpenDNSDomain()
	{ super(); }

	public OpenDNSDomain(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	domain()
	{
		MetadataString	result = this.domain;
		if (result == null)
		{
			result = new MetadataString();
			this.domain = result;
		}
		return result;
	}

	public String getDomain()
	{
		return this.domain == null ? null : domain().getValue();
	}

	public MetadataString getDomainMetadata()
	{
		return domain;
	}

	public void setDomain(String domain)
	{
		if (domain != null)
			this.domain().setValue(domain);
	}

	public void setDomainMetadata(MetadataString domain)
	{
		this.domain = domain;
	}
}
