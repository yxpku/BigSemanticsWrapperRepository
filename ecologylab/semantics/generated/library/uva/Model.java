package ecologylab.semantics.generated.library.uva;

import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Model.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Model extends Metadata
{
	/** 
	 */ 
	@simpl_collection("topic_cluster") @mm_name("topic_clusters")	private ArrayList<TopicCluster> topicClusters;

	public Model()
	{ }

	public Model(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<TopicCluster> getTopicClusters()
	{
		return topicClusters;
	}

	public void setTopicClusters(ArrayList<TopicCluster> topicClusters)
	{
		this.topicClusters = topicClusters;
	}
}
