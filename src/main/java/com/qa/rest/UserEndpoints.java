package com.qa.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.qa.model.Destination;
import com.qa.model.User;
import com.qa.repository.DestinationRepository;
import com.qa.repository.UserRepository;

public class UserEndpoints {

	@Inject
	private UserRepository userRepository;
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		List<User> list = userRepository.readAll();
		if (list.size() == 0) {
			return Response.noContent().build();
		}
		return Response.ok(list).build();
	}
	
}
