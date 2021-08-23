package com.consultorjava.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hola")
public class HolaResource {

	private static org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger(HolaResource.class);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		logger.info("metodo hello");
		return "hello";
	}
}