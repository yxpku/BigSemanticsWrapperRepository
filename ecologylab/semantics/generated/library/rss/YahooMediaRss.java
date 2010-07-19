package ecologylab.semantics.generated.library.rss;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
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
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	News feeds.
**/ 

@simpl_inherit

public class  YahooMediaRss
extends  Dc
{


private @xml_tag("media:content") @simpl_composite MediaContent	mediaContent;	@xml_tag("media:description") @simpl_scalar private MetadataString	mediaDescription;

/**
	Constructor
**/ 

public YahooMediaRss()
{
 super();
}

/**
	Constructor
**/ 

public YahooMediaRss(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for mediaContent
**/ 

public MediaContent	mediaContent()
{
MediaContent	result	=this.mediaContent;
if(result == null)
{
result = new MediaContent();
this.mediaContent	=	 result;
}
return result;
}

/**
	Set the value of field mediaContent
**/ 

public void setMediaContent( MediaContent mediaContent )
{
this.mediaContent = mediaContent ;
}

/**
	Get the value of field mediaContent
**/ 

public MediaContent getMediaContent(){
return this.mediaContent;
}

/**
	Lazy Evaluation for mediaDescription
**/ 

public MetadataString	mediaDescription()
{
MetadataString	result	=this.mediaDescription;
if(result == null)
{
result = new MetadataString();
this.mediaDescription	=	 result;
}
return result;
}

/**
	Gets the value of the field mediaDescription
**/ 

public String getMediaDescription(){
return mediaDescription().getValue();
}

/**
	Sets the value of the field mediaDescription
**/ 

public void setMediaDescription( String mediaDescription )
{
this.mediaDescription().setValue(mediaDescription);
}

/**
	The heavy weight setter method for field mediaDescription
**/ 

public void hwSetMediaDescription( String mediaDescription )
{
this.mediaDescription().setValue(mediaDescription);
rebuildCompositeTermVector();
 }
/**
	 Sets the mediaDescription directly
**/ 

public void setMediaDescriptionMetadata(MetadataString mediaDescription)
{	this.mediaDescription = mediaDescription;
}
/**
	Heavy Weight Direct setter method for mediaDescription
**/ 

public void hwSetMediaDescriptionMetadata(MetadataString mediaDescription)
{	 if(this.mediaDescription!=null && this.mediaDescription.getValue()!=null && hasTermVector())
		 termVector().remove(this.mediaDescription.termVector());
	 this.mediaDescription = mediaDescription;
	rebuildCompositeTermVector();
}
}
