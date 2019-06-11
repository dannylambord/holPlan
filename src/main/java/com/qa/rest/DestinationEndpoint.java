package com.qa.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.qa.model.Destination;
import com.qa.repository.DestinationRepository;

@Path("/")
public class DestinationEndpoint {

	@Inject
	private DestinationRepository destRepo;

	

	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({"application/json"})
	@Path("/destination/{id}")
	public Response updateAccount(Destination destination, @PathParam("id") int id) {
		if (destRepo.read(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		Destination accountRS2 = destRepo.update(id, destination);
		return Response.ok(accountRS2).build();
	}
	
	
	
	
	
	
	
}
