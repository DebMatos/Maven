package io.altar.exemplo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/exemplos/hello")
public class Hello {
	@Context
	private UriInfo context;
	
	@PUT
	@Path("/{nome}")
	@Consumes("application/json")
	@Produces("application/json")
	public String Hello(@PathParam("nome") String nome) {
	    return "URI " + context.getRequestUri().toString() + " Ola!"+nome;
	}

}
