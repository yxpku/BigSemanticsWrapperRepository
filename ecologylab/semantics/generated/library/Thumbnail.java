package ecologylab.semantics.generated.library;

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

@xml_inherit
@xml_tag("Thumbnail")
public class Thumbnail extends Metadata{


/**
	null
**/ 

	@xml_tag("Url") @xml_nested private MetadataParsedURL	url;

/**
	Constructor
**/ 

public Thumbnail()
{
 super();
}

/**
	Constructor
**/ 

public Thumbnail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for url
**/ 

public MetadataParsedURL	url()
{
MetadataParsedURL	result	=this.url;
if(result == null)
{
result = new MetadataParsedURL();
this.url	=	 result;
}
return result;
}

/**
	Gets the value of the field url
**/ 

public ParsedURL getUrl(){
return url().getValue();
}

/**
	Sets the value of the field url
**/ 

public void setUrl( ParsedURL url )
{
this.url().setValue(url);
}

/**
	The heavy weight setter method for field url
**/ 

public void hwSetUrl( ParsedURL url )
{
this.url().setValue(url);
rebuildCompositeTermVector();
 }
/**
	 Sets the url directly
**/ 

public void setUrlMetadata(MetadataParsedURL url)
{	this.url = url;
}
/**
	Heavy Weight Direct setter method for url
**/ 

public void hwSetUrlMetadata(MetadataParsedURL url)
{	 if(this.url!=null && this.url.getValue()!=null && hasTermVector())
		 termVector().remove(this.url.termVector());
	 this.url = url;
	rebuildCompositeTermVector();
}}
