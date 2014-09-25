package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
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
public class General extends Metadata
{
	@simpl_collection("subject")
	@mm_name("subjects")
	private List<MetadataString> subjects;

	@simpl_scalar
	private MetadataString description;

	@simpl_scalar
	private MetadataString language;

	@simpl_scalar
	private MetadataString title;

	public General()
	{ super(); }

	public General(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MetadataString> getSubjects()
	{
		return subjects;
	}

  // lazy evaluation:
  public List<MetadataString> subjects()
  {
    if (subjects == null)
      subjects = new ArrayList<MetadataString>();
    return subjects;
  }

  // addTo:
  public void addToSubjects(MetadataString element)
  {
    subjects().add(element);
  }

  // size:
  public int subjectsSize()
  {
    return subjects == null ? 0 : subjects.size();
  }

	public void setSubjects(List<MetadataString> subjects)
	{
		this.subjects = subjects;
	}

	public MetadataString	description()
	{
		MetadataString	result = this.description;
		if (result == null)
		{
			result = new MetadataString();
			this.description = result;
		}
		return result;
	}

	public String getDescription()
	{
		return this.description == null ? null : description().getValue();
	}

	public MetadataString getDescriptionMetadata()
	{
		return description;
	}

	public void setDescription(String description)
	{
		if (description != null)
			this.description().setValue(description);
	}

	public void setDescriptionMetadata(MetadataString description)
	{
		this.description = description;
	}

	public MetadataString	language()
	{
		MetadataString	result = this.language;
		if (result == null)
		{
			result = new MetadataString();
			this.language = result;
		}
		return result;
	}

	public String getLanguage()
	{
		return this.language == null ? null : language().getValue();
	}

	public MetadataString getLanguageMetadata()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		if (language != null)
			this.language().setValue(language);
	}

	public void setLanguageMetadata(MetadataString language)
	{
		this.language = language;
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}
}
