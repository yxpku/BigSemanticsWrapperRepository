package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.AskNatureStrategy;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AskNatureFunction extends RichDocument
{
	@simpl_scalar
	private MetadataString groupId;

	@simpl_scalar
	private MetadataString subgroupId;

	@simpl_scalar
	private MetadataString functionId;

	@simpl_collection("ask_nature_strategy")
	@mm_name("strategies")
	private List<AskNatureStrategy> strategies;

	public AskNatureFunction()
	{ super(); }

	public AskNatureFunction(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	groupId()
	{
		MetadataString	result = this.groupId;
		if (result == null)
		{
			result = new MetadataString();
			this.groupId = result;
		}
		return result;
	}

	public String getGroupId()
	{
		return this.groupId == null ? null : groupId().getValue();
	}

	public MetadataString getGroupIdMetadata()
	{
		return groupId;
	}

	public void setGroupId(String groupId)
	{
		if (groupId != null)
			this.groupId().setValue(groupId);
	}

	public void setGroupIdMetadata(MetadataString groupId)
	{
		this.groupId = groupId;
	}

	public MetadataString	subgroupId()
	{
		MetadataString	result = this.subgroupId;
		if (result == null)
		{
			result = new MetadataString();
			this.subgroupId = result;
		}
		return result;
	}

	public String getSubgroupId()
	{
		return this.subgroupId == null ? null : subgroupId().getValue();
	}

	public MetadataString getSubgroupIdMetadata()
	{
		return subgroupId;
	}

	public void setSubgroupId(String subgroupId)
	{
		if (subgroupId != null)
			this.subgroupId().setValue(subgroupId);
	}

	public void setSubgroupIdMetadata(MetadataString subgroupId)
	{
		this.subgroupId = subgroupId;
	}

	public MetadataString	functionId()
	{
		MetadataString	result = this.functionId;
		if (result == null)
		{
			result = new MetadataString();
			this.functionId = result;
		}
		return result;
	}

	public String getFunctionId()
	{
		return this.functionId == null ? null : functionId().getValue();
	}

	public MetadataString getFunctionIdMetadata()
	{
		return functionId;
	}

	public void setFunctionId(String functionId)
	{
		if (functionId != null)
			this.functionId().setValue(functionId);
	}

	public void setFunctionIdMetadata(MetadataString functionId)
	{
		this.functionId = functionId;
	}

	public List<AskNatureStrategy> getStrategies()
	{
		return strategies;
	}

  // lazy evaluation:
  public List<AskNatureStrategy> strategies()
  {
    if (strategies == null)
      strategies = new ArrayList<AskNatureStrategy>();
    return strategies;
  }

  // addTo:
  public void addToStrategies(AskNatureStrategy element)
  {
    strategies().add(element);
  }

  // size:
  public int strategiesSize()
  {
    return strategies == null ? 0 : strategies.size();
  }

	public void setStrategies(List<AskNatureStrategy> strategies)
	{
		this.strategies = strategies;
	}
}
