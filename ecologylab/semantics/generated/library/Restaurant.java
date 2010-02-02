package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.builtins.Entity;

 import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	The restaurant class
**/ 

@xml_inherit

public class  Restaurant
extends  Document
{


/**
	Phone number of the restaurant
**/ 

	 @xml_nested private MetadataString	phone;

/**
	A picture from the restaurant
**/ 

	 @xml_nested private MetadataParsedURL	pic;

/**
	Link to the restaurant's website
**/ 

	 @xml_nested private MetadataParsedURL	link;

/**
	Rating of the restaurant
**/ 

	 @xml_nested private MetadataString	rating;

/**
	Price range of the restaurant
**/ 

	 @xml_nested private MetadataString	priceRange;

/**
	Map image of the restaurant's location or link to a directions page
**/ 

	 @xml_nested private MetadataParsedURL	map;
	@xml_collection("genres") private ArrayList<SearchResult>	genres;

/**
	Constructor
**/ 

public Restaurant()
{
 super();
}

/**
	Constructor
**/ 

public Restaurant(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for phone
**/ 

public MetadataString	phone()
{
MetadataString	result	=this.phone;
if(result == null)
{
result = new MetadataString();
this.phone	=	 result;
}
return result;
}

/**
	Gets the value of the field phone
**/ 

public String getPhone(){
return phone().getValue();
}

/**
	Sets the value of the field phone
**/ 

public void setPhone( String phone )
{
this.phone().setValue(phone);
}

/**
	The heavy weight setter method for field phone
**/ 

public void hwSetPhone( String phone )
{
this.phone().setValue(phone);
rebuildCompositeTermVector();
 }
/**
	 Sets the phone directly
**/ 

public void setPhoneMetadata(MetadataString phone)
{	this.phone = phone;
}
/**
	Heavy Weight Direct setter method for phone
**/ 

public void hwSetPhoneMetadata(MetadataString phone)
{	 if(this.phone!=null && this.phone.getValue()!=null && hasTermVector())
		 termVector().remove(this.phone.termVector());
	 this.phone = phone;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for pic
**/ 

public MetadataParsedURL	pic()
{
MetadataParsedURL	result	=this.pic;
if(result == null)
{
result = new MetadataParsedURL();
this.pic	=	 result;
}
return result;
}

/**
	Gets the value of the field pic
**/ 

public ParsedURL getPic(){
return pic().getValue();
}

/**
	Sets the value of the field pic
**/ 

public void setPic( ParsedURL pic )
{
this.pic().setValue(pic);
}

/**
	The heavy weight setter method for field pic
**/ 

public void hwSetPic( ParsedURL pic )
{
this.pic().setValue(pic);
rebuildCompositeTermVector();
 }
/**
	 Sets the pic directly
**/ 

public void setPicMetadata(MetadataParsedURL pic)
{	this.pic = pic;
}
/**
	Heavy Weight Direct setter method for pic
**/ 

public void hwSetPicMetadata(MetadataParsedURL pic)
{	 if(this.pic!=null && this.pic.getValue()!=null && hasTermVector())
		 termVector().remove(this.pic.termVector());
	 this.pic = pic;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for link
**/ 

public MetadataParsedURL	link()
{
MetadataParsedURL	result	=this.link;
if(result == null)
{
result = new MetadataParsedURL();
this.link	=	 result;
}
return result;
}

/**
	Gets the value of the field link
**/ 

public ParsedURL getLink(){
return link().getValue();
}

/**
	Sets the value of the field link
**/ 

public void setLink( ParsedURL link )
{
this.link().setValue(link);
}

/**
	The heavy weight setter method for field link
**/ 

public void hwSetLink( ParsedURL link )
{
this.link().setValue(link);
rebuildCompositeTermVector();
 }
/**
	 Sets the link directly
**/ 

public void setLinkMetadata(MetadataParsedURL link)
{	this.link = link;
}
/**
	Heavy Weight Direct setter method for link
**/ 

public void hwSetLinkMetadata(MetadataParsedURL link)
{	 if(this.link!=null && this.link.getValue()!=null && hasTermVector())
		 termVector().remove(this.link.termVector());
	 this.link = link;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for rating
**/ 

public MetadataString	rating()
{
MetadataString	result	=this.rating;
if(result == null)
{
result = new MetadataString();
this.rating	=	 result;
}
return result;
}

/**
	Gets the value of the field rating
**/ 

public String getRating(){
return rating().getValue();
}

/**
	Sets the value of the field rating
**/ 

public void setRating( String rating )
{
this.rating().setValue(rating);
}

/**
	The heavy weight setter method for field rating
**/ 

public void hwSetRating( String rating )
{
this.rating().setValue(rating);
rebuildCompositeTermVector();
 }
/**
	 Sets the rating directly
**/ 

public void setRatingMetadata(MetadataString rating)
{	this.rating = rating;
}
/**
	Heavy Weight Direct setter method for rating
**/ 

public void hwSetRatingMetadata(MetadataString rating)
{	 if(this.rating!=null && this.rating.getValue()!=null && hasTermVector())
		 termVector().remove(this.rating.termVector());
	 this.rating = rating;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for priceRange
**/ 

public MetadataString	priceRange()
{
MetadataString	result	=this.priceRange;
if(result == null)
{
result = new MetadataString();
this.priceRange	=	 result;
}
return result;
}

/**
	Gets the value of the field priceRange
**/ 

public String getPriceRange(){
return priceRange().getValue();
}

/**
	Sets the value of the field priceRange
**/ 

public void setPriceRange( String priceRange )
{
this.priceRange().setValue(priceRange);
}

/**
	The heavy weight setter method for field priceRange
**/ 

public void hwSetPriceRange( String priceRange )
{
this.priceRange().setValue(priceRange);
rebuildCompositeTermVector();
 }
/**
	 Sets the priceRange directly
**/ 

public void setPriceRangeMetadata(MetadataString priceRange)
{	this.priceRange = priceRange;
}
/**
	Heavy Weight Direct setter method for priceRange
**/ 

public void hwSetPriceRangeMetadata(MetadataString priceRange)
{	 if(this.priceRange!=null && this.priceRange.getValue()!=null && hasTermVector())
		 termVector().remove(this.priceRange.termVector());
	 this.priceRange = priceRange;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for map
**/ 

public MetadataParsedURL	map()
{
MetadataParsedURL	result	=this.map;
if(result == null)
{
result = new MetadataParsedURL();
this.map	=	 result;
}
return result;
}

/**
	Gets the value of the field map
**/ 

public ParsedURL getMap(){
return map().getValue();
}

/**
	Sets the value of the field map
**/ 

public void setMap( ParsedURL map )
{
this.map().setValue(map);
}

/**
	The heavy weight setter method for field map
**/ 

public void hwSetMap( ParsedURL map )
{
this.map().setValue(map);
rebuildCompositeTermVector();
 }
/**
	 Sets the map directly
**/ 

public void setMapMetadata(MetadataParsedURL map)
{	this.map = map;
}
/**
	Heavy Weight Direct setter method for map
**/ 

public void hwSetMapMetadata(MetadataParsedURL map)
{	 if(this.map!=null && this.map.getValue()!=null && hasTermVector())
		 termVector().remove(this.map.termVector());
	 this.map = map;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for genres
**/ 

public  ArrayList<SearchResult>	genres()
{
 ArrayList<SearchResult>	result	=this.genres;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.genres	=	 result;
}
return result;
}

/**
	Set the value of field genres
**/ 

public void setGenres(  ArrayList<SearchResult> genres )
{
this.genres = genres ;
}

/**
	Get the value of field genres
**/ 

public  ArrayList<SearchResult> getGenres(){
return this.genres;
}

}

