package jp.co.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jp.co.example.service.GreetingService;

@Path("/hello")
public class GreetingResource {

    GreetingService service;

    @Inject
    GreetingResource(GreetingService service) {
        this.service = service;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.getMessage();
    }
}
