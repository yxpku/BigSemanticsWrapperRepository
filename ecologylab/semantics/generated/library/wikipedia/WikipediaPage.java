package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.wikipedia.WikipediaPageType;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  WikipediaPage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * An article on wikipedia (used in cF)
 */ 
@simpl_inherit
public class WikipediaPage extends WikipediaPageType
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL mainImageSrc;

	public WikipediaPage()
	{ }

	public WikipediaPage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	mainImageSrc()
	{
		MetadataParsedURL	result = this.mainImageSrc;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.mainImageSrc = result;
		}
		return result;
	}

	public ParsedURL getMainImageSrc()
	{
		return this.mainImageSrc == null ? null : mainImageSrc().getValue();
	}

	public MetadataParsedURL getMainImageSrcMetadata()
	{
		return mainImageSrc;
	}

	public void setMainImageSrc(ParsedURL mainImageSrc)
	{
		if (mainImageSrc != null)
			this.mainImageSrc().setValue(mainImageSrc);
	}

	public void setMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
	{
		this.mainImageSrc = mainImageSrc;
	}
}
