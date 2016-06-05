package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.NsfDivisionStaffList;
import ecologylab.bigsemantics.generated.library.NsfProgram;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class NsfDivision extends RichDocument
{
	@simpl_collection("nsf_program")
	@mm_name("programs")
	private List<NsfProgram> programs;

	@simpl_collection("nsf_program")
	@mm_name("recently_announced")
	private List<NsfProgram> recentlyAnnounced;

	@simpl_collection("nsf_program")
	@mm_name("upcoming_due")
	private List<NsfProgram> upcomingDue;

	@simpl_composite
	@mm_name("staffs")
	private NsfDivisionStaffList staffs;

	public NsfDivision()
	{ super(); }

	public NsfDivision(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<NsfProgram> getPrograms()
	{
		return programs;
	}

  // lazy evaluation:
  public List<NsfProgram> programs()
  {
    if (programs == null)
      programs = new ArrayList<NsfProgram>();
    return programs;
  }

  // addTo:
  public void addToPrograms(NsfProgram element)
  {
    programs().add(element);
  }

  // size:
  public int programsSize()
  {
    return programs == null ? 0 : programs.size();
  }

	public void setPrograms(List<NsfProgram> programs)
	{
		this.programs = programs;
	}

	public List<NsfProgram> getRecentlyAnnounced()
	{
		return recentlyAnnounced;
	}

  // lazy evaluation:
  public List<NsfProgram> recentlyAnnounced()
  {
    if (recentlyAnnounced == null)
      recentlyAnnounced = new ArrayList<NsfProgram>();
    return recentlyAnnounced;
  }

  // addTo:
  public void addToRecentlyAnnounced(NsfProgram element)
  {
    recentlyAnnounced().add(element);
  }

  // size:
  public int recentlyAnnouncedSize()
  {
    return recentlyAnnounced == null ? 0 : recentlyAnnounced.size();
  }

	public void setRecentlyAnnounced(List<NsfProgram> recentlyAnnounced)
	{
		this.recentlyAnnounced = recentlyAnnounced;
	}

	public List<NsfProgram> getUpcomingDue()
	{
		return upcomingDue;
	}

  // lazy evaluation:
  public List<NsfProgram> upcomingDue()
  {
    if (upcomingDue == null)
      upcomingDue = new ArrayList<NsfProgram>();
    return upcomingDue;
  }

  // addTo:
  public void addToUpcomingDue(NsfProgram element)
  {
    upcomingDue().add(element);
  }

  // size:
  public int upcomingDueSize()
  {
    return upcomingDue == null ? 0 : upcomingDue.size();
  }

	public void setUpcomingDue(List<NsfProgram> upcomingDue)
	{
		this.upcomingDue = upcomingDue;
	}

	public NsfDivisionStaffList getStaffs()
	{
		return staffs;
	}

	public void setStaffs(NsfDivisionStaffList staffs)
	{
		this.staffs = staffs;
	}
}
