package resources;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/cmd")
@Stateless
public class Command {
	
	@GET
	@Path("/init")
	@Produces(MediaType.APPLICATION_JSON)
	public Response init(@Context HttpServletRequest request) {
		return commonResponse("SWRest Service is initialized.");
	}
	
	
	
	public static Response commonResponse(Object entity) {
	
		ResponseBuilder responseBuilder = Response.ok(entity).header("Cache-Control", "no-cache, no-store, must-revalidate").header("Pragma", "no-cache").header("Expires", "0");
		
		return responseBuilder.build();
	}
	
	
 

}
