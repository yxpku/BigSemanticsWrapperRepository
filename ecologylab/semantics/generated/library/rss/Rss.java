package ecologylab.semantics.generated.library.rss;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Rss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/11/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A news feed.
 */ 
@simpl_inherit
public class Rss extends Document
{
	/** 
	 */ 
	@simpl_composite @mm_name("channel")	private Channel channel;

	public Rss()
	{ }

	public Rss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Channel getChannel()
	{
		return channel;
	}

	public void setChannel(Channel channel)
	{
		this.channel = channel;
	}
}
