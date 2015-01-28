package com.mkyong.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.mkyong.context.SpringApplicationContext;
import com.mkyong.customer.CustomerBo;
import com.tma.model.User;
import com.tma.service.UserService;

@Path("/api")
@Consumes("application/json")
@Produces("application/json")
public class PrintService {

	CustomerBo customerBo;
	UserService userService;

	@GET
	@Path("/print")
	public Response printMessage() {

		customerBo = (CustomerBo) SpringApplicationContext.getBean("customerBo");
		userService = (UserService) SpringApplicationContext.getBean("userService");
		
		String result = customerBo.getMsg();

		return Response.status(200).entity(result).build();

	}
	@GET
	@Path("/users")
	public Response getUsers(){
//		TODO
		List<User> result = userService.getAll();
		
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/user/{id}")
	public Response getUser(@PathParam("id") String id){
//		TODO
		
		return Response.status(200).entity(userService.getWithId(id)).build();
	}
	
	@GET
	@Path("/musics")
	public Response getMusics(){
//		TODO
		return Response.status(200).entity("All musics").build();
	}
	
	@GET
	@Path("/music/{id}")
	public Response getMusic(@PathParam("id") String id){
//		TODO
		String result = "GET: music with id: " + id;
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/music")
	public Response addMusic(@QueryParam("data") String data){
//		TODO
		String result = "Post " + data;
		return Response.status(200).entity(result).build();
	}
	
	@PUT
	@Path("/music/{id}")
	public Response editMusic(@PathParam("id") String id, @QueryParam("data") String data){
//		TODO
		String result = "PUT: id; " + id + "\n "+ data;
		return Response.status(200).entity("").build();
	}
	
	@DELETE
	@Path("/music/{id}")
	public Response deleteMusic(@PathParam("id") String id){
//		TODO
		String result = "Delete Id: " + id;
		return Response.status(200).entity(result).build();
	}
	

}