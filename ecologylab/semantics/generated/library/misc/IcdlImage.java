package ecologylab.semantics.generated.library.misc;

import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  IcdlImage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Image from The Interantional Children's digital library.
 */ 
@simpl_inherit
public class IcdlImage extends Image
{
	/** 
	 * The language of the library
	 */ 
	@simpl_scalar	private MetadataString languages;

	public IcdlImage()
	{ }

	public IcdlImage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages().getValue();
	}

	public void setLanguages(String languages)
	{
		this.languages().setValue(languages);
	}

}
