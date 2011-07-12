package ecologylab.semantics.generated.library;

import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  GooglePatent.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google Patents Class
 */ 
@simpl_inherit
public class GooglePatent extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString inventor;

	/** 
	 */ 
	@simpl_scalar	private MetadataString abstractField;

	/** 
	 */ 
	@simpl_scalar	private MetadataString claims;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL picLink;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("referenced_bys")	private ArrayList<SearchResult> referencedBys;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("citations")	private ArrayList<SearchResult> citations;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("pic_links")	private ArrayList<SearchResult> picLinks;

	public GooglePatent()
	{ }

	public GooglePatent(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	inventor()
	{
		MetadataString	result = this.inventor;
		if (result == null)
		{
			result = new MetadataString();
			this.inventor = result;
		}
		return result;
	}

	public String getInventor()
	{
		return this.inventor().getValue();
	}

	public void setInventor(String inventor)
	{
		this.inventor().setValue(inventor);
	}

	public MetadataString	abstractField()
	{
		MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public String getAbstractField()
	{
		return this.abstractField().getValue();
	}

	public void setAbstractField(String abstractField)
	{
		this.abstractField().setValue(abstractField);
	}

	public MetadataString	claims()
	{
		MetadataString	result = this.claims;
		if (result == null)
		{
			result = new MetadataString();
			this.claims = result;
		}
		return result;
	}

	public String getClaims()
	{
		return this.claims().getValue();
	}

	public void setClaims(String claims)
	{
		this.claims().setValue(claims);
	}

	public MetadataParsedURL	picLink()
	{
		MetadataParsedURL	result = this.picLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.picLink = result;
		}
		return result;
	}

	public ParsedURL getPicLink()
	{
		return this.picLink().getValue();
	}

	public void setPicLink(ParsedURL picLink)
	{
		this.picLink().setValue(picLink);
	}


	public ArrayList<SearchResult> getReferencedBys()
	{
		return referencedBys;
	}

	public void setReferencedBys(ArrayList<SearchResult> referencedBys)
	{
		this.referencedBys = referencedBys;
	}

	public ArrayList<SearchResult> getCitations()
	{
		return citations;
	}

	public void setCitations(ArrayList<SearchResult> citations)
	{
		this.citations = citations;
	}

	public ArrayList<SearchResult> getPicLinks()
	{
		return picLinks;
	}

	public void setPicLinks(ArrayList<SearchResult> picLinks)
	{
		this.picLinks = picLinks;
	}
}
