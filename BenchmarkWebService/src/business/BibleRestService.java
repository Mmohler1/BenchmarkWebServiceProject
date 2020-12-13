package business;



import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Bible;

//Rest Service that uses JAX-RS to return a verse fromt he bible.

@RequestScoped
@Path("/verse")
@Produces({"application/json" })
@Consumes({"application/json" })
public class BibleRestService {

	//Insert the interface
	@Inject
	BibleBusinessInterface service;
	
	//Get Method returns json bible verse with bible inserted.
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public String getVerseAsJson(Bible bible)
	{
		return service.getVerse(bible);
		
	}
	
	
	//Get Method using the parameters in the path to return json bible verse
	@GET
	@Path("/getjson/{book}/{chapter}/{verse}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getVerseAsJson(@PathParam("book") String book,
			@PathParam("chapter") int chapter,
			@PathParam("verse") int verse)
	{
		Bible newBible = new Bible(book, chapter, verse);
		return service.getVerse(newBible);
		
	}
	
}
