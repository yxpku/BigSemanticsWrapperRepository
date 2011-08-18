package ecologylab.semantics.generated.library.uva;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.uva.KeywordSet;

/**
*  TopicCluster.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class TopicCluster extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger id;

	/** 
	 */ 
	@simpl_collection("document")	@mm_name("document_set")
	private List<Document> documentSet;

	/** 
	 */ 
	@simpl_collection("keyword_set")	@mm_name("keyword_sets")
	private List<KeywordSet> keywordSets;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger x;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger y;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger width;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger height;

	public TopicCluster()
	{ }

	public TopicCluster(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	id()
	{
		MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public Integer getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(Integer id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger id)
	{
		this.id = id;
	}

	public List<Document> getDocumentSet()
	{
		return documentSet;
	}

	public void setDocumentSet(List<Document> documentSet)
	{
		this.documentSet = documentSet;
	}

	public List<KeywordSet> getKeywordSets()
	{
		return keywordSets;
	}

	public void setKeywordSets(List<KeywordSet> keywordSets)
	{
		this.keywordSets = keywordSets;
	}

	public MetadataInteger	x()
	{
		MetadataInteger	result = this.x;
		if (result == null)
		{
			result = new MetadataInteger();
			this.x = result;
		}
		return result;
	}

	public Integer getX()
	{
		return this.x == null ? 0 : x().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getXMetadata()
	{
		return x;
	}

	public void setX(Integer x)
	{
		if (x != 0)
			this.x().setValue(x);
	}

	public void setXMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger x)
	{
		this.x = x;
	}

	public MetadataInteger	y()
	{
		MetadataInteger	result = this.y;
		if (result == null)
		{
			result = new MetadataInteger();
			this.y = result;
		}
		return result;
	}

	public Integer getY()
	{
		return this.y == null ? 0 : y().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getYMetadata()
	{
		return y;
	}

	public void setY(Integer y)
	{
		if (y != 0)
			this.y().setValue(y);
	}

	public void setYMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger y)
	{
		this.y = y;
	}

	public MetadataInteger	width()
	{
		MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public Integer getWidth()
	{
		return this.width == null ? 0 : width().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getWidthMetadata()
	{
		return width;
	}

	public void setWidth(Integer width)
	{
		if (width != 0)
			this.width().setValue(width);
	}

	public void setWidthMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger width)
	{
		this.width = width;
	}

	public MetadataInteger	height()
	{
		MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public Integer getHeight()
	{
		return this.height == null ? 0 : height().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getHeightMetadata()
	{
		return height;
	}

	public void setHeight(Integer height)
	{
		if (height != 0)
			this.height().setValue(height);
	}

	public void setHeightMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger height)
	{
		this.height = height;
	}
}
