package ecologylab.bigsemantics.generated.library.event;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.event.Disaster;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *Generalized International Charter on Space and Major Disasters Object
 */ 
@simpl_inherit
public class Icsmd extends Disaster
{
	@simpl_scalar
	private MetadataString eventType;

	@simpl_scalar
	private MetadataString eventLocation;

	@simpl_scalar
	private MetadataString dateOfCharterActivation;

	@simpl_scalar
	private MetadataString charterRequestor;

	@simpl_scalar
	private MetadataString projectManager;

	public Icsmd()
	{ super(); }

	public Icsmd(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	eventType()
	{
		MetadataString	result = this.eventType;
		if (result == null)
		{
			result = new MetadataString();
			this.eventType = result;
		}
		return result;
	}

	public String getEventType()
	{
		return this.eventType == null ? null : eventType().getValue();
	}

	public MetadataString getEventTypeMetadata()
	{
		return eventType;
	}

	public void setEventType(String eventType)
	{
		if (eventType != null)
			this.eventType().setValue(eventType);
	}

	public void setEventTypeMetadata(MetadataString eventType)
	{
		this.eventType = eventType;
	}

	public MetadataString	eventLocation()
	{
		MetadataString	result = this.eventLocation;
		if (result == null)
		{
			result = new MetadataString();
			this.eventLocation = result;
		}
		return result;
	}

	public String getEventLocation()
	{
		return this.eventLocation == null ? null : eventLocation().getValue();
	}

	public MetadataString getEventLocationMetadata()
	{
		return eventLocation;
	}

	public void setEventLocation(String eventLocation)
	{
		if (eventLocation != null)
			this.eventLocation().setValue(eventLocation);
	}

	public void setEventLocationMetadata(MetadataString eventLocation)
	{
		this.eventLocation = eventLocation;
	}

	public MetadataString	dateOfCharterActivation()
	{
		MetadataString	result = this.dateOfCharterActivation;
		if (result == null)
		{
			result = new MetadataString();
			this.dateOfCharterActivation = result;
		}
		return result;
	}

	public String getDateOfCharterActivation()
	{
		return this.dateOfCharterActivation == null ? null : dateOfCharterActivation().getValue();
	}

	public MetadataString getDateOfCharterActivationMetadata()
	{
		return dateOfCharterActivation;
	}

	public void setDateOfCharterActivation(String dateOfCharterActivation)
	{
		if (dateOfCharterActivation != null)
			this.dateOfCharterActivation().setValue(dateOfCharterActivation);
	}

	public void setDateOfCharterActivationMetadata(MetadataString dateOfCharterActivation)
	{
		this.dateOfCharterActivation = dateOfCharterActivation;
	}

	public MetadataString	charterRequestor()
	{
		MetadataString	result = this.charterRequestor;
		if (result == null)
		{
			result = new MetadataString();
			this.charterRequestor = result;
		}
		return result;
	}

	public String getCharterRequestor()
	{
		return this.charterRequestor == null ? null : charterRequestor().getValue();
	}

	public MetadataString getCharterRequestorMetadata()
	{
		return charterRequestor;
	}

	public void setCharterRequestor(String charterRequestor)
	{
		if (charterRequestor != null)
			this.charterRequestor().setValue(charterRequestor);
	}

	public void setCharterRequestorMetadata(MetadataString charterRequestor)
	{
		this.charterRequestor = charterRequestor;
	}

	public MetadataString	projectManager()
	{
		MetadataString	result = this.projectManager;
		if (result == null)
		{
			result = new MetadataString();
			this.projectManager = result;
		}
		return result;
	}

	public String getProjectManager()
	{
		return this.projectManager == null ? null : projectManager().getValue();
	}

	public MetadataString getProjectManagerMetadata()
	{
		return projectManager;
	}

	public void setProjectManager(String projectManager)
	{
		if (projectManager != null)
			this.projectManager().setValue(projectManager);
	}

	public void setProjectManagerMetadata(MetadataString projectManager)
	{
		this.projectManager = projectManager;
	}
}
