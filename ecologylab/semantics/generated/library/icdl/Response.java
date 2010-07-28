package ecologylab.semantics.generated.library.icdl;

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

@simpl_inherit

public class Response extends Metadata{

	@simpl_scalar private MetadataInteger	pnum;
	@simpl_scalar private MetadataInteger	total;
	 @simpl_collection("book") @simpl_nowrap @mm_name("books") private ArrayList<Book>	books;

/**
	Constructor
**/ 

public Response()
{
 super();
}

/**
	Constructor
**/ 

public Response(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for pnum
**/ 

public MetadataInteger	pnum()
{
MetadataInteger	result	=this.pnum;
if(result == null)
{
result = new MetadataInteger();
this.pnum	=	 result;
}
return result;
}

/**
	Gets the value of the field pnum
**/ 

public Integer getPnum(){
return pnum().getValue();
}

/**
	Sets the value of the field pnum
**/ 

public void setPnum( Integer pnum )
{
this.pnum().setValue(pnum);
}

/**
	The heavy weight setter method for field pnum
**/ 

public void hwSetPnum( Integer pnum )
{
this.pnum().setValue(pnum);
rebuildCompositeTermVector();
 }
/**
	 Sets the pnum directly
**/ 

public void setPnumMetadata(MetadataInteger pnum)
{	this.pnum = pnum;
}
/**
	Heavy Weight Direct setter method for pnum
**/ 

public void hwSetPnumMetadata(MetadataInteger pnum)
{	 if(this.pnum!=null && this.pnum.getValue()!=null && hasTermVector())
		 termVector().remove(this.pnum.termVector());
	 this.pnum = pnum;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for total
**/ 

public MetadataInteger	total()
{
MetadataInteger	result	=this.total;
if(result == null)
{
result = new MetadataInteger();
this.total	=	 result;
}
return result;
}

/**
	Gets the value of the field total
**/ 

public Integer getTotal(){
return total().getValue();
}

/**
	Sets the value of the field total
**/ 

public void setTotal( Integer total )
{
this.total().setValue(total);
}

/**
	The heavy weight setter method for field total
**/ 

public void hwSetTotal( Integer total )
{
this.total().setValue(total);
rebuildCompositeTermVector();
 }
/**
	 Sets the total directly
**/ 

public void setTotalMetadata(MetadataInteger total)
{	this.total = total;
}
/**
	Heavy Weight Direct setter method for total
**/ 

public void hwSetTotalMetadata(MetadataInteger total)
{	 if(this.total!=null && this.total.getValue()!=null && hasTermVector())
		 termVector().remove(this.total.termVector());
	 this.total = total;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for books
**/ 

public  ArrayList<Book>	books()
{
 ArrayList<Book>	result	=this.books;
if(result == null)
{
result = new  ArrayList<Book>();
this.books	=	 result;
}
return result;
}

/**
	Set the value of field books
**/ 

public void setBooks(  ArrayList<Book> books )
{
this.books = books ;
}

/**
	Get the value of field books
**/ 

public  ArrayList<Book> getBooks(){
return this.books;
}
}
