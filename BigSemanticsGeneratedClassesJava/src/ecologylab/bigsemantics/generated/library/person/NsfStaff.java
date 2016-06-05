package ecologylab.bigsemantics.generated.library.person;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.person.GrantStaff;
import ecologylab.bigsemantics.generated.library.search.NsfSearch;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class NsfStaff extends GrantStaff
{
	@simpl_composite
	@mm_name("grants_by_search")
	private NsfSearch grantsBySearch;

	public NsfStaff()
	{ super(); }

	public NsfStaff(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public NsfSearch getGrantsBySearch()
	{
		return grantsBySearch;
	}

	public void setGrantsBySearch(NsfSearch grantsBySearch)
	{
		this.grantsBySearch = grantsBySearch;
	}
}
