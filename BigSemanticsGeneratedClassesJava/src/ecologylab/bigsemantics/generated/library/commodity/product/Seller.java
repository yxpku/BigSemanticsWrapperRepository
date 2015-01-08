package ecologylab.bigsemantics.generated.library.commodity.product;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
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
public class Seller extends RichDocument
{
	@simpl_scalar
	private MetadataString feedback;

	@simpl_scalar
	private MetadataString positiveFeedback;

	public Seller()
	{ super(); }

	public Seller(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	feedback()
	{
		MetadataString	result = this.feedback;
		if (result == null)
		{
			result = new MetadataString();
			this.feedback = result;
		}
		return result;
	}

	public String getFeedback()
	{
		return this.feedback == null ? null : feedback().getValue();
	}

	public MetadataString getFeedbackMetadata()
	{
		return feedback;
	}

	public void setFeedback(String feedback)
	{
		if (feedback != null)
			this.feedback().setValue(feedback);
	}

	public void setFeedbackMetadata(MetadataString feedback)
	{
		this.feedback = feedback;
	}

	public MetadataString	positiveFeedback()
	{
		MetadataString	result = this.positiveFeedback;
		if (result == null)
		{
			result = new MetadataString();
			this.positiveFeedback = result;
		}
		return result;
	}

	public String getPositiveFeedback()
	{
		return this.positiveFeedback == null ? null : positiveFeedback().getValue();
	}

	public MetadataString getPositiveFeedbackMetadata()
	{
		return positiveFeedback;
	}

	public void setPositiveFeedback(String positiveFeedback)
	{
		if (positiveFeedback != null)
			this.positiveFeedback().setValue(positiveFeedback);
	}

	public void setPositiveFeedbackMetadata(MetadataString positiveFeedback)
	{
		this.positiveFeedback = positiveFeedback;
	}
}
