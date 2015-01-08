package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.InstructableComment;
import ecologylab.bigsemantics.generated.library.person.author.InstructableAuthor;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class InstructableComment extends RichDocument
{
	@simpl_composite
	@mm_name("comment_author")
	private InstructableAuthor commentAuthor;

	@simpl_composite
	@mm_name("in_response_to")
	private InstructableAuthor inResponseTo;

	@simpl_composite
	@mm_name("reply")
	private InstructableComment reply;

	public InstructableComment()
	{ super(); }

	public InstructableComment(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public InstructableAuthor getCommentAuthor()
	{
		return commentAuthor;
	}

	public void setCommentAuthor(InstructableAuthor commentAuthor)
	{
		this.commentAuthor = commentAuthor;
	}

	public InstructableAuthor getInResponseTo()
	{
		return inResponseTo;
	}

	public void setInResponseTo(InstructableAuthor inResponseTo)
	{
		this.inResponseTo = inResponseTo;
	}

	public InstructableComment getReply()
	{
		return reply;
	}

	public void setReply(InstructableComment reply)
	{
		this.reply = reply;
	}
}
