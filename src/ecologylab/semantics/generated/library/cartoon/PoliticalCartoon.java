package ecologylab.semantics.generated.library.cartoon;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.cartoon.Cartoon;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class PoliticalCartoon extends Cartoon
{
	@simpl_scalar
	private MetadataString cartoonist;

	public PoliticalCartoon()
	{ super(); }

	public PoliticalCartoon(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	cartoonist()
	{
		MetadataString	result = this.cartoonist;
		if (result == null)
		{
			result = new MetadataString();
			this.cartoonist = result;
		}
		return result;
	}

	public String getCartoonist()
	{
		return this.cartoonist == null ? null : cartoonist().getValue();
	}

	public MetadataString getCartoonistMetadata()
	{
		return cartoonist;
	}

	public void setCartoonist(String cartoonist)
	{
		if (cartoonist != null)
			this.cartoonist().setValue(cartoonist);
	}

	public void setCartoonistMetadata(MetadataString cartoonist)
	{
		this.cartoonist = cartoonist;
	}
}