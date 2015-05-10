package com.eclinic.rest.resources;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.eclinic.db.model.SystemUser;
import com.eclinic.db.query.SystemUserQuery;
import com.eclinic.modules.user.mangament.UserService;

@Named
@Path("/add")
public class HelloRestService {

	private SystemUserQuery systemUserQuery;
	@Autowired
	private UserService userService;

	@POST
	@Path("/user")
	@Produces({ MediaType.APPLICATION_JSON })	
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addUser(SystemUser user) {
		systemUserQuery.addUser(user);
		return Response.ok(user).build();
	}
	

	@POST
	@Path("/admin")
	@Produces({ MediaType.APPLICATION_JSON })	
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addAdmin(SystemUser user) {
		Map<String, String> response = new HashMap<String,String>();
		if(userService.addAdmin(user)){
			response.put("status", "dodano");
		} else{
			response.put("status", "nie dodano");
		}
		return Response.ok(response).build();
	}
	
	@POST
	@Path("/doctor")
	@Produces({ MediaType.APPLICATION_JSON })	
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addDoctor(SystemUser user) {
		Map<String, String> response = new HashMap<String,String>();
		if(userService.addAdmin(user)){
			response.put("status", "dodano");
		} else{
			response.put("status", "nie dodano");
		}
		return Response.ok(response).build();
	}
	
	
	@POST
	@Path("/patient")
	@Produces({ MediaType.APPLICATION_JSON })	
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addPatient(SystemUser user) {
		Map<String, String> response = new HashMap<String,String>();
		if(userService.addPatient(user)){
			response.put("status", "dodano");
		} else{
			response.put("status", "nie dodano");
		}
		return Response.ok(response).build();
	}

	
	public SystemUserQuery getSystemUserQuery() {
		return systemUserQuery;
	}

	public void setSystemUserQuery(SystemUserQuery systemUserQuery) {
		this.systemUserQuery = systemUserQuery;
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}