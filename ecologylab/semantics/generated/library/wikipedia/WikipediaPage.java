package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  WikipediaPage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
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
	@simpl_scalar	private MetadataParsedURL mainImageSrc;

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
		return this.mainImageSrc().getValue();
	}

	public void setMainImageSrc(ParsedURL mainImageSrc)
	{
		this.mainImageSrc().setValue(mainImageSrc);
	}

}
