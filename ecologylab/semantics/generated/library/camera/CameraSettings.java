package ecologylab.semantics.generated.library.camera;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.metadata.scalar.MetadataFloat;

/**
*  CameraSettings.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Mixin: Image description from EXIF image metadata.
 */ 
@simpl_inherit
public class CameraSettings extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString subjectDistance;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString exposureTime;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataFloat aperture;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataFloat shutterSpeed;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString model;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString orientation;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger resolution;

	public CameraSettings()
	{ }

	public CameraSettings(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	subjectDistance()
	{
		MetadataString	result = this.subjectDistance;
		if (result == null)
		{
			result = new MetadataString();
			this.subjectDistance = result;
		}
		return result;
	}

	public String getSubjectDistance()
	{
		return this.subjectDistance == null ? null : subjectDistance().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSubjectDistanceMetadata()
	{
		return subjectDistance;
	}

	public void setSubjectDistance(String subjectDistance)
	{
		if (subjectDistance != null)
			this.subjectDistance().setValue(subjectDistance);
	}

	public void setSubjectDistanceMetadata(ecologylab.semantics.metadata.scalar.MetadataString subjectDistance)
	{
		this.subjectDistance = subjectDistance;
	}

	public MetadataString	exposureTime()
	{
		MetadataString	result = this.exposureTime;
		if (result == null)
		{
			result = new MetadataString();
			this.exposureTime = result;
		}
		return result;
	}

	public String getExposureTime()
	{
		return this.exposureTime == null ? null : exposureTime().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getExposureTimeMetadata()
	{
		return exposureTime;
	}

	public void setExposureTime(String exposureTime)
	{
		if (exposureTime != null)
			this.exposureTime().setValue(exposureTime);
	}

	public void setExposureTimeMetadata(ecologylab.semantics.metadata.scalar.MetadataString exposureTime)
	{
		this.exposureTime = exposureTime;
	}

	public MetadataFloat	aperture()
	{
		MetadataFloat	result = this.aperture;
		if (result == null)
		{
			result = new MetadataFloat();
			this.aperture = result;
		}
		return result;
	}

	public Float getAperture()
	{
		return this.aperture == null ? 0 : aperture().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataFloat getApertureMetadata()
	{
		return aperture;
	}

	public void setAperture(Float aperture)
	{
		if (aperture != 0)
			this.aperture().setValue(aperture);
	}

	public void setApertureMetadata(ecologylab.semantics.metadata.scalar.MetadataFloat aperture)
	{
		this.aperture = aperture;
	}

	public MetadataFloat	shutterSpeed()
	{
		MetadataFloat	result = this.shutterSpeed;
		if (result == null)
		{
			result = new MetadataFloat();
			this.shutterSpeed = result;
		}
		return result;
	}

	public Float getShutterSpeed()
	{
		return this.shutterSpeed == null ? 0 : shutterSpeed().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataFloat getShutterSpeedMetadata()
	{
		return shutterSpeed;
	}

	public void setShutterSpeed(Float shutterSpeed)
	{
		if (shutterSpeed != 0)
			this.shutterSpeed().setValue(shutterSpeed);
	}

	public void setShutterSpeedMetadata(ecologylab.semantics.metadata.scalar.MetadataFloat shutterSpeed)
	{
		this.shutterSpeed = shutterSpeed;
	}

	public MetadataString	model()
	{
		MetadataString	result = this.model;
		if (result == null)
		{
			result = new MetadataString();
			this.model = result;
		}
		return result;
	}

	public String getModel()
	{
		return this.model == null ? null : model().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getModelMetadata()
	{
		return model;
	}

	public void setModel(String model)
	{
		if (model != null)
			this.model().setValue(model);
	}

	public void setModelMetadata(ecologylab.semantics.metadata.scalar.MetadataString model)
	{
		this.model = model;
	}

	public MetadataString	orientation()
	{
		MetadataString	result = this.orientation;
		if (result == null)
		{
			result = new MetadataString();
			this.orientation = result;
		}
		return result;
	}

	public String getOrientation()
	{
		return this.orientation == null ? null : orientation().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getOrientationMetadata()
	{
		return orientation;
	}

	public void setOrientation(String orientation)
	{
		if (orientation != null)
			this.orientation().setValue(orientation);
	}

	public void setOrientationMetadata(ecologylab.semantics.metadata.scalar.MetadataString orientation)
	{
		this.orientation = orientation;
	}

	public MetadataInteger	resolution()
	{
		MetadataInteger	result = this.resolution;
		if (result == null)
		{
			result = new MetadataInteger();
			this.resolution = result;
		}
		return result;
	}

	public Integer getResolution()
	{
		return this.resolution == null ? 0 : resolution().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getResolutionMetadata()
	{
		return resolution;
	}

	public void setResolution(Integer resolution)
	{
		if (resolution != 0)
			this.resolution().setValue(resolution);
	}

	public void setResolutionMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger resolution)
	{
		this.resolution = resolution;
	}
}
