package ecologylab.semantics.generated.library.nsdl;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MmdInlineHeaderInNsdlDocument.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineHeaderInNsdlDocument extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("resourceIdentifier")	private MetadataParsedURL resourceIdentifier;

	public MmdInlineHeaderInNsdlDocument()
	{ }

	public MmdInlineHeaderInNsdlDocument(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	resourceIdentifier()
	{
		MetadataParsedURL	result = this.resourceIdentifier;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.resourceIdentifier = result;
		}
		return result;
	}

	public ParsedURL getResourceIdentifier()
	{
		return this.resourceIdentifier().getValue();
	}

	public void setResourceIdentifier(ParsedURL resourceIdentifier)
	{
		this.resourceIdentifier().setValue(resourceIdentifier);
	}

}
