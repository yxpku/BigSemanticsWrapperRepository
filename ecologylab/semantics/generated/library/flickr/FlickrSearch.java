package ecologylab.semantics.generated.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	The flickr search class
**/ 

@simpl_inherit

public class  FlickrSearch
extends  Document
{

	 @simpl_collection("flickr_image") @xml_tag("flickr_results") @mm_name("flickr_results") private ArrayList<FlickrImage>	flickrResults;

/**
	Constructor
**/ 

public FlickrSearch()
{
 super();
}

/**
	Constructor
**/ 

public FlickrSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickrResults
**/ 

public  ArrayList<FlickrImage>	flickrResults()
{
 ArrayList<FlickrImage>	result	=this.flickrResults;
if(result == null)
{
result = new  ArrayList<FlickrImage>();
this.flickrResults	=	 result;
}
return result;
}

/**
	Set the value of field flickrResults
**/ 

public void setFlickrResults(  ArrayList<FlickrImage> flickrResults )
{
this.flickrResults = flickrResults ;
}

/**
	Get the value of field flickrResults
**/ 

public  ArrayList<FlickrImage> getFlickrResults(){
return this.flickrResults;
}

}

