package com.qa.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
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
	private DestinationRepository accountRepository;
	
	@GET
	@Path("/destination")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		List<Destination> list = accountRepository.readAll();
		if (list.size() == 0) {
			return Response.noContent().build();
		}
		return Response.ok(list).build();
	}
	
	@GET
	@Path("/destination/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOne(@PathParam("id") int id) {
		if (accountRepository.read(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		Destination destination = accountRepository.read(id);
		return Response.ok(destination).build();
	}
	
	@POST
	@Consumes({"application/json"})
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/destination")
	public Response addAccount(Destination accountRS, @Context UriInfo uriInfo) {
		accountRS = accountRepository.create(accountRS);
		URI createdURI = uriInfo.getBaseUriBuilder().path(""+accountRS.getId()).build();
		System.out.println(createdURI);
		return Response.ok(createdURI.toString()).status(Status.CREATED).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({"application/json"})
	@Path("/destination/{id}")
	public Response updateDestination(Destination account, @PathParam("id") int id) {
		if (accountRepository.read(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		Destination accountRS2 = accountRepository.update(id, account);
		return Response.ok(accountRS2).build();
	}
	
	@DELETE
	@Path("/destination/{id}")
	public Response deleteAccount(@PathParam("id") int id) {
		if (accountRepository.read(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		accountRepository.delete(id);
		return Response.noContent().build();
	}
	
	
	
	
	
	
	
}
