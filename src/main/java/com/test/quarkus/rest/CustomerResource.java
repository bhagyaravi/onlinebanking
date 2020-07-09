package com.test.quarkus.rest;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;

import com.test.quarkus.model.Customer;

@Path("/customer")
public class CustomerResource {
	

	
	
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String hello() {
	        return "hello customer";
	    }
	    @GET
	    @Path("/list")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getAllCustomers() {
	        return Response.ok(Customer.findAll()).build();
	    }
	    
	    @POST
	    @Path("/create")
	    @Transactional
	    public Response createVehicle(@RequestBody Customer customer) {
	    	System.out.println("Customer details are :" + customer.getCustName());
	    	customer.persist();
	    	return Response.ok(customer).status(201).build();
	    }
	
}
