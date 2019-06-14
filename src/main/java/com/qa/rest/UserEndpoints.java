package com.qa.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.qa.model.Destination;
import com.qa.model.User;
import com.qa.repository.DestinationRepository;
import com.qa.repository.UserRepository;

@Path("/")
public class UserEndpoints {

	@Inject
	private UserRepository userRepository;
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOne(@PathParam("id") int id) {
		if(userRepository.read(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		User user = userRepository.read(id);
		return Response.ok(user).build();
	}
	
	@POST
	@Consumes({"application/json"})
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/user")
	public Response addUser(User userRS, @Context UriInfo uriInfo) {
		userRS = userRepository.create(userRS);
		URI createdURI = uriInfo.getBaseUriBuilder().path(""+userRS.getId()).build();
		return Response.ok(createdURI.toString()).status(Status.CREATED).build();
	}
}
