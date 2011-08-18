package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.generated.library.dlese.DleseRecordHead;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.dlese.RecordMetadata;

/**
*  DleseRecord.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_tag("record")
public class DleseRecord extends Document
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("head")	@mm_name("dlese_record_head")
	private DleseRecordHead dleseRecordHead;

	/** 
	 */ 
	@simpl_composite	@xml_tag("metadata")	@mm_name("record_metadata")
	private RecordMetadata recordMetadata;

	public DleseRecord()
	{ }

	public DleseRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public DleseRecordHead getDleseRecordHead()
	{
		return dleseRecordHead;
	}

	public void setDleseRecordHead(DleseRecordHead dleseRecordHead)
	{
		this.dleseRecordHead = dleseRecordHead;
	}

	public RecordMetadata getRecordMetadata()
	{
		return recordMetadata;
	}

	public void setRecordMetadata(RecordMetadata recordMetadata)
	{
		this.recordMetadata = recordMetadata;
	}
}
